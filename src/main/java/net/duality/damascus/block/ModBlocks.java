package net.duality.damascus.block;

import net.duality.damascus.Damascus;
import net.duality.damascus.block.custom.ForgeBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    // Aluminum
    public static final Block ALUMINUM_ORE = registerBlock("aluminum_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Tungsten
    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Tin
    public static final Block TIN_ORE = registerBlock("tin_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Silver
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    //Zinc
    public static final Block ZINC_ORE = registerBlock("zinc_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block ZINC_BLOCK = registerBlock("zinc_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_ZINC_BLOCK = registerBlock("raw_zinc_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Cobalt
    public static final Block COBALT_ORE = registerBlock("cobalt_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block COBALT_BLOCK = registerBlock("cobalt_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Nickel
    public static final Block NICKEL_ORE = registerBlock("nickel_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block NICKEL_BLOCK = registerBlock("nickel_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Platinum
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Xenium
    public static final Block XENIUM_ORE = registerBlock("xenium_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_XENIUM_ORE = registerBlock("deepslate_xenium_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block XENIUM_BLOCK = registerBlock("xenium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_XENIUM_BLOCK = registerBlock("raw_xenium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Exulite
    public static final Block EXULITE_ORE = registerBlock("exulite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.IRON_ORE))));
    public static final Block DEEPSLATE_EXULITE_ORE = registerBlock("deepslate_exulite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), (FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))));
    public static final Block EXULITE_BLOCK = registerBlock("exulite_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_EXULITE_BLOCK = registerBlock("raw_exulite_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    // Nightward
    public static final Block NIGHTWARD_BLOCK = registerBlock("nightward_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    // Steel
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block FORGE = registerBlock("forge", new ForgeBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).nonOpaque()));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Damascus.LOGGER.info("Registering ModBlocks for " + Damascus.MOD_ID);
    }
}
