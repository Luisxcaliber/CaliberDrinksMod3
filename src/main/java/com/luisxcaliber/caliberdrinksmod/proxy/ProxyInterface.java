package com.luisxcaliber.caliberdrinksmod.proxy;

import net.minecraft.entity.player.EntityPlayer;

public interface ProxyInterface 
{	
	EntityPlayer getClientPlayer();
	
	boolean isSinglePlayer();
	
	boolean isDedicatedServer();
}
