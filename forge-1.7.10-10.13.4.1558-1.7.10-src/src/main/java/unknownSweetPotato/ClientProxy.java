package unknownSweetPotato;

import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
    public void init() {
        VillagerRegistry.instance().registerVillagerSkin(UnknownSweetPotatoMod.villagerFondjp01Profession, new ResourceLocation("unknownsweetpotato:textures/entity/entity_fondjp_01.png"));
        VillagerRegistry.instance().registerVillagerSkin(UnknownSweetPotatoMod.villagerFondjp02Profession, new ResourceLocation("unknownsweetpotato:textures/entity/entity_fondjp_02.png"));
    }
}