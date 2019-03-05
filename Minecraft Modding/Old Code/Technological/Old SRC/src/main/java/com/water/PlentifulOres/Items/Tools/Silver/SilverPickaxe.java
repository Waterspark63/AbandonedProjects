package com.water.PlentifulOres.Items.Tools.Silver;

import net.minecraft.item.ItemPickaxe;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;

public class SilverPickaxe extends ItemPickaxe {
	public SilverPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Silver Pickaxe");
		this.setTextureName("po:silvertools/silver_pickaxe");
	}
}
