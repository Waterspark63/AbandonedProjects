package varxs.TechPack.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import varxs.TechPack.support.ItemModelProvider;

public class ModItems {

	public static ItemBase ingotCopper;
	public static ItemBase ingotTin;
	public static ItemBase ingotLead;
	public static ItemBase copperWire;
	public static ItemBase tinWire;
	
	
	
	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper"));
		ingotTin = register(new ItemBase("ingotTin"));
		copperWire = register(new ItemBase("copperWire"));
		tinWire = register(new ItemBase("tinWire"));
		
		
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {

			((ItemModelProvider) item).registerItemModel(item);

		}

		return item;
	}
}
