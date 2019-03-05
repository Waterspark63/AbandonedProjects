package com.water.PlentifulOres.Items.Tools.Lead;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class LeadSword extends ItemSword {
	public LeadSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Lead Sword");
		this.setTextureName("po:leadtools/lead_sword");
	}
}
