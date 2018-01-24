package ncraft.entities;

import java.util.UUID;

import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;

 

public class AllyZombie extends EntityZombie implements IEntityOwnable {

	public AllyZombie(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
		float maxHealth = this.getMaxHealth();
		maxHealth = 10.0F; 
	}

	@Override
	public UUID getOwnerId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

}
