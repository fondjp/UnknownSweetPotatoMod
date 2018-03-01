package unknownSweetPotato;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

	public static void registry() {
		GameRegistry.addSmelting(UnknownSweetPotatoMod.sweet_potato,
				new ItemStack(UnknownSweetPotatoMod.steamed_sweet_potato), 0.7f);

		GameRegistry.addSmelting(UnknownSweetPotatoMod.anno_sweet_potato,
				new ItemStack(UnknownSweetPotatoMod.steamed_anno_sweet_potato), 1.0f);

		GameRegistry.addShapelessRecipe(new ItemStack(UnknownSweetPotatoMod.sweet_potato),
				Items.potato,
				new ItemStack(Items.dye, 1, 5));

		GameRegistry.addShapelessRecipe(new ItemStack(UnknownSweetPotatoMod.anno_sweet_potato),
				UnknownSweetPotatoMod.sweet_potato,
				UnknownSweetPotatoMod.magic_sugar);

		GameRegistry.addShapelessRecipe(new ItemStack(UnknownSweetPotatoMod.sweet_potato, 9),
				UnknownSweetPotatoMod.sweet_potato_block);

		GameRegistry.addShapelessRecipe(new ItemStack(UnknownSweetPotatoMod.anno_sweet_potato, 9),
				UnknownSweetPotatoMod.anno_block);

		GameRegistry.addRecipe(new ItemStack(UnknownSweetPotatoMod.magic_sugar),
				" Y ",
				"YXY",
				" Y ",
				'X', Items.gunpowder,
				'Y', Items.sugar);

		GameRegistry.addRecipe(new ItemStack(UnknownSweetPotatoMod.unknown_sweet_potato),
				"ZYZ",
				"YXY",
				"ZYZ",
				'X', UnknownSweetPotatoMod.anno_sweet_potato,
				'Y', UnknownSweetPotatoMod.magic_sugar,
				'Z', Blocks.chest);

		GameRegistry.addRecipe(new ItemStack(UnknownSweetPotatoMod.anno_pickaxe),
				"XXX",
				" Y ",
				" Y ",
				'X', Items.diamond,
				'Y', UnknownSweetPotatoMod.anno_block);

		GameRegistry.addRecipe(new ItemStack(UnknownSweetPotatoMod.anno_axe),
				"XX",
				"YX",
				"Y ",
				'X', Items.diamond,
				'Y', UnknownSweetPotatoMod.anno_block);

		GameRegistry.addRecipe(new ItemStack(UnknownSweetPotatoMod.anno_shovel),
				"X",
				"Y",
				"Y",
				'X', Items.diamond,
				'Y', UnknownSweetPotatoMod.anno_block);

		GameRegistry.addRecipe(new ItemStack(UnknownSweetPotatoMod.anno_hoe),
				"XX",
				"Y ",
				"Y ",
				'X', Items.diamond,
				'Y', UnknownSweetPotatoMod.anno_block);

		GameRegistry.addRecipe(new ItemStack(UnknownSweetPotatoMod.sweet_potato_block),
				"XXX",
				"XXX",
				"XXX",
				'X', UnknownSweetPotatoMod.sweet_potato);

		GameRegistry.addRecipe(new ItemStack(UnknownSweetPotatoMod.anno_block),
				"XXX",
				"XXX",
				"XXX",
				'X', UnknownSweetPotatoMod.anno_sweet_potato);
	}

}
