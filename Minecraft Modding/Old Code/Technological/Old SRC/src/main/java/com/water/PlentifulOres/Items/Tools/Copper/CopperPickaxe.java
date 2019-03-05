package com.water.PlentifulOres.Items.Tools.Copper;

import net.minecraft.item.ItemPickaxe;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;

public class CopperPickaxe extends ItemPickaxe {
	public CopperPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Copper Pickaxe");
		this.setTextureName("po:coppertools/copper_pickaxe");
	}
}
