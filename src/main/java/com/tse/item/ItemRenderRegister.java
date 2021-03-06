package com.tse.item;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

import com.tse.main.lib.StringsLib;

public class ItemRenderRegister {
	public static void registerItemRenderer()
	{
		reg(ItemManager.exaltedDiamond);
	    reg(ItemManager.bloodDiamond);
	    reg(ItemManager.terraDiamond);
	    reg(ItemManager.lunaDiamond);
	    
	    reg(ItemManager.copperIngot);
	    reg(ItemManager.copperAxe);
	    reg(ItemManager.copperPickaxe);
	    reg(ItemManager.copperShovel);
	    reg(ItemManager.copperSword);
	    reg(ItemManager.copperHoe);
	    
	    reg(ItemManager.lapisRemover);
	    
	    reg(ItemManager.steelIngot);
	    
	    reg(ItemManager.stoneMattock);
	    
	    reg(ItemManager.copperMattock);
	    reg(ItemManager.copperHelmet);
	    reg(ItemManager.copperChestplate);
	    reg(ItemManager.copperLeggings);
	    reg(ItemManager.copperBoots);
	    
	    reg(ItemManager.ironMattock);
	    reg(ItemManager.woodMattock);
	    reg(ItemManager.goldMattock);
	    reg(ItemManager.diamondMattock);
	    
	    reg(ItemManager.terraDiamondPickaxe);
	    reg(ItemManager.terraDiamondAxe);
	    reg(ItemManager.terraDiamondShovel);
	    reg(ItemManager.terraDiamondHoe);
	    reg(ItemManager.terraDiamondMattock);
	    reg(ItemManager.terraDiamondSword);
	    reg(ItemManager.terraDiamondHelmet);
	    reg(ItemManager.terraDiamondChestplate);
	    reg(ItemManager.terraDiamondLeggings);
	    reg(ItemManager.terraDiamondBoots);
	    
	    reg(ItemManager.tinIngot);
	    
	    reg(ItemManager.tyionetiumIngot);
	    
	    reg(ItemManager.tyionetiumPickaxe);
	    reg(ItemManager.tyionetiumAxe);
	    reg(ItemManager.tyionetiumShovel);
	    reg(ItemManager.tyionetiumHoe);
	    reg(ItemManager.tyionetiumMattock);
	    reg(ItemManager.tyionetiumSword);
	    
	    reg(ItemManager.bronzeIngot);
	    reg(ItemManager.brightflameIngot);
	    reg(ItemManager.brightsteelIngot);
	    reg(ItemManager.diamondIngot);
	    reg(ItemManager.reforgedGoldIngot);
	    reg(ItemManager.magicIngot);
	    reg(ItemManager.mithrilIngot);
	    reg(ItemManager.mortiumIngot);
	    reg(ItemManager.mysteriousIngot);
	    reg(ItemManager.mysticIngot);
	    reg(ItemManager.skyIronIngot);
	    reg(ItemManager.terriumIngot);
	    reg(ItemManager.toslotriumIngot);
	    reg(ItemManager.vividiumIngot);
	    
	    reg(ItemManager.justice);
	    reg(ItemManager.corruption);
	    
	    reg(ItemManager.brightflamePickaxe);
	    reg(ItemManager.brightflameAxe);
	    reg(ItemManager.brightflameHoe);
	    reg(ItemManager.brightflameShovel);
	    reg(ItemManager.brightflameMattock);
	    reg(ItemManager.brightflameSword);
	    reg(ItemManager.brightflameHelmet);
	    reg(ItemManager.brightflameChestplate);
	    reg(ItemManager.brightflameLeggings);
	    reg(ItemManager.brightflameBoots);
	    
	    reg(ItemManager.goldenStick);
	    reg(ItemManager.diamondStick);
	    reg(ItemManager.mysticStick);
	    reg(ItemManager.magicSword);
	    reg(ItemManager.mithrilSword);
	    
	    reg(ItemManager.mortiumSword);
	    reg(ItemManager.mysteriousSword);
	    reg(ItemManager.mysticSword);
	    reg(ItemManager.skyIronSword);
	    reg(ItemManager.terriumSword);
	    reg(ItemManager.vividiumSword);
	    
	    reg(ItemManager.magicPickaxe);
	    reg(ItemManager.magicAxe);
	    reg(ItemManager.magicHoe);
	    reg(ItemManager.magicShovel);
	    reg(ItemManager.magicMattock);
	    
	    reg(ItemManager.mortiumPickaxe);
	    reg(ItemManager.mortiumAxe);
	    reg(ItemManager.mortiumShovel);
	    reg(ItemManager.mortiumHoe);
	    reg(ItemManager.mortiumSword);
	    reg(ItemManager.mortiumMattock);
	    
	    reg(ItemManager.mithrilPickaxe);
	    reg(ItemManager.mithrilAxe);
	    reg(ItemManager.mithrilShovel);
	    reg(ItemManager.mithrilHoe);
	    reg(ItemManager.mithrilMattock);
	    reg(ItemManager.mithrilSword);
	    
	    reg(ItemManager.mysteriousPickaxe);
	    reg(ItemManager.mysteriousAxe);
	    reg(ItemManager.mysteriousShovel);
	    reg(ItemManager.mysteriousHoe);
	    reg(ItemManager.mysteriousMattock);
	    reg(ItemManager.mysteriousSword);
	    
	    reg(ItemManager.mysticPickaxe);
	    reg(ItemManager.mysticAxe);
	    reg(ItemManager.mysticShovel);
	    reg(ItemManager.mysticHoe);
	    reg(ItemManager.mysticMattock);
	    reg(ItemManager.mysticSword);
	    
	    reg(ItemManager.skyIronPickaxe);
	    reg(ItemManager.skyIronAxe);
	    reg(ItemManager.skyIronShovel);
	    reg(ItemManager.skyIronMattock);
	    reg(ItemManager.skyIronHoe);
	    
	    reg(ItemManager.terriumPickaxe);
	    reg(ItemManager.terriumAxe);
	    reg(ItemManager.terriumShovel);
	    reg(ItemManager.terriumHoe);
	    reg(ItemManager.terriumMattock);
	    
	    reg(ItemManager.brightsteelPickaxe);
	    reg(ItemManager.brightsteelAxe);
	    reg(ItemManager.brightsteelHoe);
	    reg(ItemManager.brightsteelShovel);
	    reg(ItemManager.brightsteelMattock);
	    reg(ItemManager.brightsteelSword);
	    
	    reg(ItemManager.vividiumPickaxe);
	    reg(ItemManager.vividiumAxe);
	    reg(ItemManager.vividiumShovel);
	    reg(ItemManager.vividiumHoe);
	    reg(ItemManager.vividiumMattock);
	    
	    reg(ItemManager.magicNugget);
	    reg(ItemManager.mixedIngot);
	    reg(ItemManager.mysticNugget);
	    reg(ItemManager.mysteriousNugget);
	    reg(ItemManager.brightflameNugget);
	    reg(ItemManager.diamondToslotriumMixedIngot);
	}
	public static void reg(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher() .register(item, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(StringsLib.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));	
	}
}
