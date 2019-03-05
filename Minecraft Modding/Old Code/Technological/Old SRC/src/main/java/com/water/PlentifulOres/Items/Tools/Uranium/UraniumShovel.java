package com.water.PlentifulOres.Items.Tools.Uranium;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class UraniumShovel extends ItemSpade {
	public UraniumShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Uranium Shovel");
		this.setTextureName("po:uraniumtools/uranium_shovel");
	}
}
