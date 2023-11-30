package com.timeshipmodding.dw_adventure.content.block;

import com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import javax.annotation.Nullable;

public class PlanetDirtBlock extends Block {
    public String pPlanet;

    public PlanetDirtBlock(String pPlanet, Properties pProperties) {
        super(pProperties);
        this.pPlanet = pPlanet;
    }

    public BlockState getFarmBlock(String pPlanet) {
        if (pPlanet.equals("gallifrey")) {
            return ModBlocks.GALLIFREY_FARMLAND.get().defaultBlockState();
        }
        return null;
    }

    public BlockState getDirtPathBlock(String pPlanet) {
        if (pPlanet.equals("gallifrey")) {
            return ModBlocks.GALLIFREY_DIRT_PATH.get().defaultBlockState();
        }
        return null;
    }

    @Override
    @Nullable
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (toolAction.equals(ToolActions.HOE_TILL) && context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
            return getFarmBlock(pPlanet);
        } else if (toolAction.equals(ToolActions.SHOVEL_FLATTEN) && context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
            return getDirtPathBlock(pPlanet);
        }
        return null;
    }
}
