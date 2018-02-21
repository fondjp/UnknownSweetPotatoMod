package unknownSweetPotato;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onEaten(stack, world, player);
		if (!world.isRemote) {
			Random rand = new Random();
			int genNum = rand.nextInt(1000) + 1; // 0.1％単位で事象を管理する
			if (genNum <= 100) {
				EntityTNTPrimed tnt = new EntityTNTPrimed(world, player.posX, player.posY + 10, player.posZ, player);
				tnt.fuse = 30;
				world.spawnEntityInWorld(tnt);
			} else if (genNum <= 200) {
				for (int count = 0; count < rand.nextInt(200 - 50) + 50; count++) {
					EntityEgg egg = new EntityEgg(world, player.posX + rand.nextInt(100) - 50,
							player.posY + rand.nextInt(100), player.posZ + rand.nextInt(100) - 50);
					world.spawnEntityInWorld(egg);
				}
			} else if (genNum <= 380) {
				switch (rand.nextInt(4)) {
				case 0:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, diamond came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(Items.diamond, rand.nextInt(10) + 1));
					break;
				case 1:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, emerald came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(Items.emerald, rand.nextInt(10) + 1));
					break;
				case 2:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, gold came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(Items.gold_ingot, rand.nextInt(10) + 1));
					break;
				case 3:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, iron came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(Items.iron_ingot, rand.nextInt(10) + 1));
					break;
				case 4:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Art is an explotion!!!");
					player.inventory.addItemStackToInventory(new ItemStack(Blocks.tnt, rand.nextInt(10) + 1));
					break;
				case 5:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("I'm Lucky!!!");
					player.inventory.addItemStackToInventory(new ItemStack(Items.golden_apple, rand.nextInt(10) + 1));
					break;
				}
			} else if (genNum <= 560) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("This Sweet Potato contains a Potion!!!");
				int potionId[] = { 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
				int duration; // second
				int level = rand.nextInt(1);
				if (level == 0) {
					duration = 50;
				} else {
					duration = 20;
				}
				player.addPotionEffect(new PotionEffect(potionId[rand.nextInt(potionId.length)], 20 * duration, level));
			} else if (genNum <= 660) {
				switch (rand.nextInt(4)) {
				case 0:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, axe came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(UnknownSweetPotatoMod.anno_axe));
					break;
				case 1:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, hoe came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(UnknownSweetPotatoMod.anno_hoe));
					break;
				case 2:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, pickaxe came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(UnknownSweetPotatoMod.anno_pickaxe));
					break;
				case 3:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, shovel came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(UnknownSweetPotatoMod.anno_shovel));
					break;
				case 4:
					Minecraft.getMinecraft().thePlayer.sendChatMessage("Oh, sword came out of my mouth!!!");
					player.inventory.addItemStackToInventory(new ItemStack(UnknownSweetPotatoMod.anno_sword));
					break;
				}
			} else if (genNum <= 710) {
				// TODO ここで村人を自分の周り（X+2など）にスポーンさせたい。
			} else if (genNum <= 760) {
				player.setHealth(player.getMaxHealth());
			} else if (genNum <= 810) {
				player.setHealth((player.getHealth() * 0.1F));
			} else if (genNum <= 1000) {
				// 未定
			}
		}
		return stack;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
	}
}