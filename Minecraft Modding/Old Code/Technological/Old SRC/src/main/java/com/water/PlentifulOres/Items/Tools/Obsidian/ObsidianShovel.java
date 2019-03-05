package com.water.PlentifulOres.Items.Tools.Obsidian;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ObsidianShovel extends ItemSpade {
	public ObsidianShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Obsidian Shovel");
		this.setTextureName("po:obsidiantools/obsidian_shovel");
	}
}
