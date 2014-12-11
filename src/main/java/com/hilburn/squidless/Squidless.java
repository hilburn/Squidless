package com.hilburn.squidless;

import java.io.File;

import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;


@Mod(modid = ModInformation.MODID, name = ModInformation.NAME, version = ModInformation.VERSION, acceptableRemoteVersions = "*")
/**
 * Squidless
 * 
 * @author Charlie Paterson
 * @license GNU General Public License v3
 **/
public class Squidless {
	public static File config;
	@Instance(ModInformation.MODID)
	public static Squidless instance = new Squidless();

	@EventHandler
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new SquidHandler());
	}

	
}