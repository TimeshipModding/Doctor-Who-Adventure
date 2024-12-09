package com.timeshipmodding.doctorwhoadventure.datagen;

import com.timeshipmodding.doctorwhoadventure.DoctorWhoAdventure;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static com.timeshipmodding.doctorwhoadventure.content.item.registry.ModItems.*;
import static com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks.*;

public class DataItemModels extends ItemModelProvider {
    public DataItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DoctorWhoAdventure.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Button Item
        buttonItem(GALLIFREY_STONE_BUTTON, GALLIFREY_STONE);

        // Wall Item
        wallItem(GALLIFREY_COBBLESTONE_WALL, GALLIFREY_COBBLESTONE);
        wallItem(GALLIFREY_STONE_BRICK_WALL, GALLIFREY_STONE_BRICKS);
        wallItem(GALLIFREY_COBBLED_DEEPSLATE_WALL, GALLIFREY_COBBLED_DEEPSLATE);
        wallItem(GALLIFREY_POLISHED_DEEPSLATE_WALL, GALLIFREY_POLISHED_DEEPSLATE);
        wallItem(GALLIFREY_DEEPSLATE_BRICK_WALL, GALLIFREY_DEEPSLATE_BRICKS);
        wallItem(GALLIFREY_DEEPSLATE_TILE_WALL, GALLIFREY_DEEPSLATE_TILES);
    }

    // Generate Methods
    public void buttonItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DoctorWhoAdventure.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(DoctorWhoAdventure.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
