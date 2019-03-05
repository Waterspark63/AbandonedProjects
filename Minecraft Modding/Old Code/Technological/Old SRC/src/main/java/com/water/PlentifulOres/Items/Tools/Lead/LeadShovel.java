package com.water.PlentifulOres.Items.Tools.Lead;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class LeadShovel extends ItemSpade {
	public LeadShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Lead Shovel");
		this.setTextureName("po:leadtools/lead_shovel");
	}
}
