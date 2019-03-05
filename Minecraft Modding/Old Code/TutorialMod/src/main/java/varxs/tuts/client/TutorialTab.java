package varxs.tuts.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import varxs.tuts.help.Reference;
import varxs.tuts.items.ModItems;

public class TutorialTab extends CreativeTabs {

	public TutorialTab() {
		super(Reference.modid);
		// setBackgroundImageName("tutorialmod.png")
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ingotCopper; // Shown on creative tab
	}

	@Override
	public boolean hasSearchBar() {
		return true; // Return false for no Search Bar
	}
}
