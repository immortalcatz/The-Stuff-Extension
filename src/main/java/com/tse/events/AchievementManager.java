package com.tse.events;

import com.tse.item.ItemManager;

import net.minecraft.stats.Achievement;

public class AchievementManager {
	
	public static Achievement mysticGain;
	
	public static void createAchievements()
	{
		mysticGain = new Achievement("", "MysticGain", 0, 0, ItemManager.mysticIngot, null);
	}
}
