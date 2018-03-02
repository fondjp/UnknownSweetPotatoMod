package unknownSweetPotato;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSteamedAnnoSweetPotato extends ItemFood {

	private PotionEffect[] effects;

	public ItemSteamedAnnoSweetPotato(String unlocalizedName, int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_,
			PotionEffect... effects) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(UnknownSweetPotatoMod.tabUnknownSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
		this.effects = effects;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		player.addPotionEffect(new PotionEffect(10, 20 * 10, 2)); // レベル３再生を200tick(≒10sec）
	}

	public int getMaxItemUseDuration(ItemStack stack) {
		return 48;
	}

	public boolean hasEffect(ItemStack par1ItemStack) {
	     par1ItemStack.setTagInfo("ench", new NBTTagList());
	     return true;
	}

}