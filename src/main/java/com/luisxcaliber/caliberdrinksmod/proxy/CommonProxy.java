package com.luisxcaliber.caliberdrinksmod.proxy;

import net.minecraft.entity.player.EntityPlayer;

public class CommonProxy implements ProxyInterface
{
	public EntityPlayer getClientPlayer()
	{
		return null;
	}
	
	@Override
	public boolean isSinglePlayer() 
	{
		return false;
	}

	@Override
	public boolean isDedicatedServer() 
	{
		return true;
	}
}
