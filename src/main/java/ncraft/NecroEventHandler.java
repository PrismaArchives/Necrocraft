package ncraft;

import ncraft.capabilities.NecroEnergy.INecroEnergy;
import ncraft.capabilities.NecroEnergy.NecroProvider;
import ncraft.capabilities.UndeadLine.IUndeadPlayer;
import ncraft.capabilities.UndeadLine.UndeadPlayer;
import ncraft.capabilities.UndeadLine.UndeadPlayerProvider;
import ncraft.items.staves.SummoningStaff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.Clone;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;


@EventBusSubscriber
public class NecroEventHandler {
EntityPlayer undeadPlayer;
 	static int level = UndeadPlayer.level;

	
	
	@SubscribeEvent
	public static void LichDeath(LivingDeathEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			if  (level == 2) { 
				event.setCanceled(true);
				player.setHealth(20);
			}
		}
	}
	
	
	@SubscribeEvent
	public static void SentientUndead(LivingDeathEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			if  (level == 0) {
				System.out.println("Level Check Successful.");
				IUndeadPlayer level =player.getCapability(UndeadPlayerProvider.UNDEAD_PLAYER_CAP, null);
				level.setLevel(1);
				}
			}
		}
	
	
	@SubscribeEvent 
	public static void CloneUndeadPlayer(Clone event) {
		EntityPlayer player = event.getEntityPlayer();
		IUndeadPlayer level = player.getCapability(UndeadPlayerProvider.UNDEAD_PLAYER_CAP, null);
		INecroEnergy energy = player.getCapability(NecroProvider.NECRO_ENERGY_CAP, null);
		boolean wasDead = event.isWasDeath();
		if (wasDead = true) {
			level.setLevel(level.getLevel());
			energy.setEnergy(energy.getEnergy());
		}
	}

	
	@SubscribeEvent
	public static void HolySwordAttack(LivingAttackEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
				//if (event.getSource() == )
			}
		}
}
	
	
		
	
	
	

	
	

