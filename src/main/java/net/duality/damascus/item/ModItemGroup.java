package net.duality.damascus.item;

import net.duality.damascus.Damascus;
import net.duality.damascus.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DAMASCUS_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(Damascus.MOD_ID, "damascus_group"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.damascus_group"))
                .icon(() -> new ItemStack(ModItems.DAMASCUS_ALLOY)). entries((displayContext, entries) -> {
                    // Aluminum
                    entries.add(ModBlocks.ALUMINUM_ORE);
                    entries.add(ModBlocks.DEEPSLATE_ALUMINUM_ORE);
                    entries.add(ModItems.RAW_ALUMINUM);
                    entries.add(ModBlocks.RAW_ALUMINUM_BLOCK);
                    entries.add(ModItems.ALUMINUM_NUGGET);
                    entries.add(ModItems.ALUMINUM_INGOT);
                    entries.add(ModBlocks.ALUMINUM_BLOCK);
                    // Tungsten
                    entries.add(ModBlocks.TUNGSTEN_ORE);
                    entries.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
                    entries.add(ModItems.RAW_TUNGSTEN);
                    entries.add(ModBlocks.RAW_TUNGSTEN_BLOCK);
                    entries.add(ModItems.TUNGSTEN_NUGGET);
                    entries.add(ModItems.TUNGSTEN_INGOT);
                    entries.add(ModBlocks.TUNGSTEN_BLOCK);
                    // Tin
                    entries.add(ModBlocks.TIN_ORE);
                    entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                    entries.add(ModItems.RAW_TIN);
                    entries.add(ModBlocks.RAW_TIN_BLOCK);
                    entries.add(ModItems.TIN_NUGGET);
                    entries.add(ModItems.TIN_INGOT);
                    entries.add(ModBlocks.TIN_BLOCK);
                    // Silver
                    entries.add(ModBlocks.SILVER_ORE);
                    entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                    entries.add(ModItems.RAW_SILVER);
                    entries.add(ModBlocks.RAW_SILVER_BLOCK);
                    entries.add(ModItems.SILVER_NUGGET);
                    entries.add(ModItems.SILVER_INGOT);
                    entries.add(ModBlocks.SILVER_BLOCK);
                    // Zinc
                    entries.add(ModBlocks.ZINC_ORE);
                    entries.add(ModBlocks.DEEPSLATE_ZINC_ORE);
                    entries.add(ModItems.RAW_ZINC);
                    entries.add(ModBlocks.RAW_ZINC_BLOCK);
                    entries.add(ModItems.ZINC_NUGGET);
                    entries.add(ModItems.ZINC_INGOT);
                    entries.add(ModBlocks.ZINC_BLOCK);
                    // Cobalt
                    entries.add(ModBlocks.COBALT_ORE);
                    entries.add(ModBlocks.DEEPSLATE_COBALT_ORE);
                    entries.add(ModItems.RAW_COBALT);
                    entries.add(ModBlocks.RAW_COBALT_BLOCK);
                    entries.add(ModItems.COBALT_NUGGET);
                    entries.add(ModItems.COBALT_INGOT);
                    entries.add(ModBlocks.COBALT_BLOCK);
                    // Nickel
                    entries.add(ModBlocks.NICKEL_ORE);
                    entries.add(ModBlocks.DEEPSLATE_NICKEL_ORE);
                    entries.add(ModItems.RAW_NICKEL);
                    entries.add(ModBlocks.RAW_NICKEL_BLOCK);
                    entries.add(ModItems.NICKEL_NUGGET);
                    entries.add(ModItems.NICKEL_INGOT);
                    entries.add(ModBlocks.NICKEL_BLOCK);
                    // Platinum
                    entries.add(ModBlocks.PLATINUM_ORE);
                    entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                    entries.add(ModItems.RAW_PLATINUM);
                    entries.add(ModBlocks.RAW_PLATINUM_BLOCK);
                    entries.add(ModItems.PLATINUM_NUGGET);
                    entries.add(ModItems.PLATINUM_INGOT);
                    entries.add(ModBlocks.PLATINUM_BLOCK);
                    // Xenium
                    entries.add(ModBlocks.XENIUM_ORE);
                    entries.add(ModBlocks.DEEPSLATE_XENIUM_ORE);
                    entries.add(ModItems.RAW_XENIUM);
                    entries.add(ModBlocks.RAW_XENIUM_BLOCK);
                    entries.add(ModItems.XENIUM_NUGGET);
                    entries.add(ModItems.XENIUM_INGOT);
                    entries.add(ModBlocks.XENIUM_BLOCK);
                    // Exulite
                    entries.add(ModBlocks.EXULITE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_EXULITE_ORE);
                    entries.add(ModItems.RAW_EXULITE);
                    entries.add(ModBlocks.RAW_EXULITE_BLOCK);
                    entries.add(ModItems.EXULITE_NUGGET);
                    entries.add(ModItems.EXULITE_INGOT);
                    entries.add(ModBlocks.EXULITE_BLOCK);
                    // Nightward
                    entries.add(ModItems.NIGHTWARD_NUGGET);
                    entries.add(ModItems.NIGHTWARD_INGOT);
                    entries.add(ModBlocks.NIGHTWARD_BLOCK);
                    // Steel
                    entries.add(ModItems.STEEL_NUGGET);
                    entries.add(ModItems.STEEL_INGOT);
                    entries.add(ModBlocks.STEEL_BLOCK);
                    // Melds
                    entries.add(ModItems.STEEL_MELD);
                    entries.add(ModItems.TIN_COPPER_MELD);
                    entries.add(ModItems.ZINC_COPPER_MELD);
                    entries.add(ModItems.GOLD_SILVER_MELD);
                    entries.add(ModItems.COPPER_NICKEL_MELD);
                    entries.add(ModItems.IRON_NICKEL_MELD);
                    entries.add(ModItems.COPPER_GOLD_MELD);
                    // Alloys
                    entries.add(ModItems.BRASS_ALLOY);
                    entries.add(ModItems.BRONZE_ALLOY);
                    entries.add(ModItems.DAMASCUS_ALLOY);
                    entries.add(ModItems.ELECTRUM_ALLOY);
                    entries.add(ModItems.CONSTANTAN_ALLOY);
                    entries.add(ModItems.INVAR_ALLOY);
                    entries.add(ModItems.ROSE_GOLD_ALLOY);
                    // Misc
                    entries.add(ModItems.FLUX_DUST);
                    // Tools
                    entries.add(ModItems.FORGE_HAMMER);

                    entries.add(ModBlocks.FORGE);


                }).build());


    public static void registerItemGroups() {

    }
}
