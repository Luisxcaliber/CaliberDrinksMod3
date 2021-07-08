package com.luisxcaliber.caliberdrinksmod.world.gen.feature;

import java.util.Random;

import com.luisxcaliber.caliberdrinksmod.util.IStructure;
import com.luisxcaliber.caliberdrinksmod.util.Reference;

import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class WorldGenStructure extends WorldGenerator implements IStructure 
{
public String structureName;
	
	public WorldGenStructure(String name)
	{
		structureName = name;
	}
	
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) 
	{
		generateStructure(worldIn, position);
		return true;
	}
	
	public void generateStructure(World world, BlockPos pos)
	{
		MinecraftServer mcServer = world.getMinecraftServer();
		TemplateManager manager = worldServer.getStructureTemplateManager();
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, structureName);
		Template template = manager.get(mcServer, location);
		
		if(template != null)
		{
			Random rand = new Random();
			int r = rand.nextInt(40);
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
			//Rotation
			if(r <= 40 && r >= 30)
			{
				template.addBlocksToWorldChunk(world, pos, settings);
			}
			else if(r <= 20 && r >= 10)
			{
				template.addBlocksToWorldChunk(world, pos, settings1);
			}
			else if(r <= 30 && r >= 20)
			{
				template.addBlocksToWorldChunk(world, pos, settings2);
			}
			else if(r <= 10 && r >= 0)
			{
				template.addBlocksToWorldChunk(world, pos, settings3);
			}
		}
	}
}
