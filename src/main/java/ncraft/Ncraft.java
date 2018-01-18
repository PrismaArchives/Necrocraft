package ncraft;

import ncraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Ncraft.MODID, name = Ncraft.MODNAME, version = Ncraft.MODVERSION)
public class Ncraft {
	public static final String MODID = "necrocraft";
	public static final String MODNAME = "Necrocraft";
	public static final String MODVERSION = "0.0.1";
	
	@Mod.Instance
	public static Ncraft instance;
	
	
	@SidedProxy(clientSide = "ncraft.proxy.ClientProxy", serverSide = "ncraft.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent e) {
		proxy.Init(e);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
	
	
}
