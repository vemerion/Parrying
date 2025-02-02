package com.theishiopian.parrying.Registration;

import com.theishiopian.parrying.ParryingMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents
{
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ParryingMod.MOD_ID);

    public static final  RegistryObject<SoundEvent> BLOCK_HIT = registerSoundEvent("block_hit");
    public static final  RegistryObject<SoundEvent> SHIELD_BASH = registerSoundEvent("shield_bash");
    public static final  RegistryObject<SoundEvent> SHIELD_BASH_MISS = registerSoundEvent("shield_bash_miss");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name)
    {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(ParryingMod.MOD_ID, name)));
    }
}
