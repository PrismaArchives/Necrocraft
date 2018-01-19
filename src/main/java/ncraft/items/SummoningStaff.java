package ncraft.items;

import ncraft.Ncraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SummoningStaff extends Item {
    public SummoningStaff(){
	setRegistryName("summoningstaff");       
     setUnlocalizedName(Ncraft.MODID + ".summoningstaff");     
     this.setCreativeTab(CreativeTabs.COMBAT);
    } //don't forget will cause crashes
    
}
