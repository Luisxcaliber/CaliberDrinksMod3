package com.luisxcaliber.caliberdrinksmod.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;
import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;
import com.luisxcaliber.caliberdrinksmod.tileentity.TileEntityBlender;
import com.luisxcaliber.caliberdrinksmod.util.Reference;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBlender extends BlockBase 
{
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public BlockBlender(String name, Material material) 
	{
		super(name, material);
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{
			playerIn.openGui(CaliberDrinksMod.instance, Reference.GUI_BLENDER, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		
		return true;
	}
	
	public static void setState(boolean active, World worldIn, BlockPos pos)
	{
		TileEntity tileentity = worldIn.getTileEntity(pos);
		
		if(tileentity != null)
		{
			tileentity.validate();
			worldIn.setTileEntity(pos, tileentity);
		}
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}
	
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileEntityBlender();
	}
	
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
	
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) 
	{
		if(!worldIn.isRemote)
		{
			IBlockState north = worldIn.getBlockState(pos.north());
			IBlockState south = worldIn.getBlockState(pos.south());
			IBlockState west = worldIn.getBlockState(pos.west());
			IBlockState east = worldIn.getBlockState(pos.east());
			EnumFacing face = (EnumFacing)state.getValue(FACING);
			
			if(face == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock()) face = EnumFacing.SOUTH;
			else if(face == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock()) face = EnumFacing.NORTH;
			else if(face == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock()) face = EnumFacing.EAST;
			else if(face == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock()) face = EnumFacing.WEST;
			worldIn.setBlockState(pos, state.withProperty(FACING, face), 2);
		}
	}
	
	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) 
	{
		worldIn.setBlockState(pos, getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}
	
	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) 
	{
		return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	}
	
	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) 
	{
		return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {FACING});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		EnumFacing facing = EnumFacing.getFront(meta);
		if(facing.getAxis() == EnumFacing.Axis.Y) facing = EnumFacing.SOUTH;
		return getDefaultState().withProperty(FACING, facing);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((EnumFacing)state.getValue(FACING)).getIndex();
	}
	
	private static final AxisAlignedBB LEG1 = new AxisAlignedBB(0.625, 0, 0.25, 0.75, 0.125, 0.375);
	private static final AxisAlignedBB LEG2 = new AxisAlignedBB(0.25, 0, 0.25, 0.375, 0.125, 0.375);
	private static final AxisAlignedBB LEG3 = new AxisAlignedBB(0.625, 0, 0.625, 0.75, 0.125, 0.75);
	private static final AxisAlignedBB LEG4 = new AxisAlignedBB(0.25, 0, 0.625, 0.375, 0.125, 0.75);
	private static final AxisAlignedBB BPART1 = new AxisAlignedBB(0.375, 0.062, 0.25, 0.625, 0.125, 0.75);
	private static final AxisAlignedBB BPART2 = new AxisAlignedBB(0.625, 0.062, 0.375, 0.75, 0.125, 0.625);
	private static final AxisAlignedBB BPART3 = new AxisAlignedBB(0.25, 0.062, 0.375, 0.375, 0.125, 0.625);
	private static final AxisAlignedBB BPART4 = new AxisAlignedBB(0.25, 0.125, 0.25, 0.75, 0.188, 0.75);
	private static final AxisAlignedBB BPART5 = new AxisAlignedBB(0.312, 0.188, 0.312, 0.688, 0.375, 0.688);
	private static final AxisAlignedBB BPART6 = new AxisAlignedBB(0.562, 0.25, 0.25, 0.625, 0.312, 0.312);
	private static final AxisAlignedBB BPART7 = new AxisAlignedBB(0.375, 0.25, 0.25, 0.438, 0.312, 0.312);
	private static final AxisAlignedBB BPART8 = new AxisAlignedBB(0.375, 0.375, 0.375, 0.625, 0.438, 0.438);
	private static final AxisAlignedBB BPART9 = new AxisAlignedBB(0.375, 0.375, 0.562, 0.625, 0.438, 0.625);
	private static final AxisAlignedBB BPART10 = new AxisAlignedBB(0.562, 0.375, 0.438, 0.625, 0.438, 0.562);
	private static final AxisAlignedBB BPART11 = new AxisAlignedBB(0.375, 0.375, 0.438, 0.438, 0.438, 0.562);
	private static final AxisAlignedBB BPART12 = new AxisAlignedBB(0.438, 0.375, 0.438, 0.562, 0.438, 0.562);
	private static final AxisAlignedBB JPART1 = new AxisAlignedBB(0.438, 0.438, 0.375, 0.562, 0.469, 0.438);
	private static final AxisAlignedBB JPART2 = new AxisAlignedBB(0.438, 0.438, 0.562, 0.562, 0.469, 0.625);
	private static final AxisAlignedBB JPART3 = new AxisAlignedBB(0.375, 0.438, 0.438, 0.438, 0.469, 0.562);
	private static final AxisAlignedBB JPART4 = new AxisAlignedBB(0.562, 0.438, 0.438, 0.625, 0.469, 0.562);
	private static final AxisAlignedBB JPART5 = new AxisAlignedBB(0.375, 0.5, 0.312, 0.625, 0.812, 0.375);
	private static final AxisAlignedBB JPART6 = new AxisAlignedBB(0.375, 0.5, 0.625, 0.625, 0.812, 0.688);
	private static final AxisAlignedBB JPART7 = new AxisAlignedBB(0.312, 0.5, 0.375, 0.375, 0.812, 0.625);
	private static final AxisAlignedBB JPART8 = new AxisAlignedBB(0.625, 0.5, 0.375, 0.688, 0.812, 0.625);
	private static final AxisAlignedBB JPART9 = new AxisAlignedBB(0.25, 0.5, 0.438, 0.312, 0.562, 0.5);
	private static final AxisAlignedBB JPART10 = new AxisAlignedBB(0.25, 0.75, 0.438, 0.312, 0.812, 0.5);
	private static final AxisAlignedBB JPART11 = new AxisAlignedBB(0.188, 0.562, 0.5, 0.25, 0.75, 0.562);
	private static final AxisAlignedBB LPART1 = new AxisAlignedBB(0.375, 0.812, 0.312, 0.625, 0.875, 0.688);
	private static final AxisAlignedBB LPART2 = new AxisAlignedBB(0.312, 0.812, 0.375, 0.375, 0.875, 0.625);
	private static final AxisAlignedBB LPART3 = new AxisAlignedBB(0.625, 0.812, 0.375, 0.688, 0.875, 0.625);
	private static final AxisAlignedBB LPART4 = new AxisAlignedBB(0.375, 0.875, 0.375, 0.625, 0.938, 0.625);
	private static final AxisAlignedBB LPART5 = new AxisAlignedBB(0.438, 0.938, 0.438, 0.562, 1, 0.562);
	private static final List<AxisAlignedBB> COLLISION_BOXES = Lists.newArrayList(LEG1, LEG2, LEG3, LEG4, BPART1, BPART2, BPART3, BPART4, BPART5, BPART6, BPART7, BPART8, BPART9, BPART10, BPART11, BPART12, JPART1, JPART2, JPART3, JPART4, JPART5, JPART6, JPART7, JPART8, JPART9, JPART10, JPART11, LPART1, LPART2, LPART3, LPART4, LPART5);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.25, 0, 0.25, 0.812, 1, 0.75);

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
	    return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entity, boolean isActualState)
	{
	    entityBox = entityBox.offset(-pos.getX(), -pos.getY(), -pos.getZ());
	    for (AxisAlignedBB box : COLLISION_BOXES)
	    {
	        if (entityBox.intersects(box))
	            collidingBoxes.add(box.offset(pos));
	    }
	}

	@Override
	@Nullable
	public RayTraceResult collisionRayTrace(IBlockState state, World world, BlockPos pos, Vec3d start, Vec3d end)
	{
	    double distanceSq;
	    double distanceSqShortest = Double.POSITIVE_INFINITY;
	    RayTraceResult resultClosest = null;
	    RayTraceResult result;
	    start = start.subtract(pos.getX(), pos.getY(), pos.getZ());
	    end = end.subtract(pos.getX(), pos.getY(), pos.getZ());
	    for (AxisAlignedBB box : COLLISION_BOXES)
	    {
	        result = box.calculateIntercept(start, end);
	        if (result == null)
	            continue;

	        distanceSq = result.hitVec.squareDistanceTo(start);
	        if (distanceSq < distanceSqShortest)
	        {
	            distanceSqShortest = distanceSq;
	            resultClosest = result;
	        }
	    }
	    return resultClosest == null ? null : new RayTraceResult(RayTraceResult.Type.BLOCK, resultClosest.hitVec.addVector(pos.getX(), pos.getY(), pos.getZ()), resultClosest.sideHit, pos);
	}
}
