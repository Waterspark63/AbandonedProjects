package com.water.PlentifulOres.Items.Tools.Silver;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class SilverHoe extends ItemHoe {
	public SilverHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Silver Hoe");
		this.setTextureName("po:silvertools/silver_hoe");
	}
}
