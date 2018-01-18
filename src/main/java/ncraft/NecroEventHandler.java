package ncraft;

import ncraft.capabilities.UndeadLine.UndeadPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
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
			if  (level == 2) { // change to level 2, Lesser Lich + for final implemenation
				event.setCanceled(true);
				player.setHealth(20);
		
			}
		}
	}
	
	
	@SubscribeEvent
	public static void SentientUndead(LivingDeathEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			if  (level == 0) { // change to level 2, Lesser Lich + for final implemenation
				PotionEffect potion = player.getActivePotionEffect(null);
			if (potion == player.getActivePotionEffect(MobEffects.WITHER)) {
					UndeadPlayer.level = 1;
				}
			}
		}
	}
	
	
		
	
	
	
}
	
	

