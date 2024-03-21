package net.duality.damascus.item;

import net.duality.damascus.Damascus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Aluminum
    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum", new Item(new FabricItemSettings()));
    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", new Item(new FabricItemSettings()));
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new FabricItemSettings()));
    // Tungsten
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new FabricItemSettings()));
    // Tin
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    // Silver
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    // Zinc
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new FabricItemSettings()));
    public static final Item ZINC_NUGGET = registerItem("zinc_nugget", new Item(new FabricItemSettings()));
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new FabricItemSettings()));
    // Cobalt
    public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item(new FabricItemSettings()));
    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget", new Item(new FabricItemSettings()));
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));
    // Nickel
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new FabricItemSettings()));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item(new FabricItemSettings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new FabricItemSettings()));
    // Platinum
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings()));
    // Xenium
    public static final Item RAW_XENIUM = registerItem("raw_xenium", new Item(new FabricItemSettings()));
    public static final Item XENIUM_NUGGET = registerItem("xenium_nugget", new Item(new FabricItemSettings()));
    public static final Item XENIUM_INGOT = registerItem("xenium_ingot", new Item(new FabricItemSettings()));
    // Exulite
    public static final Item RAW_EXULITE = registerItem("raw_exulite", new Item(new FabricItemSettings()));
    public static final Item EXULITE_NUGGET = registerItem("exulite_nugget", new Item(new FabricItemSettings()));
    public static final Item EXULITE_INGOT = registerItem("exulite_ingot", new Item(new FabricItemSettings()));
    // Nightward
    public static final Item NIGHTWARD_NUGGET = registerItem("nightward_nugget", new Item(new FabricItemSettings()));
    public static final Item NIGHTWARD_INGOT = registerItem("nightward_ingot", new Item(new FabricItemSettings()));
    // Steel
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    // Melds
    public static final Item STEEL_MELD = registerItem("steel_meld", new Item(new FabricItemSettings()));
    public static final Item TIN_COPPER_MELD = registerItem("tin_copper_meld", new Item(new FabricItemSettings()));
    public static final Item ZINC_COPPER_MELD = registerItem("zinc_copper_meld", new Item(new FabricItemSettings()));
    public static final Item GOLD_SILVER_MELD = registerItem("gold_silver_meld", new Item(new FabricItemSettings()));
    public static final Item COPPER_NICKEL_MELD = registerItem("copper_nickel_meld", new Item(new FabricItemSettings()));
    public static final Item IRON_NICKEL_MELD = registerItem("iron_nickel_meld", new Item(new FabricItemSettings()));
    public static final Item COPPER_GOLD_MELD = registerItem("copper_gold_meld", new Item(new FabricItemSettings()));
    // Alloys
    public static final Item BRASS_ALLOY = registerItem("brass_alloy", new Item(new FabricItemSettings()));
    public static final Item BRONZE_ALLOY = registerItem("bronze_alloy", new Item(new FabricItemSettings()));
    public static final Item DAMASCUS_ALLOY = registerItem("damascus_alloy", new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_ALLOY = registerItem("electrum_alloy", new Item(new FabricItemSettings()));
    public static final Item CONSTANTAN_ALLOY = registerItem("constantan_alloy", new Item(new FabricItemSettings()));
    public static final Item INVAR_ALLOY = registerItem("invar_alloy", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_ALLOY = registerItem("rose_gold_alloy", new Item(new FabricItemSettings()));
    // Misc
    public static final Item FLUX_DUST = registerItem("flux_dust", new Item(new FabricItemSettings()));
    // Tools
    public static final Item FORGE_HAMMER = registerItem("forge_hammer", new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Damascus.LOGGER.info("Registering Mod Items for " + Damascus.MOD_ID);
    }
}
