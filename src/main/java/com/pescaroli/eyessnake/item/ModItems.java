package com.pescaroli.eyessnake.item;

import com.pescaroli.eyessnake.EyesSnakeMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EyesSnakeMod.MODID);

    public static final RegistryObject<ClearingEyesSnakeItem> CLEARING_EYES_SNAKE = ITEMS.register("clearing-eyes", ()-> new ClearingEyesSnakeItem(new Item.Properties()));
    public static final RegistryObject<LifeEssenceItem> LIFE_ESSENCE = ITEMS.register("life-essence", ()-> new LifeEssenceItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
