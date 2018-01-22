package ncraft.capabilities.Staves;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class StavesStorage implements IStorage<IStaves> {

	@Override
	public NBTBase writeNBT(Capability<IStaves> capability, IStaves instance, EnumFacing side) {
		return new NBTTagInt(instance.getStaff());
	}

	@Override
	public void readNBT(Capability<IStaves> capability, IStaves instance, EnumFacing side, NBTBase nbt) {
		instance.setStaff(((NBTPrimitive) nbt).getInt());
	}

}
