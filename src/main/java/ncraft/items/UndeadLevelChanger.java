package ncraft.items;


import ncraft.Ncraft;
import ncraft.capabilities.NecroEnergy.INecroEnergy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;



public class UndeadLevelChanger extends Item  {
	
	  public UndeadLevelChanger(){
			setRegistryName("undeadlevelchanger");       
		    setUnlocalizedName(Ncraft.MODID + ".undeadlevelchanger");   
		    this.setCreativeTab(CreativeTabs.MISC);
		    } //don't forget will cause crashes
 

	  
	public void OnChangerRightClick (PlayerInteractEvent.RightClickItem event) {
		/*int level = undeadLevel();
				if (level <= 2)  {
			level = level + 1;
		
		}
		level = 0;
	*/}
 






	
} 