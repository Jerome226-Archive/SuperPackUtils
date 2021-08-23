package fr.minemobs.superpackutils.mixin.recipes;

import blusunrize.immersiveengineering.api.crafting.BlueprintCraftingRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nonnull;
import java.util.Set;

@Mixin(BlueprintCraftingRecipe.class)
public abstract class MixinBlueprintCraftingRecipe {

    @Shadow @Nonnull public static Set<String> recipeCategories;

    @Inject(remap = false, at = @At("TAIL"), method = "registerDefaultCategories")
    private static void registerDefaultCategories(CallbackInfo ci) {
        recipeCategories.add("circuit");
    }

}
