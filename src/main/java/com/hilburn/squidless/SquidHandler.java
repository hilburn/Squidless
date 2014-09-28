package com.hilburn.squidless;

import net.minecraft.entity.EntityList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.event.entity.living.LivingPackSizeEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SquidHandler {
	@SuppressWarnings("rawtypes")
	private static Class squid =(Class) EntityList.stringToClassMapping.get("Squid");
	@SubscribeEvent
	public void squidSpawn(LivingSpawnEvent.CheckSpawn event){
		if (event.entityLiving.getClass()==squid){
			if (event.world.getEntitiesWithinAABB(squid, AxisAlignedBB.getBoundingBox(event.x-50, 0, event.z-50, event.x+50, 65, event.z+50)).size()>40) event.setResult(Result.DENY);
		}
	}
	@SubscribeEvent
	public void squidSpawnPack(LivingPackSizeEvent event){
		if (event.entityLiving.getClass()==squid){
			event.maxPackSize=2;
		}
	}
	
}
