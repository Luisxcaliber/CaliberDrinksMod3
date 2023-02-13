package com.luisxcaliber.caliberdrinksmod.util.handlers;

import com.luisxcaliber.caliberdrinksmod.events.EventBucketFluids;

import net.minecraftforge.common.MinecraftForge;

public class EventHandler 
{
	public static void registerEvents()
	{
		EventBucketFluids eventbucketfluids = new EventBucketFluids();
		
		MinecraftForge.EVENT_BUS.register(eventbucketfluids);
	}
}
