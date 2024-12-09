package com.timeshipmodding.doctorwhoadventure.content.block.planet;

import com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

import javax.annotation.Nullable;

public class PlanetDirtBlock extends Block {
    public String planet;

    public PlanetDirtBlock(String planet, Properties properties) {
        super(properties);
        this.planet = planet;
    }

    public Block getFarmBlock(String pPlanet) {
        if (pPlanet.equals("gallifrey")) {
            return ModGallifreyBlocks.GALLIFREY_FARMLAND.get();
        }
        return null;
    }

    public Block getDirtPathBlock(String pPlanet) {
        if (pPlanet.equals("gallifrey")) {
            return ModGallifreyBlocks.GALLIFREY_DIRT_PATH.get();
        }
        return null;
    }

    @Override
    @Nullable
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (itemAbility.equals(ItemAbilities.HOE_TILL) && context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
            return getFarmBlock(planet).defaultBlockState();
        } else if (itemAbility.equals(ItemAbilities.SHOVEL_FLATTEN) && context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
            return getDirtPathBlock(planet).defaultBlockState();
        }
        return null;
    }
}
