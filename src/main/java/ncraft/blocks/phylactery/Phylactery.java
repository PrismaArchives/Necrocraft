package ncraft.blocks.phylactery;

import ncraft.Ncraft;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;

public class Phylactery extends Block implements ITileEntityProvider {
	public Phylactery() {
		super(Material.IRON);
		setUnlocalizedName(Ncraft.MODID + ".phlactery");
		setRegistryName("phylactery");
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new PhylacteryTileEntity();
		
	}
	
		
	
	


}
	

