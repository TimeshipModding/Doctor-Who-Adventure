package com.timeshipmodding.dw_adventure.datagen;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks.*;

public class MinecraftBlockTags extends BlockTagsProvider {
    public MinecraftBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DW_Adventure.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(
                GALLIFREY_STONE.get(),
                GALLIFREY_COBBLESTONE.get(),
                GALLIFREY_DEEPSLATE.get(),
                GALLIFREY_COBBLED_DEEPSLATE.get()
        );

        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_SHOVEL).add(
                GALLIFREY_DIRT.get(),
                GALLIFREY_GRASS_BLOCK.get(),
                GALLIFREY_SAND.get(),
                GALLIFREY_GRAVEL.get()
        );
    }
}
