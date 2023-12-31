package com.timeshipmodding.dw_adventure.datagen;

import com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

import static com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.dw_adventure.content.item.registries.ModItems.*;
public class BlockLootTables extends BlockLootSubProvider {
    public BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // Drop Self LootTables
        this.dropSelf(GALLIFREY_DIRT.get());
        this.dropSelf(GALLIFREY_SAND.get());
        this.dropSelf(GALLIFREY_COBBLESTONE.get());
        this.dropSelf(GALLIFREY_COBBLED_DEEPSLATE.get());

        // Drop Other LootTables
        this.dropOther(GALLIFREY_DIRT_PATH.get(), GALLIFREY_DIRT.get());
        this.dropOther(GALLIFREY_FARMLAND.get(), GALLIFREY_DIRT.get());

        // Single Item Silk Touch LootTables
        this.add(GALLIFREY_STONE.get(), pBlock -> {return this.createSingleItemTableWithSilkTouch(pBlock, GALLIFREY_COBBLESTONE.get());});
        this.add(GALLIFREY_DEEPSLATE.get(), pBlock -> {return this.createSingleItemTableWithSilkTouch(pBlock, GALLIFREY_DEEPSLATE.get());});
        this.add(GALLIFREY_CLAY.get(), pBlock -> {return this.createSingleItemTableWithSilkTouch(pBlock, GALLIFREY_CLAY_BALL.get(), ConstantValue.exactly(4.0F));});

        /// Silk Touch Dispatch LootTables
        this.add(GALLIFREY_GRAVEL.get(), pBlock -> {return createSilkTouchDispatchTable(pBlock, this.applyExplosionCondition(pBlock, LootItem.lootTableItem(Items.FLINT).when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.1F, 0.14285715F, 0.25F, 1.0F)).otherwise(LootItem.lootTableItem(pBlock))));});
    }

    // Generate Methods
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
