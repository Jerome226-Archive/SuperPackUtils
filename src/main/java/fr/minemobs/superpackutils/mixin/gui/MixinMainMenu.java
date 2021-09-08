package fr.minemobs.superpackutils.mixin.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.TranslationTextComponent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(MainMenuScreen.class)
public abstract class MixinMainMenu extends Screen {

    @Mutable @Shadow @Final private final boolean fading;

    @Mutable @Shadow @Final private final boolean minceraftEasterEgg;

    protected MixinMainMenu(boolean fading) {
        super(new TranslationTextComponent("narrator.screen.title"));
        this.fading = fading;
        this.minceraftEasterEgg = (double)(new Random()).nextFloat() < 1.0E-4D;
    }

    @Inject(at = @At("TAIL"), method = "render")
    private void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks, CallbackInfo ci) {

    }


}
