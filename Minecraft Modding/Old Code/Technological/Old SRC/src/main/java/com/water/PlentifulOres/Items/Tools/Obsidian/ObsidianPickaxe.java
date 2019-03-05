package com.water.PlentifulOres.Items.Tools.Obsidian;

import net.minecraft.item.ItemPickaxe;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;

public class ObsidianPickaxe extends ItemPickaxe {
	public ObsidianPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Obsidian Pickaxe");
		this.setTextureName("po:obsidiantools/obsidian_pickaxe");
	}
}
