package com.water.PlentifulOres.Items.Tools.Copper;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class CopperShovel extends ItemSpade {
	public CopperShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Copper Shovel");
		this.setTextureName("po:coppertools/copper_shovel");
	}
}
