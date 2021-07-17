package com.luisxcaliber.caliberdrinksmod.items.tools;

import javax.annotation.Nullable;

import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;
import com.luisxcaliber.caliberdrinksmod.fluids.FluidHandlerModBucket;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidActionResult;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.UniversalBucket;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.items.ItemHandlerHelper;

@SuppressWarnings("deprecation")
public class ItemModBucket extends UniversalBucket 
{
	private final ItemStack empty = new ItemStack(this);

	public ItemModBucket(String name) 
	{
		this(name, Fluid.BUCKET_VOLUME);
	}

	public ItemModBucket(String name, int capacity) 
	{
		super(capacity, ItemStack.EMPTY, true);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(CaliberDrinksMod.tabCaliberDrinksMod);
	}

	@Override
	public void getSubItems(@Nullable CreativeTabs tab, NonNullList<ItemStack> subItems) 
	{
		if (!this.isInCreativeTab(tab)) return;

		subItems.add(empty);

		for (Fluid fluid : FluidRegistry.getRegisteredFluids().values()) 
		{
			FluidStack fs = new FluidStack(fluid, getCapacity());
			ItemStack stack = new ItemStack(this);
			IFluidHandlerItem fluidHandler = stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
			if (fluidHandler != null && fluidHandler.fill(fs, true) == fs.amount) 
			{
				ItemStack filled = fluidHandler.getContainer();
				subItems.add(filled);
			}
		}
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) 
	{
		FluidStack fluidStack = getFluid(stack);
		String unlocalisedName = this.getUnlocalizedNameInefficiently(stack);

		if (fluidStack == null) {
			return I18n.translateToLocal(unlocalisedName + ".name").trim();
		}

		String fluidUnlocalisedName = unlocalisedName + ".filled." + fluidStack.getFluid().getName() + ".name";
		if (I18n.canTranslate(fluidUnlocalisedName)) {
			return I18n.translateToLocal(fluidUnlocalisedName);
		}

		return I18n.translateToLocalFormatted(unlocalisedName + ".filled.name", fluidStack.getLocalizedName());
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) 
	{
		ItemStack heldItem = player.getHeldItem(hand);
		FluidStack fluidStack = getFluid(heldItem);

		if (fluidStack != null) return super.onItemRightClick(world, player, hand);

		RayTraceResult target = this.rayTrace(world, player, true);

		if (target == null || target.typeOfHit != RayTraceResult.Type.BLOCK) 
		{
			return new ActionResult<>(EnumActionResult.PASS, heldItem);
		}

		BlockPos pos = target.getBlockPos();

		ItemStack singleBucket = heldItem.copy();
		singleBucket.setCount(1);

		FluidActionResult filledResult = FluidUtil.tryPickUpFluid(singleBucket, player, world, pos, target.sideHit);
		if (filledResult.isSuccess()) 
		{
			ItemStack filledBucket = filledResult.result;

			if (player.capabilities.isCreativeMode)
				return new ActionResult<>(EnumActionResult.SUCCESS, heldItem);

			heldItem.shrink(1);
			if (heldItem.isEmpty())
				return new ActionResult<>(EnumActionResult.SUCCESS, filledBucket);

			ItemHandlerHelper.giveItemToPlayer(player, filledBucket);

			return new ActionResult<>(EnumActionResult.SUCCESS, heldItem);
		}
		
		return new ActionResult<>(EnumActionResult.PASS, heldItem);
	}


	@Override
	public ItemStack getEmpty() 
	{
		return empty;
	}

	@Nullable
	@Override
	public FluidStack getFluid(ItemStack container) 
	{
		return FluidUtil.getFluidContained(container);
	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) 
	{
		return new FluidHandlerModBucket(stack, getCapacity());
	}
}
