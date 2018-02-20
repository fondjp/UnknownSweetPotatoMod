package unknownSweetPotato;

import java.util.Random;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemUnknownSweetPotato extends ItemFood {

	private PotionEffect[] effects;

	public ItemUnknownSweetPotato(String unlocalizedName, int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_,
			PotionEffect... effects) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(UnknownSweetPotatoMod.tabSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
		this.effects = effects;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			Random rand = new Random();
			switch (rand.nextInt(2)) {
			case 0:
				EntityTNTPrimed tnt = new EntityTNTPrimed(world, player.posX, player.posY + 10, player.posZ, player);
				tnt.fuse = 30;
				world.spawnEntityInWorld(tnt);
				break;
			case 1:
				for (int count = 0; count < rand.nextInt(200 - 50) + 50; count++) {
					EntityEgg egg = new EntityEgg(world, player.posX + rand.nextInt(100) - 50, player.posY + rand.nextInt(100),
							player.posZ + rand.nextInt(100) - 50);
					world.spawnEntityInWorld(egg);
				}
				break;
			}
		}
		return stack;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
	}
}