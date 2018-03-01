package unknownSweetPotato;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class EntityVillagerFondjp02 implements IVillageTradeHandler {

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 4), new ItemStack(Items.dye, 1, 5)));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.potato), new ItemStack(Items.carrot)));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.diamond, 32), new ItemStack(Items.potato)));
		recipeList.add(new MerchantRecipe(new ItemStack(UnknownSweetPotatoMod.unknown_sweet_potato, 20), new ItemStack(UnknownSweetPotatoMod.anno_sword)));
		recipeList.add(new MerchantRecipe(new ItemStack(Blocks.wool, 1, 10), new ItemStack(Items.string, 8)));
	}

}