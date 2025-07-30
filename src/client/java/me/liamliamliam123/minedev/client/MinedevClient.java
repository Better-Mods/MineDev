package me.liamliamliam123.minedev.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.SharedConstants;

public class MinedevClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SharedConstants.isDevelopment = true;
    }
}
