package ncraft.items.staves;

import ncraft.Ncraft;
import ncraft.capabilities.Staves.StavesType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SummoningStaff extends Item {
   
	boolean Staff = StavesType.isStaff();
	
	
	public SummoningStaff(){
     setRegistryName("summoningstaff");       
     setUnlocalizedName(Ncraft.MODID + ".summoningstaff");     
     this.setCreativeTab(CreativeTabs.COMBAT);
     this.maxStackSize = 1;
    } //don't forget will cause crashes


    
    
    
}
