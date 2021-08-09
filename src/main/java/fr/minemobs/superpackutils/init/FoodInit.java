package fr.minemobs.superpackutils.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {

    public static final Food TATER_TOT = new Food.Builder()
            .effect(() -> new EffectInstance(Effects.SPEED, 200, 2), 1.0f).fastToEat().hunger(2).saturation(0.2f)
            .setAlwaysEdible().build();

}
