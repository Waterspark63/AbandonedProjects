package varxs.TechPack.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import varxs.TechPack.items.ModItems;
import varxs.TechPack.support.Reference;

public class tabComputers extends CreativeTabs {
	public tabComputers() {
		super(Reference.MODID);
		// setBackgroundImageName("Components.png");

	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ingotCopper;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
