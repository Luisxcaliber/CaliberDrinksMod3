package com.luisxcaliber.caliberdrinksmod.util.handlers;

import com.luisxcaliber.caliberdrinksmod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler 
{
	public static void registerCustomStates()
	{
		ModelLoader.setCustomStateMapper(ModBlocks.APPLE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "apple_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.GRAPE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "grape_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.ORANGE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "orange_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.FRUIT_PUNCH_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "fruit_punch_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.LEMONADE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "lemonade_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.BEETROOT_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "beetroot_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.PINK_LEMONADE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "pink_lemonade_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.GRAPEFRUIT_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "grapefruit_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.PINEAPPLE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "pineapple_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.MILK_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "milk_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.CHOCOLATE_MILK_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "chocolate_milk_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.STRAWBERRY_MILK_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "strawberry_milk_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.CARROT_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "carrot_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.STRAWBERRY_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "strawberry_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.WATERMELON_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "watermelon_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.HOT_CHOCOLATE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "hot_chocolate_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.COCONUT_WATER_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "coconut_water_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "tea_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.ICED_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "iced_tea_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.GREEN_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "green_tea_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.BLACK_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "black_tea_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.WHITE_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "white_tea_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.YELLOW_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "yellow_tea_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.LEMON_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "lemon_tea_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.WHITE_GRAPE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "white_grape_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.CRANBERRY_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "cranberry_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.TOMATO_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "tomato_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.POMEGRANATE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "pomegranate_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.PEACH_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "peach_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.MANGO_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "mango_juice_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.COFFEE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "coffee_fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.ICED_COFFEE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fluid_drink", "iced_coffee_fluid");
			}
		});
	}
}
