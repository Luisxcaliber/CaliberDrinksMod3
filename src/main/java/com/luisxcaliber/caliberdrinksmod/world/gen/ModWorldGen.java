package com.luisxcaliber.caliberdrinksmod.world.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		
		switch(world.provider.getDimension())
		{
		case -1: generateNether(world, random, blockX, blockZ);
		break;
		case 0: generateOverworld(world, random, blockX, blockZ);
		break;
		case 1: generateEnd(world, random, blockX, blockZ);
		break;
		}
	}
	
	private void generateNether(World world, Random rand, int blockX, int blockZ) 
	{
			
	}
	//Note: Figure out world generation for bushes
	private void generateOverworld(World world, Random rand, int blockX, int blockZ) 
	{
		WorldGenBush.generateBush();
	}
	
	private void generateEnd(World world, Random rand, int blockX, int blockZ) 
	{
		
	}
}
