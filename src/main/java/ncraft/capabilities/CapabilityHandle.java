package ncraft.capabilities;

import ncraft.Ncraft;
import ncraft.capabilities.NecroEnergy.NecroProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityHandle {
	public static final ResourceLocation NECRO_ENERGY_CAP = new ResourceLocation(Ncraft.MODID, "necro energy");
	public static final ResourceLocation UNDEAD_LEVEL_CAP = new ResourceLocation(Ncraft.MODID, "undead level");

	
	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent<Entity> event ) {
		
		event.addCapability(NECRO_ENERGY_CAP,new NecroProvider());
		
		event.addCapability(UNDEAD_LEVEL_CAP,new NecroProvider());
	}
	
}
