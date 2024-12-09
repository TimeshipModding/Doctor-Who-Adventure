package com.timeshipmodding.doctorwhoadventure.content.block.planet;

import com.mojang.serialization.MapCodec;
import com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PlanetDirtPathBlock extends Block {
    public static final MapCodec<DirtPathBlock> CODEC = simpleCodec(DirtPathBlock::new);
    protected static final VoxelShape SHAPE = PlanetFarmBlock.SHAPE;
    public String planet;

    @Override
    public MapCodec<DirtPathBlock> codec() {
        return CODEC;
    }

    public PlanetDirtPathBlock(String planet, BlockBehaviour.Properties properties) {
        super(properties);
        this.planet = planet;
    }

    public static Block getDirtBlock(String planet) {
        if (planet.equals("gallifrey")) {
            return ModGallifreyBlocks.GALLIFREY_DIRT.get();
        }
        return null;
    }

    @Override
    protected boolean useShapeForLightOcclusion(BlockState blockState) {
        return true;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return !this.defaultBlockState().canSurvive(blockPlaceContext.getLevel(), blockPlaceContext.getClickedPos())
                ? Block.pushEntitiesUp(this.defaultBlockState(), getDirtBlock(planet).defaultBlockState(), blockPlaceContext.getLevel(), blockPlaceContext.getClickedPos())
                : super.getStateForPlacement(blockPlaceContext);
    }

    @Override
    protected BlockState updateShape(
            BlockState blockState1, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos1, BlockPos blockPos2
    ) {
        if (direction == Direction.UP && !blockState1.canSurvive(levelAccessor, blockPos1)) {
            levelAccessor.scheduleTick(blockPos1, this, 1);
        }

        return super.updateShape(blockState1, direction, blockState2, levelAccessor, blockPos1, blockPos2);
    }

    @Override
    protected void tick(BlockState blockState, ServerLevel level, BlockPos blockPos, RandomSource source) {
        PlanetFarmBlock.turnToDirt(null, blockState, level, blockPos, planet);
    }

    @Override
    protected boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        BlockState blockstate = levelReader.getBlockState(blockPos.above());
        return !blockstate.isSolid() || blockstate.getBlock() instanceof FenceGateBlock;
    }

    @Override
    protected VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean isPathfindable(BlockState blockState, PathComputationType type) {
        return false;
    }
}