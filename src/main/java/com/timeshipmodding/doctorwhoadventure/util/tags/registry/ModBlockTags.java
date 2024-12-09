package com.timeshipmodding.doctorwhoadventure.util.tags.registry;

import com.timeshipmodding.doctorwhoadventure.DoctorWhoAdventure;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static TagKey<Block> GALLIFREY_STONE_BRICKS = createTag("gallifrey_stone_bricks");

    private static TagKey<Block> createTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(DoctorWhoAdventure.MODID, name));
    }
}
