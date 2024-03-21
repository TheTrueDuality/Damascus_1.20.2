package net.duality.damascus.recipe;

import net.duality.damascus.Damascus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Damascus.MOD_ID, ForgeRecipe.Serializer.ID),
                ForgeRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Damascus.MOD_ID, ForgeRecipe.Type.ID),
                ForgeRecipe.Type.INSTANCE);
    }
}
