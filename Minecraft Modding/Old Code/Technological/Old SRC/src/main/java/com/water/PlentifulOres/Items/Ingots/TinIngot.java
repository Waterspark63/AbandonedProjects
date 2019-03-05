package com.water.PlentifulOres.Items.Ingots;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item;

public class TinIngot extends Item {
	public TinIngot() {
		super();
		this.setCreativeTab(Main.tabPlentifulOresOre);
		this.setUnlocalizedName("Tin Ingot");
		this.setTextureName("po:ingots/tin_ingot");
	}
}
