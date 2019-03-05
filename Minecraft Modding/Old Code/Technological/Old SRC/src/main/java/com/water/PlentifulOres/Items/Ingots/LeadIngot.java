package com.water.PlentifulOres.Items.Ingots;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item;

public class LeadIngot extends Item {
	public LeadIngot() {
		super();
		this.setCreativeTab(Main.tabPlentifulOresOre);
		this.setUnlocalizedName("Lead Ingot");
		this.setTextureName("po:ingots/lead_ingot");
	}
}
