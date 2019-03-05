package com.water.PlentifulOres.Items.Tools.Silver;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class SilverAxe extends ItemAxe {
	public SilverAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Silver Axe");
		this.setTextureName("po:silvertools/silver_axe");
	}
}
