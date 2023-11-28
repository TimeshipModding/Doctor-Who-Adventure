package com.timeshipmodding.dw_adventure.datagen;

import com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks;
import com.timeshipmodding.dw_adventure.providers.BlockLootTableProvider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

import static com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks.*;
public class BlockLootTables extends BlockLootSubProvider {
    public BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(GALLIFREY_DIRT.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
