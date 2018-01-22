package ncraft.items.debug;


import ncraft.Ncraft;
import ncraft.capabilities.NecroEnergy.INecroEnergy;
import ncraft.capabilities.UndeadLine.IUndeadPlayer;
import ncraft.capabilities.UndeadLine.UndeadPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber
public class UndeadLevelChanger extends Item  {
	
	  public UndeadLevelChanger(){
			setRegistryName("undeadlevelchanger");       
		    setUnlocalizedName(Ncraft.MODID + ".undeadlevelchanger");   
		    this.setCreativeTab(CreativeTabs.MISC);
		    } //don't forget will cause crashes
 




	
} 