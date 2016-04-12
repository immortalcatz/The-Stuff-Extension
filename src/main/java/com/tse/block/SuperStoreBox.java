package com.tse.block;

import java.awt.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.gui.GuiManager;
import com.tse.main.core.TheStuffExtension;
import com.tse.tileentity.SuperStoreBoxTileEntity;

public class SuperStoreBox extends BlockContainer{

	protected SuperStoreBox(String unlocalizedName) {
		super(Material.iron);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(TSECreativeTabs.tabStorage);
	}
	
	public void func_77624_a(ItemStack itemStack, EntityPlayer player, List list, boolean p_77624_4_)
	{
	    list.add("Store even more of all your stuff and things.");
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new SuperStoreBoxTileEntity();
	}
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		SuperStoreBoxTileEntity te = (SuperStoreBoxTileEntity) world.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(world, pos, te);
		super.breakBlock(world, pos, blockstate);
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		if (stack.hasDisplayName()) {
			((SuperStoreBoxTileEntity) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
		}
	}

	@Override
	public int getRenderType() {
		return 3;
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
	    if (!world.isRemote) {
	        player.openGui(TheStuffExtension.instance, GuiManager.SUPER_STORE_BOX_GUI, world, pos.getX(), pos.getY(), pos.getZ());
	    }
	    return true;
	}

}
