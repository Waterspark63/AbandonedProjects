package com.water.PlentifulOres.Items.Tools.Silver;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class SilverSword extends ItemSword {
	public SilverSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Silver Sword");
		this.setTextureName("po:silvertools/silver_sword");
	}
}
