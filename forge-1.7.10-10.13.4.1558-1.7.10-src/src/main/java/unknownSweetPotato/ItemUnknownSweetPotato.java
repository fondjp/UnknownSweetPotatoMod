package unknownSweetPotato;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.passive.EntityVillager;
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
	int villagerCounter01 = 0;
	int villagerCounter02 = 0;

	public ItemUnknownSweetPotato(String unlocalizedName, int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_,
			PotionEffect... effects) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(UnknownSweetPotatoMod.tabUnknownSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
		this.effects = effects;
	}

	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onEaten(stack, world, player);

		if (!world.isRemote) {

			player.addStat(UnknownSweetPotatoMod.achievementUSPAte, 1);
			Random rand = new Random();
			int genNum = rand.nextInt(1000) + 1; // 0.1％単位で事象を管理する
			if (genNum <= 240) {
				int getResouceNum = 0;
				switch (rand.nextInt(5)) {
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
				if (getResouceNum == 10) {
					player.addStat(UnknownSweetPotatoMod.achievementUSPLucky, 1);
				}
			} else if (genNum <= 420) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("This Sweet Potato contains a Potion!!!");
				int potionId[] = { 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
				int duration, level; // (value) * 20 = duration in seconds
				if (genNum <= 350) {
					level = 0;
					duration = 50;
				} else {
					level = 1;
					duration = 20;
				}
				player.addPotionEffect(new PotionEffect(potionId[rand.nextInt(potionId.length)], 20 * duration, level));
			} else if (genNum <= 540) {
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
			} else if (genNum <= 660) {
				EntityTNTPrimed tnt = new EntityTNTPrimed(world, player.posX, player.posY + 10, player.posZ, player);
				tnt.fuse = 30;
				world.spawnEntityInWorld(tnt);
			} else if (genNum <= 730) {
				player.inventory.addItemStackToInventory(
						new ItemStack(UnknownSweetPotatoMod.unknown_sweet_potato, rand.nextInt(1) + 1));
			} else if (genNum <= 795) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("E.G.G! E.G.G! E.G.G!");
				for (int count = 0; count < rand.nextInt(200 - 50) + 50; count++) {
					EntityEgg egg = new EntityEgg(world, player.posX + rand.nextInt(100) - 50,
							player.posY + rand.nextInt(100), player.posZ + rand.nextInt(100) - 50);
					world.spawnEntityInWorld(egg);
				}
			} else if (genNum <= 845) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("DELICIOUS!!!");
				player.setHealth(player.getMaxHealth());
			} else if (genNum <= 895) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("BAD!!!");
				player.setHealth((player.getHealth() * 0.1F));
			} else if (genNum <= 925) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("Look up!");
				for (int i = 11; i <= 20; i++) {
					world.setBlock((int) player.posX - 1, (int) player.posY + i, (int) player.posZ - 1, Blocks.anvil);
				}
			} else if (genNum <= 955) {
				for (int i = -1; i <= 2; i++) {
					for (int j = 0; j <= 2; j++) {
						for (int k = 0; k <= 2; k++) {
							if (j != k && j + k != 2) {
								if (i == 1 && Math.pow(j - k, 2) == 1) {
									world.setBlock((int) player.posX - j, (int) player.posY + i, (int) player.posZ - k,
											Blocks.glass);
								} else {
									world.setBlock((int) player.posX - j, (int) player.posY + i, (int) player.posZ - k,
											Blocks.obsidian);
								}
							}
						}
					}
				}
				world.setBlock((int) player.posX - 1, (int) player.posY - 1, (int) player.posZ - 1, Blocks.obsidian);
				world.setBlock((int) player.posX - 1, (int) player.posY + 2, (int) player.posZ - 1, Blocks.obsidian);
				world.setBlock((int) player.posX - 1, (int) player.posY + 1, (int) player.posZ - 1, Blocks.water);
				player.addStat(UnknownSweetPotatoMod.achievementUSPObsidian, 1);
			} else if (genNum <= 980) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("WHO ARE YOU!!!");
				EntityVillager fondjp01 = new EntityVillager(world, 401);
				fondjp01.setPosition(player.posX - 4, player.posY, player.posZ);
				world.spawnEntityInWorld(fondjp01);
				player.addStat(UnknownSweetPotatoMod.achievementUSPEncounter, 1);
				villagerCounter01 = 1;
			} else if (genNum <= 995) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("WHO ARE YOU???");
				EntityVillager fondjp02 = new EntityVillager(world, 402);
				fondjp02.setPosition(player.posX - 4, player.posY, player.posZ);
				world.spawnEntityInWorld(fondjp02);
				player.addStat(UnknownSweetPotatoMod.achievementUSPEncounter, 1);
				villagerCounter02 = 1;
			} else if (genNum <= 1000) {
				player.addPotionEffect(new PotionEffect(22, 20 * 3600, 19));
				player.addStat(UnknownSweetPotatoMod.achievementUSPVeryLucky, 1);
			}

			if (villagerCounter01 + villagerCounter02 == 2) {
				player.addStat(UnknownSweetPotatoMod.achievementUSPEncounterComplete, 1);
			}

		}

		return stack;
	}

}