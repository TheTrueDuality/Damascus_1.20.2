package net.duality.damascus.datagen;

import net.duality.damascus.block.ModBlocks;
import net.duality.damascus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Aluminum
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT, RecipeCategory.MISC, ModBlocks.ALUMINUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_ALUMINUM, RecipeCategory.MISC, ModBlocks.RAW_ALUMINUM_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_ALUMINUM, ModBlocks.ALUMINUM_ORE, ModBlocks.DEEPSLATE_ALUMINUM_ORE),
                RecipeCategory.MISC, ModItems.ALUMINUM_INGOT, 0.25f,200, "aluminum_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_ALUMINUM, ModBlocks.ALUMINUM_ORE, ModBlocks.DEEPSLATE_ALUMINUM_ORE),
                RecipeCategory.MISC, ModItems.ALUMINUM_INGOT, 0.25f,200, "aluminum_ingot");
        // Tungsten
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, RecipeCategory.MISC, ModBlocks.TUNGSTEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_TUNGSTEN, RecipeCategory.MISC, ModBlocks.RAW_TUNGSTEN_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_TUNGSTEN, ModBlocks.TUNGSTEN_ORE, ModBlocks.DEEPSLATE_TUNGSTEN_ORE),
                RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 0.25f,200, "tungsten_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_TUNGSTEN, ModBlocks.TUNGSTEN_ORE, ModBlocks.DEEPSLATE_TUNGSTEN_ORE),
                RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 0.25f,200, "tungsten_ingot");
        // Tin
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TIN_INGOT, RecipeCategory.MISC, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_TIN, RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE),
                RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f,200, "tin_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_TIN, ModBlocks.TUNGSTEN_ORE, ModBlocks.DEEPSLATE_TIN_ORE),
                RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f,200, "tin_ingot");
        // Silver
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SILVER_INGOT, RecipeCategory.MISC, ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_SILVER, RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE, ModBlocks.DEEPSLATE_SILVER_ORE),
                RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.25f,200, "silver_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE, ModBlocks.DEEPSLATE_SILVER_ORE),
                RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.25f,200, "silver_ingot");
        // Zinc
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ZINC_INGOT, RecipeCategory.MISC, ModBlocks.ZINC_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_ZINC, RecipeCategory.MISC, ModBlocks.RAW_ZINC_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_ZINC, ModBlocks.ZINC_ORE, ModBlocks.DEEPSLATE_ZINC_ORE),
                RecipeCategory.MISC, ModItems.ZINC_INGOT, 0.25f,200, "zinc_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_ZINC, ModBlocks.ZINC_ORE, ModBlocks.DEEPSLATE_ZINC_ORE),
                RecipeCategory.MISC, ModItems.ZINC_INGOT, 0.25f,200, "zinc_ingot");
        // Cobalt
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COBALT_INGOT, RecipeCategory.MISC, ModBlocks.COBALT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_COBALT, RecipeCategory.MISC, ModBlocks.RAW_COBALT_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_COBALT, ModBlocks.COBALT_ORE, ModBlocks.DEEPSLATE_COBALT_ORE),
                RecipeCategory.MISC, ModItems.COBALT_INGOT, 0.25f,200, "cobalt_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_COBALT, ModBlocks.COBALT_ORE, ModBlocks.DEEPSLATE_COBALT_ORE),
                RecipeCategory.MISC, ModItems.COBALT_INGOT, 0.25f,200, "cobalt_ingot");
        // Nickel
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NICKEL_INGOT, RecipeCategory.MISC, ModBlocks.NICKEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_NICKEL, RecipeCategory.MISC, ModBlocks.RAW_NICKEL_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_NICKEL, ModBlocks.NICKEL_ORE, ModBlocks.DEEPSLATE_NICKEL_ORE),
                RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.25f,200, "nickel_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_NICKEL, ModBlocks.NICKEL_ORE, ModBlocks.DEEPSLATE_NICKEL_ORE),
                RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.25f,200, "nickel_ingot");
        // Platinum
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PLATINUM_INGOT, RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_PLATINUM, RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_PLATINUM, ModBlocks.PLATINUM_ORE, ModBlocks.DEEPSLATE_PLATINUM_ORE),
                RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 0.25f,200, "platinum_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_PLATINUM, ModBlocks.PLATINUM_ORE, ModBlocks.DEEPSLATE_PLATINUM_ORE),
                RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 0.25f,200, "platinum_ingot");
        // Xenium
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.XENIUM_INGOT, RecipeCategory.MISC, ModBlocks.XENIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_XENIUM, RecipeCategory.MISC, ModBlocks.RAW_XENIUM_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_XENIUM, ModBlocks.XENIUM_ORE, ModBlocks.DEEPSLATE_XENIUM_ORE),
                RecipeCategory.MISC, ModItems.XENIUM_INGOT, 0.25f,200, "xenium_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_XENIUM, ModBlocks.XENIUM_ORE, ModBlocks.DEEPSLATE_XENIUM_ORE),
                RecipeCategory.MISC, ModItems.XENIUM_INGOT, 0.25f,200, "xenium_ingot");
        // Exulite
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.EXULITE_INGOT, RecipeCategory.MISC, ModBlocks.EXULITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_EXULITE, RecipeCategory.MISC, ModBlocks.RAW_EXULITE_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_EXULITE, ModBlocks.EXULITE_ORE, ModBlocks.DEEPSLATE_EXULITE_ORE),
                RecipeCategory.MISC, ModItems.EXULITE_INGOT, 0.25f,200, "exulite_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_EXULITE, ModBlocks.EXULITE_ORE, ModBlocks.DEEPSLATE_EXULITE_ORE),
                RecipeCategory.MISC, ModItems.EXULITE_INGOT, 0.25f,200, "exulite_ingot");
        // Nightward
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NIGHTWARD_INGOT, RecipeCategory.MISC, ModBlocks.NIGHTWARD_BLOCK);
        // Steel
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_INGOT, RecipeCategory.MISC, ModBlocks.STEEL_BLOCK);
    }
}
