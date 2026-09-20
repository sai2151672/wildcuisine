package com.alexscuisine.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModFoods {

    private static final int SHORT_DURATION = 600;
    private static final int LONG_DURATION = 6000;

    private static StatusEffect nourishment() {
        return Registries.STATUS_EFFECT.get(new Identifier("farmersdelight", "nourishment"));
    }

    private static FoodComponent nourishmentMeal(int hunger, float saturation) {
        FoodComponent.Builder builder = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);
        StatusEffect effect = nourishment();
        if (effect != null) {
            builder.statusEffect(new StatusEffectInstance(effect, LONG_DURATION, 0), 1.0F);
        }
        return builder.build();
    }

    // MEATS
    public static final FoodComponent RAW_BISON = new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).meat().build();
    public static final FoodComponent COOKED_BISON = new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).meat().build();
    public static final FoodComponent RAW_BUNFUNGUS = new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).meat().build();
    public static final FoodComponent COOKED_BUNFUNGUS = new FoodComponent.Builder().hunger(7).saturationModifier(0.7F).meat().build();
    public static final FoodComponent COOKED_CENTIPEDE_LEG = new FoodComponent.Builder().hunger(6).saturationModifier(0.7F).meat().build();

    // CUTS
    public static final FoodComponent KANGAROO_SHANK = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).meat().snack().build();
    public static final FoodComponent COOKED_KANGAROO_SHANK = new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).meat().snack().build();
    public static final FoodComponent LOOSE_MOOSE_RIB = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).meat().snack().build();
    public static final FoodComponent COOKED_LOOSE_MOOSE_RIB = new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).meat().snack().build();
    public static final FoodComponent BISON_MINCE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).meat().snack().build();
    public static final FoodComponent BISON_PATTY = new FoodComponent.Builder().hunger(5).saturationModifier(0.7F).meat().snack().build();
    public static final FoodComponent RAW_BUNFUNGUS_DRUMSTICK = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).meat().snack().build();
    public static final FoodComponent COOKED_BUNFUNGUS_DRUMSTICK = new FoodComponent.Builder().hunger(3).saturationModifier(0.4F).meat().snack().build();
    public static final FoodComponent RAW_CATFISH_SLICE = new FoodComponent.Builder().hunger(1).saturationModifier(0.2F).meat().snack().build();
    public static final FoodComponent COOKED_CATFISH_SLICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().snack().build();
    public static final FoodComponent RAW_BEAR_SHANK = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().snack().build();
    public static final FoodComponent COOKED_BEAR_SHANK = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).meat().snack().build();
    public static final FoodComponent RAW_CROCODILE_TAIL = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().snack().build();
    public static final FoodComponent COOKED_CROCODILE_TAIL = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).meat().snack().build();
    public static final FoodComponent RAW_CAIMAN_RIBS = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).meat().snack().build();
    public static final FoodComponent COOKED_CAIMAN_RIBS = new FoodComponent.Builder().hunger(5).saturationModifier(0.5F).meat().snack().build();

    // MEALS
    public static final FoodComponent GONGYLIDIA_BRUSCHETTA = new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).build();
    public static final FoodComponent MAGGOT_SALAD = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, SHORT_DURATION, 0), 1.0F).build();
    public static final FoodComponent KANGAROO_STEW = nourishmentMeal(10, 0.8F);
    public static final FoodComponent ACACIA_BLOSSOM_SOUP = nourishmentMeal(12, 0.8F);
    public static final FoodComponent LOBSTER_PASTA = nourishmentMeal(10, 0.8F);
    public static final FoodComponent BISON_BURGER = new FoodComponent.Builder().hunger(12).saturationModifier(1.1F).build();
    public static final FoodComponent BUNFUNGUS_SANDWICH = new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).build();
    public static final FoodComponent KANGAROO_PASTA = nourishmentMeal(10, 0.8F);
    public static final FoodComponent BEAR_STEW = nourishmentMeal(10, 0.8F);
    public static final FoodComponent SWAMP_GUMBO = nourishmentMeal(10, 0.8F);
    public static final FoodComponent CAIMAN_RIBS_PLATTER = new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).build();
}
