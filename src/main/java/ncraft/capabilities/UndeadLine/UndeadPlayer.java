package ncraft.capabilities.UndeadLine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UndeadPlayer implements IUndeadPlayer {

	
	
	
	
	public static int level = 0;
	
	
	
	
	@Override
	public void setLevel(int currentlv) {
		this.level = currentlv;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}
	
	
	

	boolean isSentientUndead(EntityPlayer player)
	{
		if (level == 1) {
			
			return true;
		}
		return false;
	}
	




}
