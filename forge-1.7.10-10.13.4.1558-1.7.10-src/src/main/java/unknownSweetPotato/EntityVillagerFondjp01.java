package unknownSweetPotato;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class EntityVillagerFondjp01 implements IVillageTradeHandler {

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		ItemStack powerBook = new ItemStack(Items.enchanted_book);
		ItemStack sharpnessBook = new ItemStack(Items.enchanted_book);
		ItemStack efficiencyBook = new ItemStack(Items.enchanted_book);
		Items.enchanted_book.addEnchantment(powerBook, new EnchantmentData(Enchantment.power, 5));
		Items.enchanted_book.addEnchantment(sharpnessBook, new EnchantmentData(Enchantment.sharpness, 5));
		Items.enchanted_book.addEnchantment(efficiencyBook, new EnchantmentData(Enchantment.efficiency, 5));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), new ItemStack(Blocks.red_flower, 1)));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 3), new ItemStack(Items.dye, 1, 4)));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 29), powerBook));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 37), sharpnessBook));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 42), efficiencyBook));
	}

}