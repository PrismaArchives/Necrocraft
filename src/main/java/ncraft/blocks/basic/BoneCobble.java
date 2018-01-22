package ncraft.blocks.basic;

import net.minecraft.block.material.Material;
import ncraft.Ncraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class BoneCobble extends Block {
	public BoneCobble() {
		super(Material.ROCK);
		setUnlocalizedName(Ncraft.MODID + ".bonecobble");
		setRegistryName("bonecobble");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		
		
	}

}
