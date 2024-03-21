package net.duality.damascus.datagen;

import net.duality.damascus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(
                        // Aluminum
                        ModBlocks.ALUMINUM_ORE,
                        ModBlocks.DEEPSLATE_ALUMINUM_ORE,
                        ModBlocks.ALUMINUM_BLOCK,
                        ModBlocks.RAW_ALUMINUM_BLOCK,
                        // Tungsten
                        ModBlocks.TUNGSTEN_ORE,
                        ModBlocks.DEEPSLATE_TUNGSTEN_ORE,
                        ModBlocks.TUNGSTEN_BLOCK,
                        ModBlocks.RAW_TUNGSTEN_BLOCK,
                        // Tin
                        ModBlocks.TIN_ORE,
                        ModBlocks.DEEPSLATE_TIN_ORE,
                        ModBlocks.TIN_BLOCK,
                        ModBlocks.RAW_TIN_BLOCK,
                        // Silver
                        ModBlocks.SILVER_ORE,
                        ModBlocks.DEEPSLATE_SILVER_ORE,
                        ModBlocks.SILVER_BLOCK,
                        ModBlocks.RAW_SILVER_BLOCK,
                        // Zinc
                        ModBlocks.ZINC_ORE,
                        ModBlocks.DEEPSLATE_ZINC_ORE,
                        ModBlocks.ZINC_BLOCK,
                        ModBlocks.RAW_ZINC_BLOCK,
                        // Cobalt
                        ModBlocks.COBALT_ORE,
                        ModBlocks.DEEPSLATE_COBALT_ORE,
                        ModBlocks.COBALT_BLOCK,
                        ModBlocks.RAW_COBALT_BLOCK,
                        // Nickel
                        ModBlocks.NICKEL_ORE,
                        ModBlocks.DEEPSLATE_NICKEL_ORE,
                        ModBlocks.NICKEL_BLOCK,
                        ModBlocks.RAW_NICKEL_BLOCK,
                        // Platinum
                        ModBlocks.PLATINUM_ORE,
                        ModBlocks.DEEPSLATE_PLATINUM_ORE,
                        ModBlocks.PLATINUM_BLOCK,
                        ModBlocks.RAW_PLATINUM_BLOCK,
                        // Xenium
                        ModBlocks.XENIUM_ORE,
                        ModBlocks.DEEPSLATE_XENIUM_ORE,
                        ModBlocks.XENIUM_BLOCK,
                        ModBlocks.RAW_XENIUM_BLOCK,
                        // Exulite
                        ModBlocks.EXULITE_ORE,
                        ModBlocks.DEEPSLATE_EXULITE_ORE,
                        ModBlocks.EXULITE_BLOCK,
                        ModBlocks.RAW_EXULITE_BLOCK,
                        // Nightward
                        ModBlocks.NIGHTWARD_BLOCK,
                        // Steel
                        ModBlocks.STEEL_BLOCK
                );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        // Aluminum
                        ModBlocks.ALUMINUM_ORE,
                        ModBlocks.DEEPSLATE_ALUMINUM_ORE,
                        ModBlocks.ALUMINUM_BLOCK,
                        ModBlocks.RAW_ALUMINUM_BLOCK,
                        // Tungsten
                        ModBlocks.TUNGSTEN_ORE,
                        ModBlocks.DEEPSLATE_TUNGSTEN_ORE,
                        ModBlocks.TUNGSTEN_BLOCK,
                        ModBlocks.RAW_TUNGSTEN_BLOCK,
                        // Tin
                        ModBlocks.TIN_ORE,
                        ModBlocks.DEEPSLATE_TIN_ORE,
                        ModBlocks.TIN_BLOCK,
                        ModBlocks.RAW_TIN_BLOCK,
                        // Silver
                        ModBlocks.SILVER_ORE,
                        ModBlocks.DEEPSLATE_SILVER_ORE,
                        ModBlocks.SILVER_BLOCK,
                        ModBlocks.RAW_SILVER_BLOCK,
                        // Zinc
                        ModBlocks.ZINC_ORE,
                        ModBlocks.DEEPSLATE_ZINC_ORE,
                        ModBlocks.ZINC_BLOCK,
                        ModBlocks.RAW_ZINC_BLOCK,
                        // Nickel
                        ModBlocks.NICKEL_ORE,
                        ModBlocks.DEEPSLATE_NICKEL_ORE,
                        ModBlocks.NICKEL_BLOCK,
                        ModBlocks.RAW_NICKEL_BLOCK,
                        // Steel
                        ModBlocks.STEEL_BLOCK
                );

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(
                        // Cobalt
                        ModBlocks.COBALT_ORE,
                        ModBlocks.DEEPSLATE_COBALT_ORE,
                        ModBlocks.COBALT_BLOCK,
                        ModBlocks.RAW_COBALT_BLOCK,
                        // Platinum
                        ModBlocks.PLATINUM_ORE,
                        ModBlocks.DEEPSLATE_PLATINUM_ORE,
                        ModBlocks.PLATINUM_BLOCK,
                        ModBlocks.RAW_PLATINUM_BLOCK,
                        // Xenium
                        ModBlocks.XENIUM_ORE,
                        ModBlocks.DEEPSLATE_XENIUM_ORE,
                        ModBlocks.XENIUM_BLOCK,
                        ModBlocks.RAW_XENIUM_BLOCK,
                        // Exulite
                        ModBlocks.EXULITE_ORE,
                        ModBlocks.DEEPSLATE_EXULITE_ORE,
                        ModBlocks.EXULITE_BLOCK,
                        ModBlocks.RAW_EXULITE_BLOCK,
                        // Nightward
                        ModBlocks.NIGHTWARD_BLOCK
                );
    }
}
