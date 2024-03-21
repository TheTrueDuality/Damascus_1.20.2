package net.duality.damascus.block.entity;

import net.duality.damascus.Damascus;
import net.duality.damascus.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<ForgeBlockEntity> FORGE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Damascus.MOD_ID, "forge_block_entity"),
                    FabricBlockEntityTypeBuilder.create(ForgeBlockEntity::new,
                            ModBlocks.FORGE).build(null));

    public static void registerBlockEntities() {
        Damascus.LOGGER.info("Registering Block Entities For" + Damascus.MOD_ID);
    }
}
