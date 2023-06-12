package com.pescaroli.eyessnake.block.entity;

import com.pescaroli.eyessnake.EyesSnakeMod;
import com.pescaroli.eyessnake.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EyesSnakeMod.MODID);

    public static final RegistryObject<BlockEntityType<WishingAltarBlockEntity>> WISHING_ALTAR =
            BLOCK_ENTITIES.register("wishing-altar", () -> BlockEntityType.Builder.of(WishingAltarBlockEntity::new,
                    ModBlocks.WISHING_ALTAR.get()).build(null));
    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
