package com.blakebr0.mysticalagriculture.items.tools.supremium.upgraded;

import java.util.List;

import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import com.blakebr0.mysticalagriculture.config.ModConfig;
import com.blakebr0.mysticalagriculture.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSwordStrength extends ItemSword {
	    	
	public ItemSwordStrength(ToolMaterial material, String name){
		super(material);
		this.setUnlocalizedName("ma." + name);
		this.setRegistryName(name);
		this.setCreativeTab(MysticalAgriculture.tabMysticalAgriculture);
	}
	
	@Override
    public ItemStack getContainerItem(ItemStack itemstack){
        return new ItemStack(ModItems.charm_strength, 1, 0);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack){
        return ModConfig.charm_return;
    }
		
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced){
		tooltip.add("Durability: \u00A7cUnlimited");
		if(stack.getItem() == ModItems.supremium_sword_strength1){
			tooltip.add("Charm Slot: \u00A7cStrength");
		}
		if(stack.getItem() == ModItems.supremium_sword_strength2){
			tooltip.add("Charm Slot: \u00A7cStrength 2");
		}
		super.addInformation(stack, player, tooltip, advanced);
	}
}
