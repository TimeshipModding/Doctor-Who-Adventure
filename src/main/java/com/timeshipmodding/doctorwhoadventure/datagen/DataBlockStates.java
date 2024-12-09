package com.timeshipmodding.doctorwhoadventure.datagen;

import com.timeshipmodding.doctorwhoadventure.DoctorWhoAdventure;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks.*;

public class DataBlockStates extends BlockStateProvider {
    public DataBlockStates(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DoctorWhoAdventure.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Block with Item
        blockWithItem(GALLIFREY_COBBLESTONE);
        blockWithItem(GALLIFREY_SMOOTH_STONE);
        blockWithItem(GALLIFREY_STONE_BRICKS);
        blockWithItem(GALLIFREY_CRACKED_STONE_BRICKS);
        blockWithItem(GALLIFREY_DIRT);
        blockWithItem(GALLIFREY_COBBLED_DEEPSLATE);
        blockWithItem(GALLIFREY_POLISHED_DEEPSLATE);
        blockWithItem(GALLIFREY_DEEPSLATE_BRICKS);
        blockWithItem(GALLIFREY_CRACKED_DEEPSLATE_BRICKS);
        blockWithItem(GALLIFREY_DEEPSLATE_TILES);
        blockWithItem(GALLIFREY_CRACKED_DEEPSLATE_TILES);

        // Block Item
        blockItem(GALLIFREY_STONE_SLAB);
        blockItem(GALLIFREY_STONE_STAIRS);
        blockItem(GALLIFREY_GRASS_BLOCK);
        blockItem(GALLIFREY_FARMLAND);
        blockItem(GALLIFREY_DIRT_PATH);
        blockItem(GALLIFREY_STONE_PRESSURE_PLATE);
        blockItem(GALLIFREY_SMOOTH_STONE_SLAB);
        blockItem(GALLIFREY_COBBLESTONE_STAIRS);
        blockItem(GALLIFREY_STONE_BRICK_STAIRS);
        blockItem(GALLIFREY_COBBLESTONE_SLAB);
        blockItem(GALLIFREY_STONE_BRICK_SLAB);
        blockItem(GALLIFREY_STONE);
        blockItem(GALLIFREY_DEEPSLATE);
        blockItem(GALLIFREY_COBBLED_DEEPSLATE_STAIRS);
        blockItem(GALLIFREY_COBBLED_DEEPSLATE_SLAB);
        blockItem(GALLIFREY_POLISHED_DEEPSLATE_STAIRS);
        blockItem(GALLIFREY_POLISHED_DEEPSLATE_SLAB);
        blockItem(GALLIFREY_DEEPSLATE_BRICK_STAIRS);
        blockItem(GALLIFREY_DEEPSLATE_BRICK_SLAB);
        blockItem(GALLIFREY_DEEPSLATE_TILE_STAIRS);
        blockItem(GALLIFREY_DEEPSLATE_TILE_SLAB);

        // Stair Block
        stairsBlock(((StairBlock) GALLIFREY_STONE_STAIRS.get()), blockTexture(GALLIFREY_STONE.get()));
        stairsBlock(((StairBlock) GALLIFREY_COBBLESTONE_STAIRS.get()), blockTexture(GALLIFREY_COBBLESTONE.get()));
        stairsBlock(((StairBlock) GALLIFREY_STONE_BRICK_STAIRS.get()), blockTexture(GALLIFREY_STONE_BRICKS.get()));
        stairsBlock(((StairBlock) GALLIFREY_COBBLED_DEEPSLATE_STAIRS.get()), blockTexture(GALLIFREY_COBBLED_DEEPSLATE.get()));
        stairsBlock(((StairBlock) GALLIFREY_POLISHED_DEEPSLATE_STAIRS.get()), blockTexture(GALLIFREY_POLISHED_DEEPSLATE.get()));
        stairsBlock(((StairBlock) GALLIFREY_DEEPSLATE_BRICK_STAIRS.get()), blockTexture(GALLIFREY_DEEPSLATE_BRICKS.get()));
        stairsBlock(((StairBlock) GALLIFREY_DEEPSLATE_TILE_STAIRS.get()), blockTexture(GALLIFREY_DEEPSLATE_TILES.get()));

        // Slab Block
        slabBlock(((SlabBlock) GALLIFREY_STONE_SLAB.get()), blockTexture(GALLIFREY_STONE.get()), blockTexture(GALLIFREY_STONE.get()));
        slabBlock(((SlabBlock) GALLIFREY_SMOOTH_STONE_SLAB.get()), blockTexture(GALLIFREY_SMOOTH_STONE.get()), blockTexture(GALLIFREY_SMOOTH_STONE.get()));
        slabBlock(((SlabBlock) GALLIFREY_COBBLESTONE_SLAB.get()), blockTexture(GALLIFREY_COBBLESTONE.get()), blockTexture(GALLIFREY_COBBLESTONE.get()));
        slabBlock(((SlabBlock) GALLIFREY_STONE_BRICK_SLAB.get()), blockTexture(GALLIFREY_STONE_BRICKS.get()), blockTexture(GALLIFREY_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) GALLIFREY_COBBLED_DEEPSLATE_SLAB.get()), blockTexture(GALLIFREY_COBBLED_DEEPSLATE.get()), blockTexture(GALLIFREY_COBBLED_DEEPSLATE.get()));
        slabBlock(((SlabBlock) GALLIFREY_POLISHED_DEEPSLATE_SLAB.get()), blockTexture(GALLIFREY_POLISHED_DEEPSLATE.get()), blockTexture(GALLIFREY_POLISHED_DEEPSLATE.get()));
        slabBlock(((SlabBlock) GALLIFREY_DEEPSLATE_BRICK_SLAB.get()), blockTexture(GALLIFREY_DEEPSLATE_BRICKS.get()), blockTexture(GALLIFREY_DEEPSLATE_BRICKS.get()));
        slabBlock(((SlabBlock) GALLIFREY_DEEPSLATE_TILE_SLAB.get()), blockTexture(GALLIFREY_DEEPSLATE_TILES.get()), blockTexture(GALLIFREY_DEEPSLATE_TILES.get()));

        // Wall Block
        wallBlock(((WallBlock) GALLIFREY_COBBLESTONE_WALL.get()), blockTexture(GALLIFREY_COBBLESTONE.get()));
        wallBlock(((WallBlock) GALLIFREY_STONE_BRICK_WALL.get()), blockTexture(GALLIFREY_STONE_BRICKS.get()));
        wallBlock(((WallBlock) GALLIFREY_COBBLED_DEEPSLATE_WALL.get()), blockTexture(GALLIFREY_COBBLED_DEEPSLATE.get()));
        wallBlock(((WallBlock) GALLIFREY_POLISHED_DEEPSLATE_WALL.get()), blockTexture(GALLIFREY_POLISHED_DEEPSLATE.get()));
        wallBlock(((WallBlock) GALLIFREY_DEEPSLATE_BRICK_WALL.get()), blockTexture(GALLIFREY_DEEPSLATE_BRICKS.get()));
        wallBlock(((WallBlock) GALLIFREY_DEEPSLATE_TILE_WALL.get()), blockTexture(GALLIFREY_DEEPSLATE_TILES.get()));

        // Button Block
        buttonBlock(((ButtonBlock) GALLIFREY_STONE_BUTTON.get()), blockTexture(GALLIFREY_STONE.get()));

        // Pressure Plate Block
        pressurePlateBlock(((PressurePlateBlock) GALLIFREY_STONE_PRESSURE_PLATE.get()), blockTexture(GALLIFREY_STONE.get()));
    }

    // Generate Methods
    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("doctorwhoadventure:block/" + deferredBlock.getId().getPath()));
    }
}
