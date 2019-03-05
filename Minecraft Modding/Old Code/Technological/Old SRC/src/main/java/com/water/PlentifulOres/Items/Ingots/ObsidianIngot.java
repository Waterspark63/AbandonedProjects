package com.water.PlentifulOres.Items.Ingots;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item;

public class ObsidianIngot extends Item {
	public ObsidianIngot() {
		super();
		this.setCreativeTab(Main.tabPlentifulOresOre);
		this.setUnlocalizedName("Obsidian Ingot");
		this.setTextureName("po:ingots/obsidian_ingot");
	}
}
