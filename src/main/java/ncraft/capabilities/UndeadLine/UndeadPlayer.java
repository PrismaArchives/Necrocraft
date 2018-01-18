package ncraft.capabilities.UndeadLine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UndeadPlayer implements IUndeadPlayer {

	
	
	
	
	
	
	
	
	
	@Override
	public void setLevel(int currentlv) {
		this.level = currentlv;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}
	
	
	
	public static int level = 0;
	boolean isSentientUndead()
	{
		if (level == 1) {
			return true;
		}
		return false;
	}
	

	UndeadPlayer(EntityPlayer player) {

	}





}
