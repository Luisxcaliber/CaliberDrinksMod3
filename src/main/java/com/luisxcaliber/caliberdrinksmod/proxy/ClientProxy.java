package com.luisxcaliber.caliberdrinksmod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class ClientProxy implements ProxyInterface 
{
	@Override
	public EntityPlayer getClientPlayer()
	{
		return Minecraft.getMinecraft().player;
	}
	
	@Override
	public boolean isSinglePlayer()
	{
		return Minecraft.getMinecraft().isSingleplayer();
	}
	
	@Override
	public boolean isDedicatedServer()
	{
		return false;
	}
}
