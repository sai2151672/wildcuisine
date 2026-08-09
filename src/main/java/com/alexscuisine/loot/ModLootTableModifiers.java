// SPDX-License-Identifier: MIT
package com.alexscuisine.loot;

import com.alexscuisine.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    private static final Identifier BISON_LOOT_TABLE_ID = new Identifier("alexsmobs", "entities/bison");
    private static final Identifier BUNFUNGUS_LOOT_TABLE_ID = new Identifier("alexsmobs", "entities/bunfungus");

    public static void modifyLootTables() {
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if (BISON_LOOT_TABLE_ID.equals(id)) {
                return bisonLootTable();
            }
            if (BUNFUNGUS_LOOT_TABLE_ID.equals(id)) {
                return bunfungusLootTable();
            }
            return original;
        });
    }

    private static LootTable bisonLootTable() {
        Item bisonFur = Registries.ITEM.get(new Identifier("alexsmobs", "bison_fur"));
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.RAW_BISON)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))))
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(bisonFur)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))))
                .build();
    }

    private static LootTable bunfungusLootTable() {
        Item redMushroom = Registries.ITEM.get(new Identifier("minecraft", "red_mushroom"));
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.RAW_BUNFUNGUS)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))))
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(redMushroom)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))))
                .build();
    }
}
