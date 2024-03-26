package net.duality.damascus.datagen;

import net.duality.damascus.block.ModBlocks;
import net.duality.damascus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TUNGSTEN_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZINC_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZINC_BLOCK);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FORGE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_ALUMINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_ZINC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZINC_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZINC_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_COBALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBALT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBALT_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_NICKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_XENIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.XENIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.XENIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_EXULITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXULITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXULITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.NIGHTWARD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGHTWARD_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_MELD, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_COPPER_MELD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZINC_COPPER_MELD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_SILVER_MELD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NICKEL_MELD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_NICKEL_MELD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_GOLD_MELD, Models.GENERATED);

        itemModelGenerator.register(ModItems.BRASS_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAMASCUS_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELECTRUM_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONSTANTAN_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVAR_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_ALLOY, Models.GENERATED);

        itemModelGenerator.register(ModItems.FLUX_DUST, Models.GENERATED);

        itemModelGenerator.register(ModItems.FORGE_HAMMER, Models.GENERATED);
    }
}
