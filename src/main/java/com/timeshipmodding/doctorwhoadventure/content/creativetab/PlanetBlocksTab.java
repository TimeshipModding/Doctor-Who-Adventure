package com.timeshipmodding.doctorwhoadventure.content.creativetab;

import com.timeshipmodding.doctorwhoadventure.DoctorWhoAdventure;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks.*;

public class PlanetBlocksTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DoctorWhoAdventure.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PLANET_BLOCKS_TAB = CREATIVE_MODE_TABS.register("planet_blocks_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.doctorwhoadventure.planet_blocks_tab"))
            .icon(() -> new ItemStack(GALLIFREY_STONE))
            .displayItems((parameters, pOutput) -> {
                pOutput.accept(GALLIFREY_STONE);
                pOutput.accept(GALLIFREY_STONE_STAIRS);
                pOutput.accept(GALLIFREY_STONE_SLAB);
                pOutput.accept(GALLIFREY_STONE_PRESSURE_PLATE);
                pOutput.accept(GALLIFREY_STONE_BUTTON);
                pOutput.accept(GALLIFREY_COBBLESTONE);
                pOutput.accept(GALLIFREY_COBBLESTONE_STAIRS);
                pOutput.accept(GALLIFREY_COBBLESTONE_SLAB);
                pOutput.accept(GALLIFREY_COBBLESTONE_WALL);
                pOutput.accept(GALLIFREY_SMOOTH_STONE);
                pOutput.accept(GALLIFREY_SMOOTH_STONE_SLAB);
                pOutput.accept(GALLIFREY_STONE_BRICKS);
                pOutput.accept(GALLIFREY_CRACKED_STONE_BRICKS);
                pOutput.accept(GALLIFREY_STONE_BRICK_STAIRS);
                pOutput.accept(GALLIFREY_STONE_BRICK_SLAB);
                pOutput.accept(GALLIFREY_STONE_BRICK_WALL);
                pOutput.accept(GALLIFREY_DEEPSLATE);
                pOutput.accept(GALLIFREY_COBBLED_DEEPSLATE);
                pOutput.accept(GALLIFREY_COBBLED_DEEPSLATE_STAIRS);
                pOutput.accept(GALLIFREY_COBBLED_DEEPSLATE_SLAB);
                pOutput.accept(GALLIFREY_COBBLED_DEEPSLATE_WALL);
                pOutput.accept(GALLIFREY_POLISHED_DEEPSLATE);
                pOutput.accept(GALLIFREY_POLISHED_DEEPSLATE_STAIRS);
                pOutput.accept(GALLIFREY_POLISHED_DEEPSLATE_SLAB);
                pOutput.accept(GALLIFREY_POLISHED_DEEPSLATE_WALL);
                pOutput.accept(GALLIFREY_DEEPSLATE_BRICKS);
                pOutput.accept(GALLIFREY_CRACKED_DEEPSLATE_BRICKS);
                pOutput.accept(GALLIFREY_DEEPSLATE_BRICK_STAIRS);
                pOutput.accept(GALLIFREY_DEEPSLATE_BRICK_SLAB);
                pOutput.accept(GALLIFREY_DEEPSLATE_BRICK_WALL);
                pOutput.accept(GALLIFREY_DEEPSLATE_TILES);
                pOutput.accept(GALLIFREY_CRACKED_DEEPSLATE_TILES);
                pOutput.accept(GALLIFREY_DEEPSLATE_TILE_STAIRS);
                pOutput.accept(GALLIFREY_DEEPSLATE_TILE_SLAB);
                pOutput.accept(GALLIFREY_DEEPSLATE_TILE_WALL);
                pOutput.accept(GALLIFREY_GRASS_BLOCK);
                pOutput.accept(GALLIFREY_DIRT_PATH);
                pOutput.accept(GALLIFREY_DIRT);
                pOutput.accept(GALLIFREY_FARMLAND);
            }).build());
}
