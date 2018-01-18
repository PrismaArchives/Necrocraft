package ncraft.capabilities.NecroEnergy;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class NecroProvider implements ICapabilitySerializable<NBTBase> {

	@CapabilityInject(INecroEnergy.class)
	
	public static final Capability<INecroEnergy> NECRO_ENERGY_CAP = null;
	
	private INecroEnergy instance = NECRO_ENERGY_CAP.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return capability == NECRO_ENERGY_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return capability == NECRO_ENERGY_CAP ? NECRO_ENERGY_CAP.<T> cast (this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return NECRO_ENERGY_CAP.getStorage().writeNBT(NECRO_ENERGY_CAP, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		NECRO_ENERGY_CAP.getStorage().readNBT(NECRO_ENERGY_CAP, this.instance, null, nbt);
		
	}

}
