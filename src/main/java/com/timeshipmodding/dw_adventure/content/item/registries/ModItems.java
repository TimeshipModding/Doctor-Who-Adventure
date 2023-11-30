package com.timeshipmodding.dw_adventure.content.item.registries;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DW_Adventure.MODID);

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    public static final RegistryObject<Item> GALLIFREY_CLAY_BALL = ITEMS.register("gallifrey_clay_ball", () -> new Item(new Item.Properties()));


}

