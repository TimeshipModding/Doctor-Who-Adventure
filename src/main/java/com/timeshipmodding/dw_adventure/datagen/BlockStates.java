package com.timeshipmodding.dw_adventure.datagen;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks.*;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DW_Adventure.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(GALLIFREY_DIRT);
        blockWithItem(GALLIFREY_GRASS_BLOCK);
        blockWithItem(GALLIFREY_STONE);
        blockWithItem(GALLIFREY_DEEPSLATE);
        blockWithItem(GALLIFREY_SAND);
        blockWithItem(GALLIFREY_GRAVEL);
        blockWithItem(GALLIFREY_COBBLESTONE);
        blockWithItem(GALLIFREY_COBBLED_DEEPSLATE);
    }

    // Generate Methods
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
