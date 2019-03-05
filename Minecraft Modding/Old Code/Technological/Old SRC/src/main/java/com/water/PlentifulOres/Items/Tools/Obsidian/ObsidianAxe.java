package com.water.PlentifulOres.Items.Tools.Obsidian;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ObsidianAxe extends ItemAxe {
	public ObsidianAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Obsidian Axe");
		this.setTextureName("po:obsidiantools/obsidian_axe");
	}
}
