package com.water.PlentifulOres.Items.Tools.Lead;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class LeadAxe extends ItemAxe {
	public LeadAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Lead Axe");
		this.setTextureName("po:leadtools/lead_axe");
	}
}
