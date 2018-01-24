package ncraft.items;

import net.minecraft.potion.Potion;

public class WitherPotion extends Potion {

	protected WitherPotion(boolean isBadEffectIn, int liquidColorIn) {
		super(isBadEffectIn, liquidColorIn);
			boolean negeffect = this.isBadEffect();
					negeffect = true;
					this.setRegistryName(name);
					
		}

}
