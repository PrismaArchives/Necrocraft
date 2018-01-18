package ncraft.capabilities.NecroEnergy;

import net.minecraft.nbt.NBTPrimitive;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public interface INecroEnergy {
	
	
	
	void setEnergy(int enmod);
	
	void useEnergy(int enmod);
	
	void fillEnergy(int enmod);
	
	// Lich progression related TODO: Make own Capability

	//int undeadLevel();
	
	//boolean isLich();



	int getEnergy();
	
	
}
 