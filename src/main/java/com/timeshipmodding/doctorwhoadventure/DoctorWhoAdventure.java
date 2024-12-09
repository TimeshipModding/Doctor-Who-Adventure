package com.timeshipmodding.doctorwhoadventure;

import com.timeshipmodding.doctorwhoadventure.content.block.registry.ModBlocks;
import com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks;
import com.timeshipmodding.doctorwhoadventure.content.creativetab.PlanetBlocksTab;
import com.timeshipmodding.doctorwhoadventure.content.item.registry.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(DoctorWhoAdventure.MODID)
public class DoctorWhoAdventure
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "doctorwhoadventure";

    public DoctorWhoAdventure(IEventBus modEventBus)
    {
        // Register registry classes
        ModBlocks.BLOCKS.register(modEventBus);
        ModGallifreyBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        // Register creative mode tab
        PlanetBlocksTab.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
