package unknownSweetPotato;

import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
    public void init() {
        VillagerRegistry.instance().registerVillagerSkin(UnknownSweetPotatoMod.villagerFondjpProfession, new ResourceLocation("unknownsweetpotato:textures/entity/entity_fondjp.png"));
    }
}