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
    private static final Identifier GRIZZLY_BEAR_LOOT_TABLE_ID = new Identifier("alexsmobs", "entities/grizzly_bear");
    private static final Identifier CROCODILE_LOOT_TABLE_ID = new Identifier("alexsmobs", "entities/crocodile");
    private static final Identifier CAIMAN_LOOT_TABLE_ID = new Identifier("alexsmobs", "entities/caiman");
    private static final Identifier RACCOON_LOOT_TABLE_ID = new Identifier("alexsmobs", "entities/raccoon");

    public static void modifyLootTables() {
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if (BISON_LOOT_TABLE_ID.equals(id)) {
                return bisonLootTable();
            }
            if (BUNFUNGUS_LOOT_TABLE_ID.equals(id)) {
                return bunfungusLootTable();
            }
            if (GRIZZLY_BEAR_LOOT_TABLE_ID.equals(id)) {
                return grizzlyBearLootTable();
            }
            if (CROCODILE_LOOT_TABLE_ID.equals(id)) {
                return crocodileLootTable();
            }
            if (CAIMAN_LOOT_TABLE_ID.equals(id)) {
                return caimanLootTable();
            }
            if (RACCOON_LOOT_TABLE_ID.equals(id)) {
                return raccoonLootTable();
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

    private static LootTable grizzlyBearLootTable() {
        Item hairOfBear = Registries.ITEM.get(new Identifier("alexsmobs", "hair_of_bear"));
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.RAW_BEAR_SHANK)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))))
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(hairOfBear)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))))
                .build();
    }

    private static LootTable crocodileLootTable() {
        Item crocScute = Registries.ITEM.get(new Identifier("alexsmobs", "crocodile_scute"));
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.RAW_CROCODILE_TAIL)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))))
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(crocScute)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))))
                .build();
    }

    private static LootTable caimanLootTable() {
        Item crocScute = Registries.ITEM.get(new Identifier("alexsmobs", "crocodile_scute"));
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.RAW_CAIMAN_RIBS)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))))
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(crocScute)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))))
                .build();
    }

    private static LootTable raccoonLootTable() {
        Item raccoonTail = Registries.ITEM.get(new Identifier("alexsmobs", "raccoon_tail"));
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(raccoonTail)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))
                                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))))
                .build();
    }
}
