package ncraft.capabilities;

import ncraft.Ncraft;
import ncraft.capabilities.NecroEnergy.NecroProvider;
import ncraft.capabilities.Staves.StavesProvider;
import ncraft.capabilities.UndeadLine.UndeadPlayerProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class CapabilityHandler {
	public static final ResourceLocation NECRO_ENERGY_CAP = new ResourceLocation(Ncraft.MODID, "necroenergy");
	public static final ResourceLocation UNDEAD_LEVEL_CAP = new ResourceLocation(Ncraft.MODID, "undeadlevel");
	//public static final ResourceLocation STAVES_CAP = new ResourceLocation(Ncraft.MODID, "staves");
	
	@SubscribeEvent
	public void attachCapabilityPlayer(AttachCapabilitiesEvent<Entity> event ) {
				
		event.addCapability(NECRO_ENERGY_CAP,new NecroProvider());
		
		event.addCapability(UNDEAD_LEVEL_CAP,new UndeadPlayerProvider()); //accidently used necroprovider
	}
	
	@SubscribeEvent
	public void attachCapabilityItems(AttachCapabilitiesEvent<ItemStack> event) {
		//event.addCapability(NECRO_ENERGY_CAP, new NecroProvider());
		//event.addCapability(STAVES_CAP, new StavesProvider());
	}
	
	
	
	
}
