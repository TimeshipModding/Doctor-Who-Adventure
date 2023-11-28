package com.timeshipmodding.dw_adventure.content.block.registries;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import com.timeshipmodding.dw_adventure.content.item.registries.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
    public static final RegistryObject<Block> GALLIFREY_DIRT
            = registerBlock("gallifrey_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
