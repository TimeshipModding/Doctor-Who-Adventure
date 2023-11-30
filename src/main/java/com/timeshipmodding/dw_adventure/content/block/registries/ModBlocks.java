package com.timeshipmodding.dw_adventure.content.block.registries;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import com.timeshipmodding.dw_adventure.content.block.PlanetDirtBlock;
import com.timeshipmodding.dw_adventure.content.block.PlanetFarmBlock;
import com.timeshipmodding.dw_adventure.content.item.registries.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
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
    public static final RegistryObject<Block> GALLIFREY_DIRT = registerBlock("gallifrey_dirt", () -> new PlanetDirtBlock("gallifrey", BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> GALLIFREY_STONE = registerBlock("gallifrey_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GALLIFREY_DEEPSLATE = registerBlock("gallifrey_deepslate", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GALLIFREY_SAND = registerBlock("gallifrey_sand", () -> new SandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> GALLIFREY_GRAVEL = registerBlock("gallifrey_gravel", () -> new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> GALLIFREY_COBBLESTONE = registerBlock("gallifrey_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GALLIFREY_COBBLED_DEEPSLATE = registerBlock("gallifrey_cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> GALLIFREY_CLAY = registerBlock("gallifrey_clay", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));
    public static final RegistryObject<Block> GALLIFREY_DIRT_PATH = registerBlock("gallifrey_dirt_path", () -> new DirtPathBlock(BlockBehaviour.Properties.copy(Blocks.DIRT_PATH)));
    public static final RegistryObject<Block> GALLIFREY_FARMLAND = registerBlock("gallifrey_farmland", () -> new PlanetFarmBlock("gallifrey", BlockBehaviour.Properties.copy(Blocks.FARMLAND)));

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
