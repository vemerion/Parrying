package com.theishiopian.parrying.Registration;

import com.theishiopian.parrying.Enchantment.*;
import com.theishiopian.parrying.ParryingMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEnchantments
{
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ParryingMod.MOD_ID);

    public static final RegistryObject<Enchantment> DEFLECTING = ENCHANTMENTS.register("deflection", DeflectingEnchantment::new);
    public static final RegistryObject<Enchantment> RIPOSTE = ENCHANTMENTS.register("riposte", RiposteEnchantment::new);
    public static final RegistryObject<Enchantment> BASHING = ENCHANTMENTS.register("bashing", BashingEnchantment::new);
    public static final RegistryObject<Enchantment> FRAGILE = ENCHANTMENTS.register("fragile", FragileCurse::new);
    public static final RegistryObject<Enchantment> PHASING = ENCHANTMENTS.register("phasing", PhasingCurse::new);
}