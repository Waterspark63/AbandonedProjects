package com.water.PlentifulOres.Items.Tools.Lead;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class LeadHoe extends ItemHoe {
	public LeadHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Lead Hoe");
		this.setTextureName("po:leadtools/lead_hoe");
	}
}
