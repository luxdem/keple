package com.pipe.keple;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(Keple.MODID)
public class Keple {
    public static final String MODID = "keple";

    public Keple() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::setup);
    }

    private void setup(final net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent event) {
    }
}