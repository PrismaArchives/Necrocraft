package ncraft.capabilities.UndeadLine;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class UndeadPlayerStorage implements IStorage<IUndeadPlayer> {

	@Override
	public NBTBase writeNBT(Capability<IUndeadPlayer> capability, IUndeadPlayer instance, EnumFacing side) {
		return new	NBTTagInt(instance.getLevel());
	}

	@Override
	public void readNBT(Capability<IUndeadPlayer> capability, IUndeadPlayer instance, EnumFacing side, NBTBase nbt) {
		 instance.setLevel( ((NBTPrimitive) nbt).getInt());
	}

}
