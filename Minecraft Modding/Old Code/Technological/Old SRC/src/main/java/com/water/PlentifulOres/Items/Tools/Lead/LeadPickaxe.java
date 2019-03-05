package com.water.PlentifulOres.Items.Tools.Lead;

import net.minecraft.item.ItemPickaxe;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;

public class LeadPickaxe extends ItemPickaxe {
	public LeadPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Lead Pickaxe");
		this.setTextureName("po:leadtools/lead_pickaxe");
	}
}