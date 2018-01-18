package ncraft.capabilities.NecroEnergy;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class NecroStorage implements IStorage<INecroEnergy> {

	@Override
	public NBTBase writeNBT(Capability<INecroEnergy> capability, INecroEnergy instance, EnumFacing side) {
		return new	NBTTagInt(instance.getEnergy());
	}

	@Override
	public void readNBT(Capability<INecroEnergy> capability, INecroEnergy instance, EnumFacing side, NBTBase nbt) {
		 instance.setEnergy( ((NBTPrimitive) nbt).getInt());
	}

}
