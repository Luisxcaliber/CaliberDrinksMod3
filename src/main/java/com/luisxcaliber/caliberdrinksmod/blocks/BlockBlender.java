package com.luisxcaliber.caliberdrinksmod.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBlender extends BlockBase 
{
	public BlockBlender(String name, Material material) 
	{
		super(name, material);
	}
	
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	private static final AxisAlignedBB LEG_1 = new AxisAlignedBB(0.625, 0, 0.25, 0.75, 0.125, 0.375);
	private static final AxisAlignedBB LEG_2 = new AxisAlignedBB(0.25, 0, 0.25, 0.375, 0.125, 0.375);
	private static final AxisAlignedBB LEG_3 = new AxisAlignedBB(0.25, 0, 0.625, 0.375, 0.125, 0.75);
	private static final AxisAlignedBB LEG_4 = new AxisAlignedBB(0.625, 0, 0.625, 0.75, 0.125, 0.75);
	private static final AxisAlignedBB BASE_PART_1 = new AxisAlignedBB(0.25, 0.062, 0.375, 0.75, 0.125, 0.625);
	private static final AxisAlignedBB BASE_PART_2 = new AxisAlignedBB(0.375, 0.062, 0.25, 0.625, 0.125, 0.75);
	private static final AxisAlignedBB BASE_PART_3 = new AxisAlignedBB(0.25, 0.125, 0.25, 0.75, 0.188, 0.75);
	private static final AxisAlignedBB BASE_PART_4 = new AxisAlignedBB(0.312, 0.188, 0.312, 0.688, 0.375, 0.688);
	private static final AxisAlignedBB BASE_PART_5 = new AxisAlignedBB(0.375, 0.25, 0.688, 0.438, 0.312, 0.75);
	private static final AxisAlignedBB BASE_PART_6 = new AxisAlignedBB(0.562, 0.25, 0.688, 0.625, 0.312, 0.75);
	private static final AxisAlignedBB BASE_PART_7 = new AxisAlignedBB(0.375, 0.375, 0.375, 0.625, 0.438, 0.438);
	private static final AxisAlignedBB BASE_PART_8 = new AxisAlignedBB(0.375, 0.375, 0.562, 0.625, 0.438, 0.625);
	private static final AxisAlignedBB BASE_PART_9 = new AxisAlignedBB(0.375, 0.375, 0.438, 0.438, 0.438, 0.562);
	private static final AxisAlignedBB BASE_PART_10 = new AxisAlignedBB(0.562, 0.375, 0.438, 0.625, 0.438, 0.562);
	private static final AxisAlignedBB JAR_PART_1 = new AxisAlignedBB(0.438, 0.375, 0.438, 0.562, 0.438, 0.562);
	private static final AxisAlignedBB JAR_PART_2 = new AxisAlignedBB(0.562, 0.438, 0.375, 0.625, 0.5, 0.625);
	private static final AxisAlignedBB JAR_PART_3 = new AxisAlignedBB(0.375, 0.438, 0.375, 0.438, 0.5, 0.625);
	private static final AxisAlignedBB JAR_PART_4 = new AxisAlignedBB(0.438, 0.438, 0.375, 0.562, 0.5, 0.438);
	private static final AxisAlignedBB JAR_PART_5 = new AxisAlignedBB(0.438, 0.438, 0.562, 0.562, 0.5, 0.625);
	private static final AxisAlignedBB JAR_PART_6 = new AxisAlignedBB(0.375, 0.5, 0.625, 0.625, 0.812, 0.688);
	private static final AxisAlignedBB JAR_PART_7 = new AxisAlignedBB(0.375, 0.5, 0.312, 0.625, 0.812, 0.375);
	private static final AxisAlignedBB JAR_PART_8 = new AxisAlignedBB(0.312, 0.5, 0.375, 0.375, 0.812, 0.625);
	private static final AxisAlignedBB JAR_PART_9 = new AxisAlignedBB(0.625, 0.5, 0.375, 0.688, 0.812, 0.625);
	private static final AxisAlignedBB LID_PART_1 = new AxisAlignedBB(0.375, 0.812, 0.312, 0.625, 0.875, 0.688);
	private static final AxisAlignedBB LID_PART_2 = new AxisAlignedBB(0.312, 0.812, 0.375, 0.688, 0.875, 0.625);
	private static final AxisAlignedBB LID_PART_3 = new AxisAlignedBB(0.375, 0.875, 0.375, 0.625, 0.938, 0.625);
	private static final AxisAlignedBB LID_PART_4 = new AxisAlignedBB(0.438, 0.938, 0.438, 0.562, 1, 0.562);
	private static final AxisAlignedBB HANDLE_PART_1 = new AxisAlignedBB(0.688, 0.5, 0.5, 0.75, 0.562, 0.562);
	private static final AxisAlignedBB HANDLE_PART_2 = new AxisAlignedBB(0.75, 0.562, 0.438, 0.812, 0.75, 0.5);
	private static final AxisAlignedBB HANDLE_PART_3 = new AxisAlignedBB(0.688, 0.75, 0.5, 0.75, 0.812, 0.562);
	/**
	* AxisAlignedBBs and methods getBoundingBox, collisionRayTrace, and collisionRayTrace generated using MrCrayfish's Model Creator <a href="https://mrcrayfish.com/tools?id=mc">https://mrcrayfish.com/tools?id=mc</a>
	*/
	private static final List<AxisAlignedBB> COLLISION_BOXES = Lists.newArrayList(LEG_1, LEG_2, LEG_3, LEG_4, BASE_PART_1, BASE_PART_2, BASE_PART_3, BASE_PART_4, BASE_PART_5, BASE_PART_6, BASE_PART_7, BASE_PART_8, BASE_PART_9, BASE_PART_10, JAR_PART_1, JAR_PART_2, JAR_PART_3, JAR_PART_4, JAR_PART_5, JAR_PART_6, JAR_PART_7, JAR_PART_8, JAR_PART_9, LID_PART_1, LID_PART_2, LID_PART_3, LID_PART_4, HANDLE_PART_1, HANDLE_PART_2, HANDLE_PART_3);
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
