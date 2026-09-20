package com.alexscuisine;

import com.alexscuisine.item.ModItems;
import com.alexscuisine.loot.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

public class AlexsCuisine implements ModInitializer {

    public static final String MOD_ID = "alexscuisine";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModLootTableModifiers.modifyLootTables();
    }
}
