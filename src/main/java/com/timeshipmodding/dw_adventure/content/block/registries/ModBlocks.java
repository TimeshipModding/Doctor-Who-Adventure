package com.timeshipmodding.dw_adventure.content.block.registries;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import com.timeshipmodding.dw_adventure.content.item.registries.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GravelBlock;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DW_Adventure.MODID);

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }

    // Blocks
    public static final RegistryObject<Block> GALLIFREY_DIRT = registerBlock("gallifrey_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> GALLIFREY_GRASS_BLOCK = registerBlock("gallifrey_grass_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GALLIFREY_STONE = registerBlock("gallifrey_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GALLIFREY_DEEPSLATE = registerBlock("gallifrey_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GALLIFREY_SAND = registerBlock("gallifrey_sand", () -> new SandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> GALLIFREY_GRAVEL = registerBlock("gallifrey_gravel", () -> new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> GALLIFREY_COBBLESTONE = registerBlock("gallifrey_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GALLIFREY_COBBLED_DEEPSLATE = registerBlock("gallifrey_cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> GALLIFREY_MOUNTAIN_STONE = registerBlock("gallifrey_mountain_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(0.5F, 6.0F)));
    public static final RegistryObject<Block> GALLIFREY_MOUNTAIN_COBBLESTONE = registerBlock("gallifrey_mountain_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(1.0F, 6.0F)));

    // Register Methods
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
