package com.water.PlentifulOres.Items.Ingots;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item;

public class SilverIngot extends Item {
	public SilverIngot() {
		super();
		this.setCreativeTab(Main.tabPlentifulOresOre);
		this.setUnlocalizedName("Silver Ingot");
		this.setTextureName("po:ingots/silver_ingot");
	}
}
