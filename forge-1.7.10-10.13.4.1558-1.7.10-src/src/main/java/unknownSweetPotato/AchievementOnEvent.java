package unknownSweetPotato;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AchievementOnEvent {

	@SubscribeEvent
	public void whenPickedUpPotato(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Items.potato))) {
			e.player.addStat(UnknownSweetPotatoMod.achievementPotato, 1);
		}
	}

	@SubscribeEvent
	public void whenCraftedSweetPotato(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(UnknownSweetPotatoMod.sweet_potato)) {
			e.player.addStat(UnknownSweetPotatoMod.achievementSweetPotato, 1);
		}
	}

	@SubscribeEvent
	public void whenSmeltedSteamedSweetPotato(PlayerEvent.ItemSmeltedEvent e) {
		if (e.smelting.getItem().equals(UnknownSweetPotatoMod.steamed_sweet_potato)) {
			e.player.addStat(UnknownSweetPotatoMod.achievementSteamedSweetPotato, 1);
		}
	}

	@SubscribeEvent
	public void whenCraftedAnnoSweetPotato(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(UnknownSweetPotatoMod.anno_sweet_potato)) {
			e.player.addStat(UnknownSweetPotatoMod.achievementAnnoSweetPotato, 1);
		}
	}

	@SubscribeEvent
	public void whenSmeltedSteamedAnnoSweetPotato(PlayerEvent.ItemSmeltedEvent e) {
		if (e.smelting.getItem().equals(UnknownSweetPotatoMod.steamed_anno_sweet_potato)) {
			e.player.addStat(UnknownSweetPotatoMod.achievementSteamedAnnoSweetPotato, 1);
		}
	}

	@SubscribeEvent
	public void whenCraftedUnknownSweetPotato(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(UnknownSweetPotatoMod.unknown_sweet_potato)) {
			e.player.addStat(UnknownSweetPotatoMod.achievementUnknownSweetPotato, 1);
		}
	}

}
