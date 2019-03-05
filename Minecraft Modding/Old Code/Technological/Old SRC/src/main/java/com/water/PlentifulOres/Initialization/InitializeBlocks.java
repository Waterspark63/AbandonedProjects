package com.water.PlentifulOres.Initialization;

import com.water.PlentifulOres.Registry.OreRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InitializeBlocks {
	
	public static Block Table;
	
	public static void InitBlocks() {
		OreRegistry.OreBlocks();
	}
	
	public static void InitRegistry() {
		OreRegistry.OreGameReg();
	}
	
	
	
	
}
