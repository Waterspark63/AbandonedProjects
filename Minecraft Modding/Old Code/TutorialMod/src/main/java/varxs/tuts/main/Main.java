package varxs.tuts.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import varxs.tuts.blocks.ModBlocks;
import varxs.tuts.client.TutorialTab;
import varxs.tuts.drops.DropHandler;
import varxs.tuts.help.Reference;
import varxs.tuts.items.ModItems;
import varxs.tuts.proxy.CommonProxy;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version, acceptedMinecraftVersions = "[1.10.2]")
public class Main {

	public static final TutorialTab creativeTab = new TutorialTab();

	@SidedProxy(serverSide = "varxs.tuts.proxy.CommonProxy", clientSide = "varxs.tuts.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.Instance(Reference.modid)
	public static Main instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.name + " is loading!");
		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new DropHandler());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
