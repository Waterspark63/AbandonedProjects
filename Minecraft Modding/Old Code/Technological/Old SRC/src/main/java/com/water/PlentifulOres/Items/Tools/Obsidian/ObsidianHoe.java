package com.water.PlentifulOres.Items.Tools.Obsidian;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ObsidianHoe extends ItemHoe {
	public ObsidianHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Obsidian Hoe");
		this.setTextureName("po:obsidiantools/obsidian_hoe");
	}
}
