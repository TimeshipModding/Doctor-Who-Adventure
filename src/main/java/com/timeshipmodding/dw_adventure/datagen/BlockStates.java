package com.timeshipmodding.dw_adventure.datagen;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks.*;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.FACING;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DW_Adventure.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Block With Item
        blockWithItem(GALLIFREY_GRAVEL);
        blockWithItem(GALLIFREY_COBBLESTONE);
        blockWithItem(GALLIFREY_COBBLED_DEEPSLATE);
        blockWithItem(GALLIFREY_CLAY);

        // Simple Block Random Rotation
        simpleBlock(GALLIFREY_DIRT.get(), cubeRandomRotation(GALLIFREY_DIRT.get(), ""));
        simpleBlock(GALLIFREY_SAND.get(), cubeRandomRotation(GALLIFREY_SAND.get(), ""));

        // Block Items
        blockItem(GALLIFREY_STONE);
        blockItem(GALLIFREY_DIRT_PATH);
        blockItem(GALLIFREY_SAND);
        blockItem(GALLIFREY_DEEPSLATE);
        blockItem(GALLIFREY_FARMLAND);
        blockItem(GALLIFREY_DIRT);
    }

    // Generate Methods
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    public ConfiguredModel[] cubeRandomRotation(Block block, String suffix) {
        String formattedName = blockName(block) + (suffix.isEmpty() ? "" : "_" + suffix);
        return ConfiguredModel.allYRotations(models().cubeAll(formattedName, resourceBlock(formattedName)), 0, false);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(DW_Adventure.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private String blockName(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(DW_Adventure.MODID, "block/" + path);
    }
}
