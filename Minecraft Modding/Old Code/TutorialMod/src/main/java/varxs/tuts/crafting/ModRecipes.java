package varxs.tuts.crafting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import varxs.tuts.blocks.ModBlocks;
import varxs.tuts.items.ModItems;

public class ModRecipes {

	public static void addRecipes() {
		// Shaped Crafting Recipes
		// GameRegistry.addRecipe(new ItemStack(ModBlocks.blockCopper), "###",
		// "###", "###", "#", ModItems.ingotCopper);

		// Shapeless Recipes
		// GameRegistry.addShapelessRecipe(new ItemStack(MoodItems.conSeed), new
		// ItemStack(ModItems.corn));

		// Smelting Recipes
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 1.0f);

	}
}
