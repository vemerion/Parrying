package com.theishiopian.parrying.Enchantment;

import com.theishiopian.parrying.Config.Config;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.SweepingEnchantment;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.SwordItem;

public class RiposteEnchantment extends Enchantment
{
    public RiposteEnchantment()
    {
        super(Rarity.VERY_RARE, EnchantmentType.WEAPON, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND});
    }

    public int getMinCost(int in) {
        return 25;
    }

    public int getMaxCost(int in) {
        return 45;
    }

    public int getMaxLevel() {
        return 1;
    }

    public boolean checkCompatibility(Enchantment toCheck)
    {
        return !(toCheck instanceof SweepingEnchantment) && !(toCheck instanceof DeflectingEnchantment) && super.checkCompatibility(toCheck);
    }

    public boolean canEnchant(ItemStack p_92089_1_)
    {
        return Config.riposteEnabled.get();
    }
}