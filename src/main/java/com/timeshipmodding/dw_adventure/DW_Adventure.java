package com.timeshipmodding.dw_adventure;

import com.mojang.logging.LogUtils;
import com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks;
import com.timeshipmodding.dw_adventure.content.item.registries.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DW_Adventure.MODID)
public class DW_Adventure {
    public static final String MODID = "dw_adventure";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DW_Adventure() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Forge Event Bus
        MinecraftForge.EVENT_BUS.register(this);

        // Register the Registry Classes
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
    }

}