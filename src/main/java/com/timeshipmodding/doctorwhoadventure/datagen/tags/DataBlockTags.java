package com.timeshipmodding.doctorwhoadventure.datagen.tags;

import com.timeshipmodding.doctorwhoadventure.DoctorWhoAdventure;
import com.timeshipmodding.doctorwhoadventure.util.tags.registry.ModBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks.*;

public class DataBlockTags extends BlockTagsProvider {
    public DataBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DoctorWhoAdventure.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Minecraft Tags
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(GALLIFREY_STONE.get())
                .add(GALLIFREY_STONE_STAIRS.get())
                .add(GALLIFREY_STONE_SLAB.get())
                .add(GALLIFREY_STONE_PRESSURE_PLATE.get())
                .add(GALLIFREY_STONE_BUTTON.get())
                .add(GALLIFREY_COBBLESTONE.get())
                .add(GALLIFREY_SMOOTH_STONE.get())
                .add(GALLIFREY_STONE_BRICKS.get())
                .add(GALLIFREY_CRACKED_STONE_BRICKS.get())
                .add(GALLIFREY_SMOOTH_STONE_SLAB.get())
                .add(GALLIFREY_COBBLESTONE_STAIRS.get())
                .add(GALLIFREY_COBBLESTONE_SLAB.get())
                .add(GALLIFREY_STONE_BRICK_STAIRS.get())
                .add(GALLIFREY_STONE_BRICK_SLAB.get())
                .add(GALLIFREY_COBBLESTONE_WALL.get())
                .add(GALLIFREY_STONE_BRICK_WALL.get())
                .add(GALLIFREY_DEEPSLATE.get())
                .add(GALLIFREY_COBBLED_DEEPSLATE.get())
                .add(GALLIFREY_COBBLED_DEEPSLATE_STAIRS.get())
                .add(GALLIFREY_COBBLED_DEEPSLATE_SLAB.get())
                .add(GALLIFREY_COBBLED_DEEPSLATE_WALL.get())
                .add(GALLIFREY_POLISHED_DEEPSLATE.get())
                .add(GALLIFREY_POLISHED_DEEPSLATE_STAIRS.get())
                .add(GALLIFREY_POLISHED_DEEPSLATE_SLAB.get())
                .add(GALLIFREY_POLISHED_DEEPSLATE_WALL.get())
                .add(GALLIFREY_DEEPSLATE_BRICKS.get())
                .add(GALLIFREY_DEEPSLATE_BRICK_STAIRS.get())
                .add(GALLIFREY_DEEPSLATE_BRICK_SLAB.get())
                .add(GALLIFREY_DEEPSLATE_BRICK_WALL.get())
                .add(GALLIFREY_CRACKED_DEEPSLATE_BRICKS.get())
                .add(GALLIFREY_DEEPSLATE_TILES.get())
                .add(GALLIFREY_DEEPSLATE_TILE_STAIRS.get())
                .add(GALLIFREY_DEEPSLATE_TILE_SLAB.get())
                .add(GALLIFREY_DEEPSLATE_TILE_WALL.get())
                .add(GALLIFREY_CRACKED_DEEPSLATE_TILES.get());
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(GALLIFREY_GRASS_BLOCK.get())
                .add(GALLIFREY_DIRT_PATH.get())
                .add(GALLIFREY_DIRT.get())
                .add(GALLIFREY_FARMLAND.get());
        tag(BlockTags.SCULK_REPLACEABLE)
                .add(GALLIFREY_STONE.get())
                .add(GALLIFREY_GRASS_BLOCK.get())
                .add(GALLIFREY_DIRT.get())
                .add(GALLIFREY_DEEPSLATE.get());
        tag(BlockTags.STAIRS)
                .add(GALLIFREY_STONE_STAIRS.get())
                .add(GALLIFREY_COBBLESTONE_STAIRS.get())
                .add(GALLIFREY_STONE_BRICK_STAIRS.get())
                .add(GALLIFREY_COBBLED_DEEPSLATE_STAIRS.get())
                .add(GALLIFREY_POLISHED_DEEPSLATE_STAIRS.get())
                .add(GALLIFREY_DEEPSLATE_BRICK_STAIRS.get())
                .add(GALLIFREY_DEEPSLATE_TILE_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(GALLIFREY_STONE_SLAB.get())
                .add(GALLIFREY_SMOOTH_STONE_SLAB.get())
                .add(GALLIFREY_COBBLESTONE_SLAB.get())
                .add(GALLIFREY_STONE_BRICK_SLAB.get())
                .add(GALLIFREY_COBBLED_DEEPSLATE_SLAB.get())
                .add(GALLIFREY_POLISHED_DEEPSLATE_SLAB.get())
                .add(GALLIFREY_DEEPSLATE_BRICK_SLAB.get())
                .add(GALLIFREY_DEEPSLATE_TILE_SLAB.get());
        tag(BlockTags.WALLS)
                .add(GALLIFREY_COBBLESTONE_WALL.get())
                .add(GALLIFREY_STONE_BRICK_WALL.get())
                .add(GALLIFREY_COBBLED_DEEPSLATE_WALL.get())
                .add(GALLIFREY_POLISHED_DEEPSLATE_WALL.get())
                .add(GALLIFREY_DEEPSLATE_BRICK_WALL.get())
                .add(GALLIFREY_DEEPSLATE_TILE_WALL.get());
        tag(BlockTags.WALL_POST_OVERRIDE)
                .add(GALLIFREY_STONE_PRESSURE_PLATE.get());
        tag(BlockTags.PRESSURE_PLATES)
                .add(GALLIFREY_STONE_PRESSURE_PLATE.get());
        tag(BlockTags.STONE_PRESSURE_PLATES)
                .add(GALLIFREY_STONE_PRESSURE_PLATE.get());
        tag(BlockTags.STONE_BUTTONS)
                .add(GALLIFREY_STONE_BUTTON.get());
        tag(BlockTags.BUTTONS)
                .add(GALLIFREY_STONE_BUTTON.get());
        tag(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(GALLIFREY_GRASS_BLOCK.get());
        tag(BlockTags.VALID_SPAWN)
                .add(GALLIFREY_GRASS_BLOCK.get());
        tag(BlockTags.DIRT)
                .add(GALLIFREY_GRASS_BLOCK.get())
                .add(GALLIFREY_DIRT.get());
        tag(BlockTags.ENDERMAN_HOLDABLE)
                .add(GALLIFREY_GRASS_BLOCK.get())
                .add(GALLIFREY_DIRT.get());
        tag(BlockTags.AZALEA_ROOT_REPLACEABLE)
                .add(GALLIFREY_STONE.get())
                .add(GALLIFREY_GRASS_BLOCK.get())
                .add(GALLIFREY_DIRT.get())
                .add(GALLIFREY_DEEPSLATE.get());
        tag(BlockTags.MOSS_REPLACEABLE)
                .add(GALLIFREY_STONE.get())
                .add(GALLIFREY_GRASS_BLOCK.get())
                .add(GALLIFREY_DIRT.get())
                .add(GALLIFREY_DEEPSLATE.get());
        tag(BlockTags.CONVERTABLE_TO_MUD)
                .add(GALLIFREY_DIRT.get());

        // Neoforge Tags
        tag(Tags.Blocks.VILLAGER_FARMLANDS)
                .add(GALLIFREY_FARMLAND.get());
        tag(Tags.Blocks.COBBLESTONES)
                .add(GALLIFREY_COBBLESTONE.get())
                .add(GALLIFREY_COBBLED_DEEPSLATE.get());
        tag(Tags.Blocks.STONES)
                .add(GALLIFREY_STONE.get())
                .add(GALLIFREY_DEEPSLATE.get());

        // Doctor Who Adventure Tags
        tag(ModBlockTags.GALLIFREY_STONE_BRICKS)
                .add(GALLIFREY_STONE_BRICKS.get())
                .add(GALLIFREY_CRACKED_STONE_BRICKS.get());
    }
}