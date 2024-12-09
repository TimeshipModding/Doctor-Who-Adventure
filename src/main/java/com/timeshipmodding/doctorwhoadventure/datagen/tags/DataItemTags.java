package com.timeshipmodding.doctorwhoadventure.datagen.tags;

import com.timeshipmodding.doctorwhoadventure.DoctorWhoAdventure;
import com.timeshipmodding.doctorwhoadventure.util.tags.registry.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks.*;

public class DataItemTags extends ItemTagsProvider {
    public DataItemTags(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, DoctorWhoAdventure.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Minecraft Tags
        tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(GALLIFREY_COBBLESTONE.asItem())
                .add(GALLIFREY_COBBLED_DEEPSLATE.asItem());
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(GALLIFREY_COBBLESTONE.asItem())
                .add(GALLIFREY_COBBLED_DEEPSLATE.asItem());
        tag(ItemTags.STAIRS)
                .add(GALLIFREY_STONE_STAIRS.asItem())
                .add(GALLIFREY_COBBLESTONE_STAIRS.asItem())
                .add(GALLIFREY_STONE_BRICK_STAIRS.asItem())
                .add(GALLIFREY_COBBLED_DEEPSLATE_STAIRS.asItem())
                .add(GALLIFREY_POLISHED_DEEPSLATE_STAIRS.asItem())
                .add(GALLIFREY_DEEPSLATE_BRICK_STAIRS.asItem())
                .add(GALLIFREY_DEEPSLATE_TILE_STAIRS.asItem());
        tag(ItemTags.SLABS)
                .add(GALLIFREY_STONE_SLAB.asItem())
                .add(GALLIFREY_SMOOTH_STONE.asItem())
                .add(GALLIFREY_COBBLESTONE_SLAB.asItem())
                .add(GALLIFREY_STONE_BRICK_SLAB.asItem())
                .add(GALLIFREY_COBBLED_DEEPSLATE_SLAB.asItem())
                .add(GALLIFREY_POLISHED_DEEPSLATE_SLAB.asItem())
                .add(GALLIFREY_DEEPSLATE_BRICK_SLAB.asItem())
                .add(GALLIFREY_DEEPSLATE_TILE_SLAB.asItem());
        tag(ItemTags.WALLS)
                .add(GALLIFREY_COBBLESTONE.asItem())
                .add(GALLIFREY_STONE_BRICK_WALL.asItem())
                .add(GALLIFREY_COBBLED_DEEPSLATE_WALL.asItem())
                .add(GALLIFREY_POLISHED_DEEPSLATE_WALL.asItem())
                .add(GALLIFREY_DEEPSLATE_BRICK_WALL.asItem())
                .add(GALLIFREY_DEEPSLATE_TILE_WALL.asItem());
        tag(ItemTags.BUTTONS)
                .add(GALLIFREY_STONE_BUTTON.asItem());
        tag(ItemTags.STONE_BUTTONS)
                .add(GALLIFREY_STONE_BUTTON.asItem());
        tag(ItemTags.DIRT)
                .add(GALLIFREY_GRASS_BLOCK.asItem())
                .add(GALLIFREY_DIRT.asItem());

        // Neoforge Tags
        tag(Tags.Items.COBBLESTONES)
                .add(GALLIFREY_COBBLESTONE.asItem())
                .add(GALLIFREY_COBBLED_DEEPSLATE.asItem());
        tag(Tags.Items.STONES)
                .add(GALLIFREY_STONE.asItem())
                .add(GALLIFREY_DEEPSLATE.asItem());

        // Doctor Who Adventure Tags
        tag(ModItemTags.GALLIFREY_STONE_BRICKS)
                .add(GALLIFREY_STONE_BRICKS.asItem())
                .add(GALLIFREY_CRACKED_STONE_BRICKS.asItem());
    }
}