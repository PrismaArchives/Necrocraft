package ncraft.items;


import ncraft.Ncraft;
import ncraft.capabilities.NecroEnergy.INecroEnergy;
import ncraft.capabilities.UndeadLine.UndeadPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;



public class UndeadLevelChanger extends Item  {

	
	  public UndeadLevelChanger(){
			setRegistryName("undeadlevelchanger");       
		    setUnlocalizedName(Ncraft.MODID + ".undeadlevelchanger");   
		    this.setCreativeTab(CreativeTabs.MISC);
		    } //don't forget will cause crashes
 

	 @SubscribeEvent
	public void OnChangerRightClick (PlayerInteractEvent.RightClickItem event) {
		 UndeadPlayer.level = UndeadPlayer.level + 1;
		 
	}






	
} 