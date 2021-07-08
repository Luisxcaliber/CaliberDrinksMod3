package com.luisxcaliber.caliberdrinksmod.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.luisxcaliber.caliberdrinksmod.world.gen.feature.WorldGenStructure;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenModStructures implements IWorldGenerator 
{
	public final WorldGenStructure GRAPEBUSH1 = new WorldGenStructure("grapebush1");
	public final WorldGenStructure GRAPEBUSH2 = new WorldGenStructure("grapebush2");
	public final WorldGenStructure GRAPEBUSH3 = new WorldGenStructure("grapebush3");
	
	public final WorldGenStructure ORANGEBUSH1 = new WorldGenStructure("orangebush1");
	public final WorldGenStructure ORANGEBUSH2 = new WorldGenStructure("orangebush2");
	public final WorldGenStructure ORANGEBUSH3 = new WorldGenStructure("orangebush3");
	
	public final WorldGenStructure LEMONBUSH1 = new WorldGenStructure("lemonbush1");
	public final WorldGenStructure LEMONBUSH2 = new WorldGenStructure("lemonbush2");
	public final WorldGenStructure LEMONBUSH3 = new WorldGenStructure("lemonbush3");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			
			break;
			
		case 0:
			
			generateStructure(GRAPEBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomePlains.class, BiomeForest.class);
			generateStructure(GRAPEBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(GRAPEBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(ORANGEBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomePlains.class, BiomeForest.class);
			generateStructure(ORANGEBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(ORANGEBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(LEMONBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomePlains.class, BiomeForest.class);
			generateStructure(LEMONBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(LEMONBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			break;
			
		case -1:
			
			break;
		}
	}
	
	private void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + 8;
		int z = (chunkZ * 16) + 8;
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x,y,z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private int calculateGenerationHeight(World world, int x, int z, Block topBlock)
	{
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}
}
