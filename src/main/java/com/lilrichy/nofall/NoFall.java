package com.lilrichy.nofall;

import com.lilrichy.nofall.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NoFall implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("modid");
	public static final String MOD_ID = "nofall";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Help I've fallen and I can't get up!");

		ModBlocks.registerModBlocks();
	}

	public static class ModItemGroup {
		public static final ItemGroup NOFALL = FabricItemGroupBuilder.build(new Identifier(NoFall.MOD_ID,"nofallgroup"),
				()-> new ItemStack(Blocks.GRAVEL));
	}

}
