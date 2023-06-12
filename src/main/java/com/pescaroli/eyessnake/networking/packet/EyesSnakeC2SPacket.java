package com.pescaroli.eyessnake.networking.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class EyesSnakeC2SPacket {
    public EyesSnakeC2SPacket() {

    }

    public EyesSnakeC2SPacket(FriendlyByteBuf buf) {

    }

    public void toBytes(FriendlyByteBuf buf) {

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            // HERE WE ARE ON THE SERVER!
            ServerPlayer player = context.getSender();
            ServerLevel level = player.getLevel();

            // EntityType.COW.spawn(level, null, null, player.blockPosition(),
            //         MobSpawnType.COMMAND, true, false);
        });
        return true;
    }

}
