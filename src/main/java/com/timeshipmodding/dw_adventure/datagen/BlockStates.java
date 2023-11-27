package com.timeshipmodding.dw_adventure.datagen;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks.*;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DW_Adventure.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }
}
