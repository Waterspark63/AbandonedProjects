package com.water.PlentifulOres.Items.Tools.Silver;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class SilverShovel extends ItemSpade {
	public SilverShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Silver Shovel");
		this.setTextureName("po:silvertools/silver_shovel");
	}
}
