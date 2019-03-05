package com.water.PlentifulOres.Initialization;

import com.water.PlentifulOres.Registry.CopperRegistry;
import com.water.PlentifulOres.Registry.LeadRegistry;
import com.water.PlentifulOres.Registry.ObsidianRegistry;
import com.water.PlentifulOres.Registry.SilverRegistry;
import com.water.PlentifulOres.Registry.TinRegistry;
import com.water.PlentifulOres.Registry.UraniumRegistry;

public class InitializeTools_Ingots {
	public static void InitItems() {
		CopperRegistry.CopperItems();
		LeadRegistry.LeadItems();
		ObsidianRegistry.ObsidianItems();
		SilverRegistry.SilverItems();
		TinRegistry.TinItems();
		UraniumRegistry.UraniumItems();
	}
	public static void InitRegistry() { 
		CopperRegistry.CopperGameReg();		
		LeadRegistry.LeadGameReg();
		ObsidianRegistry.ObsidianGameReg();
		SilverRegistry.SilverGameReg();
		TinRegistry.TinGameReg();
		UraniumRegistry.UraniumGameReg();
	}
}
