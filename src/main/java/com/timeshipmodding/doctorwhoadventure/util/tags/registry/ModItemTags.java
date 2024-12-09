package com.timeshipmodding.doctorwhoadventure.util.tags.registry;

import com.timeshipmodding.doctorwhoadventure.DoctorWhoAdventure;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static TagKey<Item> GALLIFREY_STONE_BRICKS = createTag("gallifrey_stone_bricks");

    private static TagKey<Item> createTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(DoctorWhoAdventure.MODID, name));
    }
}
