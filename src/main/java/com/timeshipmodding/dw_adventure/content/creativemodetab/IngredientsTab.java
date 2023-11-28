package com.timeshipmodding.dw_adventure.content.creativemodetab;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.dw_adventure.content.item.registries.ModItems.*;
import static com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks.*;

public class IngredientsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DW_Adventure.MODID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("ingredients_tab", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("creativemodetab.dw_adventure.ingredients_tab"))
                    .icon(() -> new ItemStack(RAW_ARTRON_BOTTLE.get()))
                    // Add items to tab
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(RAW_ARTRON_BOTTLE.get());
                    })
                    .build());
}

