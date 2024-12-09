package com.timeshipmodding.doctorwhoadventure.datagen.loot;

import com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

import static com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks.*;

public class DataBlockLootTables extends BlockLootSubProvider {
    public DataBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        // Drop Self
        dropSelf(GALLIFREY_COBBLESTONE.get());
        dropSelf(GALLIFREY_SMOOTH_STONE.get());
        dropSelf(GALLIFREY_STONE_BRICKS.get());
        dropSelf(GALLIFREY_CRACKED_STONE_BRICKS.get());
        dropSelf(GALLIFREY_DIRT.get());
        dropSelf(GALLIFREY_STONE_STAIRS.get());
        dropSelf(GALLIFREY_STONE_PRESSURE_PLATE.get());
        dropSelf(GALLIFREY_STONE_BUTTON.get());
        dropSelf(GALLIFREY_COBBLESTONE_STAIRS.get());
        dropSelf(GALLIFREY_STONE_BRICK_STAIRS.get());
        dropSelf(GALLIFREY_COBBLESTONE_WALL.get());
        dropSelf(GALLIFREY_STONE_BRICK_WALL.get());
        dropSelf(GALLIFREY_COBBLED_DEEPSLATE.get());
        dropSelf(GALLIFREY_COBBLED_DEEPSLATE_STAIRS.get());
        dropSelf(GALLIFREY_COBBLED_DEEPSLATE_WALL.get());
        dropSelf(GALLIFREY_POLISHED_DEEPSLATE.get());
        dropSelf(GALLIFREY_POLISHED_DEEPSLATE_STAIRS.get());
        dropSelf(GALLIFREY_POLISHED_DEEPSLATE_WALL.get());
        dropSelf(GALLIFREY_DEEPSLATE_BRICKS.get());
        dropSelf(GALLIFREY_DEEPSLATE_BRICK_STAIRS.get());
        dropSelf(GALLIFREY_DEEPSLATE_BRICK_WALL.get());
        dropSelf(GALLIFREY_CRACKED_DEEPSLATE_BRICKS.get());
        dropSelf(GALLIFREY_DEEPSLATE_TILES.get());
        dropSelf(GALLIFREY_DEEPSLATE_TILE_STAIRS.get());
        dropSelf(GALLIFREY_DEEPSLATE_TILE_WALL.get());
        dropSelf(GALLIFREY_CRACKED_DEEPSLATE_TILES.get());

        // Drop Other
        dropOther(GALLIFREY_FARMLAND.get(), GALLIFREY_DIRT);
        dropOther(GALLIFREY_DIRT_PATH.get(), GALLIFREY_DIRT);

        // Silk Touch
        this.add(GALLIFREY_STONE.get(), block -> this.createSingleItemTableWithSilkTouch(block, GALLIFREY_COBBLESTONE));
        this.add(GALLIFREY_GRASS_BLOCK.get(), block -> this.createSingleItemTableWithSilkTouch(block, GALLIFREY_COBBLESTONE));
        this.add(GALLIFREY_DEEPSLATE.get(), block -> this.createSingleItemTableWithSilkTouch(block, GALLIFREY_COBBLED_DEEPSLATE));

        // Slab Table
        this.add(GALLIFREY_STONE_SLAB.get(), block -> this.createSlabItemTable(GALLIFREY_STONE_SLAB.get()));
        this.add(GALLIFREY_SMOOTH_STONE_SLAB.get(), block -> this.createSlabItemTable(GALLIFREY_SMOOTH_STONE_SLAB.get()));
        this.add(GALLIFREY_COBBLESTONE_SLAB.get(), block -> this.createSlabItemTable(GALLIFREY_COBBLESTONE_SLAB.get()));
        this.add(GALLIFREY_STONE_BRICK_SLAB.get(), block -> this.createSlabItemTable(GALLIFREY_STONE_BRICK_SLAB.get()));
        this.add(GALLIFREY_COBBLED_DEEPSLATE_SLAB.get(), block -> this.createSlabItemTable(GALLIFREY_COBBLED_DEEPSLATE_SLAB.get()));
        this.add(GALLIFREY_POLISHED_DEEPSLATE_SLAB.get(), block -> this.createSlabItemTable(GALLIFREY_POLISHED_DEEPSLATE_SLAB.get()));
        this.add(GALLIFREY_DEEPSLATE_BRICK_SLAB.get(), block -> this.createSlabItemTable(GALLIFREY_DEEPSLATE_BRICK_SLAB.get()));
        this.add(GALLIFREY_DEEPSLATE_TILE_SLAB.get(), block -> this.createSlabItemTable(GALLIFREY_DEEPSLATE_TILE_SLAB.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModGallifreyBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
