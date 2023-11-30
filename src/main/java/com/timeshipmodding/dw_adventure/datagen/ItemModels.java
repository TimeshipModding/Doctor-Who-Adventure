package com.timeshipmodding.dw_adventure.datagen;

import com.timeshipmodding.dw_adventure.DW_Adventure;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.dw_adventure.content.item.registries.ModItems.*;

public class ItemModels extends ItemModelProvider {
    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DW_Adventure.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(GALLIFREY_CLAY_BALL);
    }

    // Generate Methods
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DW_Adventure.MODID,"item/" + item.getId().getPath()));
    }
}
