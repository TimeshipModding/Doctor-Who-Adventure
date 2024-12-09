package com.timeshipmodding.doctorwhoadventure.content.block.planet;

import com.mojang.serialization.MapCodec;
import com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class PlanetGrassBlock extends PlanetSpreadingSnowyDirtBlock implements BonemealableBlock {
    public static final MapCodec<GrassBlock> CODEC = simpleCodec(GrassBlock::new);
    public String planet;

    @Override
    public MapCodec<GrassBlock> codec() {
        return CODEC;
    }

    public PlanetGrassBlock(String planet, BlockBehaviour.Properties properties) {
        super(planet, properties);
        this.planet = planet;
    }

    public Block getFarmBlock(String pPlanet) {
        if (pPlanet.equals("gallifrey")) {
            return ModGallifreyBlocks.GALLIFREY_FARMLAND.get();
        }
        return null;
    }

    public Block getDirtPathBlock(String pPlanet) {
        if (pPlanet.equals("gallifrey")) {
            return ModGallifreyBlocks.GALLIFREY_DIRT_PATH.get();
        }
        return null;
    }

    @Override
    @Nullable
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (itemAbility.equals(ItemAbilities.HOE_TILL) && context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
            return getFarmBlock(planet).defaultBlockState();
        } else if (itemAbility.equals(ItemAbilities.SHOVEL_FLATTEN) && context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
            return getDirtPathBlock(planet).defaultBlockState();
        }
        return null;
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return levelReader.getBlockState(blockPos.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource source, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource source, BlockPos blockPos, BlockState blockState) {
        BlockPos blockpos = blockPos.above();
        BlockState blockstate = Blocks.SHORT_GRASS.defaultBlockState();
        Optional<Holder.Reference<PlacedFeature>> optional = level.registryAccess()
                .registryOrThrow(Registries.PLACED_FEATURE)
                .getHolder(VegetationPlacements.GRASS_BONEMEAL);

        label49:
        for (int i = 0; i < 128; i++) {
            BlockPos blockpos1 = blockpos;

            for (int j = 0; j < i / 16; j++) {
                blockpos1 = blockpos1.offset(source.nextInt(3) - 1, (source.nextInt(3) - 1) * source.nextInt(3) / 2, source.nextInt(3) - 1);
                if (!level.getBlockState(blockpos1.below()).is(this) || level.getBlockState(blockpos1).isCollisionShapeFullBlock(level, blockpos1)) {
                    continue label49;
                }
            }

            BlockState blockstate1 = level.getBlockState(blockpos1);
            if (blockstate1.is(blockstate.getBlock()) && source.nextInt(10) == 0) {
                ((BonemealableBlock) blockstate.getBlock()).performBonemeal(level, source, blockpos1, blockstate1);
            }

            if (blockstate1.isAir()) {
                Holder<PlacedFeature> holder;
                if (source.nextInt(8) == 0) {
                    List<ConfiguredFeature<?, ?>> list = level.getBiome(blockpos1).value().getGenerationSettings().getFlowerFeatures();
                    if (list.isEmpty()) {
                        continue;
                    }

                    holder = ((RandomPatchConfiguration) list.get(0).config()).feature();
                } else {
                    if (!optional.isPresent()) {
                        continue;
                    }

                    holder = optional.get();
                }

                holder.value().place(level, level.getChunkSource().getGenerator(), source, blockpos1);
            }
        }
    }

    @Override
    public BonemealableBlock.Type getType() {
        return BonemealableBlock.Type.NEIGHBOR_SPREADER;
    }
}