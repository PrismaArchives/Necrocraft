package ncraft.capabilities.Staves;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class StavesProvider implements ICapabilitySerializable {

	@CapabilityInject(IStaves.class)
	
	public static final Capability<IStaves> STAVES_CAP = null;
	
	private IStaves instance = STAVES_CAP.getDefaultInstance();

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == STAVES_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == STAVES_CAP ? STAVES_CAP.<T> cast (this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return STAVES_CAP.getStorage().writeNBT(STAVES_CAP, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		STAVES_CAP.getStorage().readNBT(STAVES_CAP, this.instance, null, nbt);
	}

}
