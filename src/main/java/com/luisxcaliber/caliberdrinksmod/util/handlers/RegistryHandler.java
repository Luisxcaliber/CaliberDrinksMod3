package com.luisxcaliber.caliberdrinksmod.util.handlers;

import java.util.LinkedList;
import java.util.List;

import com.luisxcaliber.caliberdrinksmod.init.ModBlocks;
import com.luisxcaliber.caliberdrinksmod.init.ModFluids;
import com.luisxcaliber.caliberdrinksmod.init.ModItems;
import com.luisxcaliber.caliberdrinksmod.items.SubItems;
import com.luisxcaliber.caliberdrinksmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber
public class RegistryHandler 
{
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class Items
	{
		private static final List<Item> ITEMS = new LinkedList<>();
		
		public static void add(Item item)
		{
			ITEMS.add(item);
		}
		
		public static List<Item> getItems()
		{
			return ITEMS;
		}
		
		@SubscribeEvent
		public static void register(final RegistryEvent.Register<Item> event)
		{
			ITEMS.forEach(item -> event.getRegistry().register(item));
		}
	}
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class Blocks
	{
		private static final List<Block> BLOCKS = new LinkedList<>();
		
		public static void add(Block block)
		{
			BLOCKS.add(block);
		}
		
		@SubscribeEvent
		public static void register(final RegistryEvent.Register<Block> event)
		{
			BLOCKS.forEach(block -> event.getRegistry().register(block));
			RenderHandler.registerCustomStates();
		}
	}
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
	public static class Models
	{
		@SubscribeEvent
		public static void register(ModelRegistryEvent event)
		{
			Items.ITEMS.forEach(Models::registerRender);
		}
		
		private static void registerRender(Item item)
		{
			if(item instanceof SubItems)
			{
				NonNullList<ResourceLocation> modelLocations = ((SubItems) item).getModels();
				for(int i = 0; i < modelLocations.size(); i++)
				{
					ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(modelLocations.get(i), "inventory"));
				}
			}
			else
			{
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
			}
		}
	}
	
	public static void init()
	{
		ModFluids.register();
		//GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		ModItems.register();
		ModBlocks.register();
	}
}
