package ncraft.capabilities.UndeadLine;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UndeadLevel implements IUndeadLevel {

	
	
	public static int level = 0;
	boolean isSentientUndead()
	{
		if (level == 1) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	@Override
	public void setLevel(int currentlv) {
		this.level = currentlv;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}
	
	
	
	
	







}
