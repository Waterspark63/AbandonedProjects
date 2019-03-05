package com.water.PlentifulOres.Items.Tools.Copper;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class CopperSword extends ItemSword {
	public CopperSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Copper Sword");
		this.setTextureName("po:coppertools/copper_sword");
	}
}
