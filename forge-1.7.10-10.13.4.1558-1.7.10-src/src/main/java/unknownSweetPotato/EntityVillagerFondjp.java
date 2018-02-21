package unknownSweetPotato;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class EntityVillagerFondjp implements IVillageTradeHandler {

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 1, 0), Items.golden_apple));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.blaze_rod), new ItemStack(Items.emerald, 2, 0)));
		// 暫定レシピ。変更予定。
	}

}