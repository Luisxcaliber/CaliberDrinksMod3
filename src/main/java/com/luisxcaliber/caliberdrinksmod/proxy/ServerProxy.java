package com.luisxcaliber.caliberdrinksmod.proxy;

import net.minecraft.entity.player.EntityPlayer;

public class ServerProxy implements ProxyInterface 
{
	@Override
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
