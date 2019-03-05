package varxs.tuts.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import varxs.tuts.items.tools.TutorialAxe;

public class ModItems {

	public static ItemBase ingotCopper;
	public static TutorialAxe copperAxe;

	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper"));
		copperAxe = register(new TutorialAxe(ToolMaterial.IRON, "copperAxe"));

	};

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider) item).registerItemModel(item);
		}

		return item;

	}

}
