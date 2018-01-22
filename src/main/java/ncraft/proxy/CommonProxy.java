package ncraft.proxy;

import java.beans.EventHandler;

import ncraft.Ncraft;
import ncraft.NecroEventHandler;
import ncraft.blocks.ModBlocks;
import ncraft.blocks.basic.BoneCobble;
import ncraft.blocks.phylactery.Phylactery;
import ncraft.blocks.phylactery.PhylacteryTileEntity;
import ncraft.capabilities.NecroEnergy.INecroEnergy;
import ncraft.capabilities.NecroEnergy.NecroEnergy;
import ncraft.capabilities.NecroEnergy.NecroProvider;
import ncraft.capabilities.NecroEnergy.NecroStorage;
import ncraft.capabilities.UndeadLine.IUndeadPlayer;
import ncraft.capabilities.UndeadLine.UndeadPlayer;
import ncraft.capabilities.UndeadLine.UndeadPlayerStorage;
import ncraft.items.debug.UndeadLevelChanger;
import ncraft.items.staves.SummoningStaff;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		CapabilityManager.INSTANCE.register(INecroEnergy.class,new NecroStorage(),NecroEnergy.class);
		CapabilityManager.INSTANCE.register(IUndeadPlayer.class, new UndeadPlayerStorage(), UndeadPlayer.class);
	} 
	
	public void Init(FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
	event.getRegistry().register(new BoneCobble());
	event.getRegistry().register(new Phylactery());
	GameRegistry.registerTileEntity(PhylacteryTileEntity.class, Ncraft.MODID +"_phylactery");
	
	
	}
	
	@SubscribeEvent 
	public static void registeritems(RegistryEvent.Register<Item> event) {
	event.getRegistry().register(new ItemBlock(ModBlocks.boneCobble).setRegistryName(ModBlocks.boneCobble.getRegistryName()));
	event.getRegistry().register(new ItemBlock(ModBlocks.phylactery).setRegistryName(ModBlocks.phylactery.getRegistryName())); // caused crashes(fixed remember modid is necrocraft not ncraft
	event.getRegistry().register(new SummoningStaff()); //caused crashes, forget to set registry name
	event.getRegistry().register(new UndeadLevelChanger()); // ^
	
	}
	
	
	
	
}
