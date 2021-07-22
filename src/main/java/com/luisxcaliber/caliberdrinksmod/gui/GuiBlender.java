package com.luisxcaliber.caliberdrinksmod.gui;

import com.luisxcaliber.caliberdrinksmod.blocks.BlockBlender;
import com.luisxcaliber.caliberdrinksmod.gui.containers.ContainerBlender;
import com.luisxcaliber.caliberdrinksmod.init.ModBlocks;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiBlender extends GuiContainer 
{
	private static final ResourceLocation GUI_BLACK_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/black_blender.png");
	private static final ResourceLocation GUI_RED_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/red_blender.png");
	private static final ResourceLocation GUI_GREEN_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/green_blender.png");
	private static final ResourceLocation GUI_BROWN_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/brown_blender.png");
	private static final ResourceLocation GUI_BLUE_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/blue_blender.png");
	private static final ResourceLocation GUI_PURPLE_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/purple_blender.png");
	private static final ResourceLocation GUI_CYAN_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/cyan_blender.png");
	private static final ResourceLocation GUI_LIGHT_GREY_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/light_grey_blender.png");
	private static final ResourceLocation GUI_GREY_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/grey_blender.png");
	private static final ResourceLocation GUI_PINK_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/pink_blender.png");
	private static final ResourceLocation GUI_LIME_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/lime_blender.png");
	private static final ResourceLocation GUI_YELLOW_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/yellow_blender.png");
	private static final ResourceLocation GUI_LIGHT_BLUE_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/light_blue_blender.png");
	private static final ResourceLocation GUI_MAGENTA_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/magenta_blender.png");
	private static final ResourceLocation GUI_ORANGE_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/orange_blender.png");
	private static final ResourceLocation GUI_WHITE_BLENDER = new ResourceLocation("caliberdrinksmod:textures/gui/white_blender.png");
	
	private final int type;
	
	public GuiBlender(InventoryPlayer playerInventory, BlockBlender block) 
	{
		super(new ContainerBlender(playerInventory));
		type = getType(block);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		bindGuiTexture();
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
	
	public void bindGuiTexture()
	{
		ResourceLocation resource;
		
		switch(type)
		{
            default:
                resource = GUI_BLACK_BLENDER;
                break;
            case 1:
            	resource = GUI_RED_BLENDER;
            	break;
            case 2:
            	resource = GUI_GREEN_BLENDER;
            	break;
            case 3:
            	resource = GUI_BROWN_BLENDER;
            	break;
            case 4:
            	resource = GUI_BLUE_BLENDER;
            	break;
            case 5:
            	resource = GUI_PURPLE_BLENDER;
            	break;
            case 6:
            	resource = GUI_CYAN_BLENDER;
            	break;
            case 7:
            	resource = GUI_LIGHT_GREY_BLENDER;
            	break;
            case 8:
            	resource = GUI_GREY_BLENDER;
            	break;
            case 9:
            	resource = GUI_PINK_BLENDER;
            	break;
            case 10:
            	resource = GUI_LIME_BLENDER;
            	break;
            case 11:
            	resource = GUI_YELLOW_BLENDER;
            	break;
            case 12:
            	resource = GUI_LIGHT_BLUE_BLENDER;
            	break;
            case 13:
            	resource = GUI_MAGENTA_BLENDER;
            	break;
            case 14:
            	resource = GUI_ORANGE_BLENDER;
            	break;
            case 15:
            	resource = GUI_WHITE_BLENDER;
            	break;
			
		}
		mc.getTextureManager().bindTexture(resource);
	}
	
	public int getType(BlockBlender block)
	{
		if(block == ModBlocks.RED_BLENDER) return 1;
		if(block == ModBlocks.GREEN_BLENDER) return 2;
		if(block == ModBlocks.BROWN_BLENDER) return 3;
		if(block == ModBlocks.BLUE_BLENDER) return 4;
		if(block == ModBlocks.PURPLE_BLENDER) return 5;
		if(block == ModBlocks.CYAN_BLENDER) return 6;
		if(block == ModBlocks.LIGHT_GREY_BLENDER) return 7;
		if(block == ModBlocks.GREY_BLENDER) return 8;
		if(block == ModBlocks.PINK_BLENDER) return 9;
		if(block == ModBlocks.LIME_BLENDER) return 10;
		if(block == ModBlocks.YELLOW_BLENDER) return 11;
		if(block == ModBlocks.LIGHT_BLUE_BLENDER) return 12;
		if(block == ModBlocks.MAGENTA_BLENDER) return 13;
		if(block == ModBlocks.ORANGE_BLENDER) return 14;
		if(block == ModBlocks.WHITE_BLENDER) return 15;
		return 0;
	}
}
