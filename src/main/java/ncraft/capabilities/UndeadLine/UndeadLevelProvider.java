package ncraft.capabilities.UndeadLine;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class UndeadLevelProvider implements ICapabilitySerializable<NBTBase> {

	@CapabilityInject(IUndeadLevel.class)
	
	public static final Capability<IUndeadLevel> UNDEAD_LEVEL_CAP = null;
	
	private IUndeadLevel instance = UNDEAD_LEVEL_CAP.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return capability == UNDEAD_LEVEL_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return capability == UNDEAD_LEVEL_CAP ? UNDEAD_LEVEL_CAP.<T> cast (this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return UNDEAD_LEVEL_CAP.getStorage().writeNBT(UNDEAD_LEVEL_CAP, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		UNDEAD_LEVEL_CAP.getStorage().readNBT(UNDEAD_LEVEL_CAP, this.instance, null, nbt);
		
	}

}
