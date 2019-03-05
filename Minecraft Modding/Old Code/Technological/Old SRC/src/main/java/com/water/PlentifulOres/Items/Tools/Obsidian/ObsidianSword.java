package com.water.PlentifulOres.Items.Tools.Obsidian;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword {
	public ObsidianSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Obsidian Sword");
		this.setTextureName("po:obsidiantools/obsidian_sword");
	}
}
