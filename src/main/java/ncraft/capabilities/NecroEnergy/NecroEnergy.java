package ncraft.capabilities.NecroEnergy;

import ncraft.capabilities.UndeadLine.UndeadLevel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;

public class NecroEnergy implements INecroEnergy {
	
	
	int level = UndeadLevel.level;
	
	int energy = 0;
	int max_energy() {

		if (level == 1) {
			return 1000;		
		}
		else if (level == 2) {
			return 5000;
		}
		else if (level == 3) {
			return 10000;
		}
			return 250;
		
		
		
	}
	
	

	
	@Override
	public void setEnergy(int enmod) {
		this.energy = enmod;
	}


	@Override
	public void useEnergy(int enmod) {
		this.energy =- enmod;
		if (this.energy < 0) {
			this.energy = 0;
		}
	}

	@Override
	public void fillEnergy(int enmod) {
		this.energy =+ enmod;
		if (this.energy > max_energy()) {
			this.energy = max_energy();
		}
	}


	@Override
	public int getEnergy() {
		return this.energy;
	}






}