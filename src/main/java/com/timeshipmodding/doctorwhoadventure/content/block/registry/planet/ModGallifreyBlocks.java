package com.timeshipmodding.doctorwhoadventure.content.block.registry.planet;

import com.timeshipmodding.doctorwhoadventure.DoctorWhoAdventure;
import com.timeshipmodding.doctorwhoadventure.content.block.planet.PlanetDirtBlock;
import com.timeshipmodding.doctorwhoadventure.content.block.planet.PlanetDirtPathBlock;
import com.timeshipmodding.doctorwhoadventure.content.block.planet.PlanetFarmBlock;
import com.timeshipmodding.doctorwhoadventure.content.block.planet.PlanetGrassBlock;
import com.timeshipmodding.doctorwhoadventure.content.block.registry.ModBlocks;
import com.timeshipmodding.doctorwhoadventure.content.item.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.timeshipmodding.doctorwhoadventure.content.block.registry.ModBlocks.*;

import java.util.function.Supplier;

public class ModGallifreyBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DoctorWhoAdventure.MODID);

    public static final DeferredBlock<Block> GALLIFREY_STONE = registerBlock("gallifrey_stone", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_COBBLESTONE = registerBlock("gallifrey_cobblestone", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_SMOOTH_STONE = registerBlock("gallifrey_smooth_stone", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_STONE_BRICKS = registerBlock("gallifrey_stone_bricks", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_CRACKED_STONE_BRICKS = registerBlock("gallifrey_cracked_stone_bricks", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_GRASS_BLOCK = registerBlock("gallifrey_grass_block", () -> new PlanetGrassBlock("gallifrey", BlockBehaviour.Properties.of().randomTicks().strength(0.6F).sound(SoundType.GRASS)));
    public static final DeferredBlock<Block> GALLIFREY_DIRT = registerBlock("gallifrey_dirt", () -> new PlanetDirtBlock("gallifrey", BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> GALLIFREY_FARMLAND = registerBlock("gallifrey_farmland", () -> new PlanetFarmBlock("gallifrey", BlockBehaviour.Properties.of().randomTicks().strength(0.6F).sound(SoundType.GRAVEL).isViewBlocking(ModGallifreyBlocks::always).isSuffocating(ModGallifreyBlocks::always)));
    public static final DeferredBlock<Block> GALLIFREY_DIRT_PATH = registerBlock("gallifrey_dirt_path", () -> new PlanetDirtPathBlock("gallifrey", BlockBehaviour.Properties.of().strength(0.65F).sound(SoundType.GRASS).isViewBlocking(ModGallifreyBlocks::always).isSuffocating(ModGallifreyBlocks::always)));
    public static final DeferredBlock<Block> GALLIFREY_STONE_STAIRS = registerBlock("gallifrey_stone_stairs", () -> new StairBlock(GALLIFREY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_STONE_SLAB = registerBlock("gallifrey_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_STONE_PRESSURE_PLATE = registerBlock("gallifrey_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GALLIFREY_STONE_BUTTON = registerBlock("gallifrey_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GALLIFREY_SMOOTH_STONE_SLAB = registerBlock("gallifrey_smooth_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_COBBLESTONE_STAIRS = registerBlock("gallifrey_cobblestone_stairs", () -> new StairBlock(GALLIFREY_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_COBBLESTONE_SLAB = registerBlock("gallifrey_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_STONE_BRICK_STAIRS = registerBlock("gallifrey_stone_brick_stairs", () -> new StairBlock(GALLIFREY_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_STONE_BRICK_SLAB = registerBlock("gallifrey_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> GALLIFREY_COBBLESTONE_WALL = registerBlock("gallifrey_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).forceSolidOn()));
    public static final DeferredBlock<Block> GALLIFREY_STONE_BRICK_WALL = registerBlock("gallifrey_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).forceSolidOn()));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE = registerBlock("gallifrey_deepslate", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> GALLIFREY_COBBLED_DEEPSLATE = registerBlock("gallifrey_cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> GALLIFREY_COBBLED_DEEPSLATE_STAIRS = registerBlock("gallifrey_cobbled_deepslate_stairs", () -> new StairBlock(GALLIFREY_COBBLED_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> GALLIFREY_COBBLED_DEEPSLATE_SLAB = registerBlock("gallifrey_cobbled_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> GALLIFREY_COBBLED_DEEPSLATE_WALL = registerBlock("gallifrey_cobbled_deepslate_wall", () -> new WallBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE).forceSolidOn()));
    public static final DeferredBlock<Block> GALLIFREY_POLISHED_DEEPSLATE = registerBlock("gallifrey_polished_deepslate", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final DeferredBlock<Block> GALLIFREY_POLISHED_DEEPSLATE_STAIRS = registerBlock("gallifrey_polished_deepslate_stairs", () -> new StairBlock(GALLIFREY_POLISHED_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final DeferredBlock<Block> GALLIFREY_POLISHED_DEEPSLATE_SLAB = registerBlock("gallifrey_polished_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final DeferredBlock<Block> GALLIFREY_POLISHED_DEEPSLATE_WALL = registerBlock("gallifrey_polished_deepslate_wall", () -> new WallBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE).forceSolidOn()));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE_BRICKS = registerBlock("gallifrey_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE_BRICK_STAIRS = registerBlock("gallifrey_deepslate_brick_stairs", () -> new StairBlock(GALLIFREY_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE_BRICK_SLAB = registerBlock("gallifrey_deepslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE_BRICK_WALL = registerBlock("gallifrey_deepslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS).forceSolidOn()));
    public static final DeferredBlock<Block> GALLIFREY_CRACKED_DEEPSLATE_BRICKS = registerBlock("gallifrey_cracked_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE_TILES = registerBlock("gallifrey_deepslate_tiles", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE_TILE_STAIRS = registerBlock("gallifrey_deepslate_tile_stairs", () -> new StairBlock(GALLIFREY_DEEPSLATE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE_TILE_SLAB = registerBlock("gallifrey_deepslate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> GALLIFREY_DEEPSLATE_TILE_WALL = registerBlock("gallifrey_deepslate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES).forceSolidOn()));
    public static final DeferredBlock<Block> GALLIFREY_CRACKED_DEEPSLATE_TILES = registerBlock("gallifrey_cracked_deepslate_tiles", () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));

    // Register Methods
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static boolean always(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return true;
    }
}