package com.luisxcaliber.caliberdrinksmod.events;

import com.luisxcaliber.caliberdrinksmod.init.ModItems;
import com.luisxcaliber.caliberdrinksmod.init.ModMaterials;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventBucketFluids 
{
	@SubscribeEvent
	public void fillBucket(FillBucketEvent event)
	{
		RayTraceResult target = event.getTarget();
	    IBlockState state = event.getWorld().getBlockState(target.getBlockPos());
	    BlockPos blockpos = event.getTarget().getBlockPos();
		Material material = state.getMaterial();
		
		if(target.getBlockPos() != null)
		{
			if(material == ModMaterials.APPLE_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.APPLE_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.GRAPE_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.GRAPE_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.ORANGE_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.ORANGE_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.FRUIT_PUNCH && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.FRUIT_PUNCH_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.LEMONADE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.LEMONADE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.PINK_LEMONADE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.PINK_LEMONADE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.BEETROOT_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.BEETROOT_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.GRAPEFRUIT_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.GRAPEFRUIT_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.PINEAPPLE_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.PINEAPPLE_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.CHOCOLATE_MILK && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.CHOCOLATE_MILK_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.STRAWBERRY_MILK && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.STRAWBERRY_MILK_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.HOT_CHOCOLATE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.HOT_CHOCOLATE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.CARROT_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.CARROT_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.STRAWBERRY_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.STRAWBERRY_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.WATERMELON_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.WATERMELON_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.COCONUT_WATER && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.COCONUT_WATER_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.TEA && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.TEA_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.ICED_TEA && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.ICED_TEA_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.GREEN_TEA && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.GREEN_TEA_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.BLACK_TEA && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.BLACK_TEA_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.WHITE_TEA && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.WHITE_TEA_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.YELLOW_TEA && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.YELLOW_TEA_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.LEMON_TEA && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.LEMON_TEA_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.WHITE_GRAPE_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.WHITE_GRAPE_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.CRANBERRY_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.CRANBERRY_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.TOMATO_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.TOMATO_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.POMEGRANATE_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.POMEGRANATE_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.PEACH_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.PEACH_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.MANGO_JUICE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.MANGO_JUICE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.COFFEE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.COFFEE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
			
			if(material == ModMaterials.ICED_COFFEE && ((Integer)state.getValue(BlockLiquid.LEVEL)).intValue() == 0) 
		    {
		    	event.setResult(Result.ALLOW);
		    	event.getEntityPlayer().playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0f, 1.0f);
		        event.setFilledBucket(new ItemStack(ModItems.ICED_COFFEE_BUCKET, 1));
		        event.getWorld().setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
		    }
		}
	}
}
