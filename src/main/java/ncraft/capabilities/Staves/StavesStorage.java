package ncraft.capabilities.Staves;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class StavesStorage implements IStorage<IStaves> {

	@Override
	public NBTBase writeNBT(Capability<IStaves> capability, IStaves instance, EnumFacing side) {
		return null;
	}

	@Override
	public void readNBT(Capability<IStaves> capability, IStaves instance, EnumFacing side, NBTBase nbt) {
		
	}

}
