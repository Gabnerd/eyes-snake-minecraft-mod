package com.pescaroli.eyessnake.item;

import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.UUID;

public class ClearingEyesSnakeItem extends EyesSnakeItem implements ICurioItem {
    public ClearingEyesSnakeItem(Properties properties) {
        super(properties);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        var att = ICurioItem.super.getAttributeModifiers(slotContext, uuid, stack);
        CuriosApi.getCuriosHelper().addSlotModifier(att, "snake", uuid, 2, AttributeModifier.Operation.ADDITION);
        return att;
    }
}
