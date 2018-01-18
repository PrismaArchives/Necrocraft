package ncraft.capabilities.UndeadLine;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class UndeadLevelProvider implements ICapabilitySerializable<NBTBase> {

	@CapabilityInject(IUndeadPlayer.class)
	
	public static final Capability<IUndeadPlayer> UNDEAD_PLAYER_CAP = null;
	
	private IUndeadPlayer instance = UNDEAD_PLAYER_CAP.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return capability == UNDEAD_PLAYER_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return capability == UNDEAD_PLAYER_CAP ? UNDEAD_PLAYER_CAP.<T> cast (this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return UNDEAD_PLAYER_CAP.getStorage().writeNBT(UNDEAD_PLAYER_CAP, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		UNDEAD_PLAYER_CAP.getStorage().readNBT(UNDEAD_PLAYER_CAP, this.instance, null, nbt);
		
	}

}
