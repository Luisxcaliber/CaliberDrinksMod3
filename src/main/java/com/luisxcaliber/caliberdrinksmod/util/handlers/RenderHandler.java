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
				return new ModelResourceLocation("caliberdm:apple_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.GRAPE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:grape_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.ORANGE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:orange_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.FRUIT_PUNCH_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:fruit_punch_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.LEMONADE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:lemonade_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.BEETROOT_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:beetroot_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.PINK_LEMONADE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:pink_lemonade_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.GRAPEFRUIT_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:grapefruit_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.PINEAPPLE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:pineapple_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.MILK_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:milk_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.CHOCOLATE_MILK_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:chocolate_milk_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.STRAWBERRY_MILK_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:strawberry_milk_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.CARROT_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:carrot_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.STRAWBERRY_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:strawberry_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.WATERMELON_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:watermelon_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.HOT_CHOCOLATE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:hot_chocolate_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.COCONUT_WATER_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:coconut_water_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:tea_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.ICED_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:iced_tea_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.GREEN_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:green_tea_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.BLACK_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:black_tea_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.WHITE_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:white_tea_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.YELLOW_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:yellow_tea_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.LEMON_TEA_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:lemon_tea_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.WHITE_GRAPE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:white_grape_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.CRANBERRY_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:cranberry_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.TOMATO_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:tomato_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.POMEGRANATE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:pomegranate_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.PEACH_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:peach_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.MANGO_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:mango_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.COFFEE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:coffee_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.ICED_COFFEE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("caliberdm:iced_coffee_fluid", "fluid");
			}
		});
	}
}
