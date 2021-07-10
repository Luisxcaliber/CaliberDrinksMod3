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
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSavanna;
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
	
	public final WorldGenStructure GRAPEFRUITBUSH1 = new WorldGenStructure("grapefruitbush1");
	public final WorldGenStructure GRAPEFRUITBUSH2 = new WorldGenStructure("grapefruitbush2");
	public final WorldGenStructure GRAPEFRUITBUSH3 = new WorldGenStructure("grapefruitbush3");
	
	public final WorldGenStructure PINEAPPLEBUSH1 = new WorldGenStructure("pineapplebush1");
	public final WorldGenStructure PINEAPPLEBUSH2 = new WorldGenStructure("pineapplebush2");
	public final WorldGenStructure PINEAPPLEBUSH3 = new WorldGenStructure("pineapplebush3");
	
	public final WorldGenStructure STRAWBERRYBUSH1 = new WorldGenStructure("strawberrybush1");
	public final WorldGenStructure STRAWBERRYBUSH2 = new WorldGenStructure("strawberrybush2");
	public final WorldGenStructure STRAWBERRYBUSH3 = new WorldGenStructure("strawberrybush3");
	
	public final WorldGenStructure COFFEEBEANBUSH1 = new WorldGenStructure("coffeebeanbush1");
	public final WorldGenStructure COFFEEBEANBUSH2 = new WorldGenStructure("coffeebeanbush2");
	public final WorldGenStructure COFFEEBEANBUSH3 = new WorldGenStructure("coffeebeanbush3");
	
	public final WorldGenStructure COCONUTBUSH1 = new WorldGenStructure("coconutbush1");
	public final WorldGenStructure COCONUTBUSH2 = new WorldGenStructure("coconutbush2");
	public final WorldGenStructure COCONUTBUSH3 = new WorldGenStructure("coconutbush3");
	
	public final WorldGenStructure TEALEAFBUSH1 = new WorldGenStructure("tealeafbush1");
	public final WorldGenStructure TEALEAFBUSH2 = new WorldGenStructure("tealeafbush2");
	public final WorldGenStructure TEALEAFBUSH3 = new WorldGenStructure("tealeafbush3");
	
	public final WorldGenStructure WHITEGRAPEBUSH1 = new WorldGenStructure("whitegrapebush1");
	public final WorldGenStructure WHITEGRAPEBUSH2 = new WorldGenStructure("whitegrapebush2");
	public final WorldGenStructure WHITEGRAPEBUSH3 = new WorldGenStructure("whitegrapebush3");
	
	public final WorldGenStructure CRANBERRYBUSH1 = new WorldGenStructure("cranberrybush1");
	public final WorldGenStructure CRANBERRYBUSH2 = new WorldGenStructure("cranberrybush2");
	public final WorldGenStructure CRANBERRYBUSH3 = new WorldGenStructure("cranberrybush3");
	
	public final WorldGenStructure TOMATOBUSH1 = new WorldGenStructure("tomatobush1");
	public final WorldGenStructure TOMATOBUSH2 = new WorldGenStructure("tomatobush2");
	public final WorldGenStructure TOMATOBUSH3 = new WorldGenStructure("tomatobush3");
	
	public final WorldGenStructure POMEGRANATEBUSH1 = new WorldGenStructure("pomegranatebush1");
	public final WorldGenStructure POMEGRANATEBUSH2 = new WorldGenStructure("pomegranatebush2");
	public final WorldGenStructure POMEGRANATEBUSH3 = new WorldGenStructure("pomegranatebush3");
	
	public final WorldGenStructure PEACHBUSH1 = new WorldGenStructure("peachbush1");
	public final WorldGenStructure PEACHBUSH2 = new WorldGenStructure("peachbush2");
	public final WorldGenStructure PEACHBUSH3 = new WorldGenStructure("peachbush3");
	
	public final WorldGenStructure MANGOBUSH1 = new WorldGenStructure("mangobush1");
	public final WorldGenStructure MANGOBUSH2 = new WorldGenStructure("mangobush2");
	public final WorldGenStructure MANGOBUSH3 = new WorldGenStructure("mangobush3");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			
			break;
			
		case 0:
			
			generateStructure(GRAPEBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class, BiomePlains.class);
			generateStructure(GRAPEBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(GRAPEBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(ORANGEBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class, BiomePlains.class);
			generateStructure(ORANGEBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(ORANGEBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(LEMONBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class, BiomePlains.class);
			generateStructure(LEMONBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(LEMONBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(GRAPEFRUITBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeSavanna.class);
			generateStructure(GRAPEFRUITBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeSavanna.class);
			generateStructure(GRAPEFRUITBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeSavanna.class);
			
			generateStructure(PINEAPPLEBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(PINEAPPLEBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(PINEAPPLEBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(STRAWBERRYBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class, BiomePlains.class);
			generateStructure(STRAWBERRYBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(STRAWBERRYBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(COFFEEBEANBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			generateStructure(COFFEEBEANBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			generateStructure(COFFEEBEANBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			
			generateStructure(COCONUTBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			generateStructure(COCONUTBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			generateStructure(COCONUTBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			
			generateStructure(TEALEAFBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			generateStructure(TEALEAFBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			generateStructure(TEALEAFBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			
			generateStructure(WHITEGRAPEBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(WHITEGRAPEBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(WHITEGRAPEBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(CRANBERRYBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(CRANBERRYBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(CRANBERRYBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(TOMATOBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(TOMATOBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(TOMATOBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(POMEGRANATEBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeSavanna.class);
			generateStructure(POMEGRANATEBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeSavanna.class);
			generateStructure(POMEGRANATEBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeSavanna.class);
			
			generateStructure(PEACHBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class, BiomePlains.class);
			generateStructure(PEACHBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			generateStructure(PEACHBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeForest.class);
			
			generateStructure(MANGOBUSH1, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			generateStructure(MANGOBUSH2, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			generateStructure(MANGOBUSH3, world, random, chunkX, chunkZ, 120, Blocks.GRASS, BiomeJungle.class);
			
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
