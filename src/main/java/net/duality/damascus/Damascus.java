package net.duality.damascus;

import net.duality.damascus.block.ModBlocks;
import net.duality.damascus.block.entity.ModBlockEntities;
import net.duality.damascus.item.ModItemGroup;
import net.duality.damascus.item.ModItems;
import net.duality.damascus.recipe.ModRecipes;
import net.duality.damascus.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Damascus implements ModInitializer {
	public static final String MOD_ID = "damascus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandler();

		ModRecipes.registerRecipes();
	}
}