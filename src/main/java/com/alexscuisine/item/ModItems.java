// SPDX-License-Identifier: MIT
package com.alexscuisine.item;

import com.alexscuisine.AlexsCuisine;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.StewItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    // CUTS
    public static final Item KANGAROO_SHANK = registerItem("kangaroo_shank", new Item(new Item.Settings().food(ModFoods.KANGAROO_SHANK)));
    public static final Item COOKED_KANGAROO_SHANK = registerItem("cooked_kangaroo_shank", new Item(new Item.Settings().food(ModFoods.COOKED_KANGAROO_SHANK)));
    public static final Item LOOSE_MOOSE_RIB = registerItem("loose_moose_rib", new Item(new Item.Settings().food(ModFoods.LOOSE_MOOSE_RIB)));
    public static final Item COOKED_LOOSE_MOOSE_RIB = registerItem("cooked_loose_moose_rib", new Item(new Item.Settings().food(ModFoods.COOKED_LOOSE_MOOSE_RIB)));
    public static final Item BISON_MINCE = registerItem("bison_mince", new Item(new Item.Settings().food(ModFoods.BISON_MINCE)));
    public static final Item BISON_PATTY = registerItem("bison_patty", new Item(new Item.Settings().food(ModFoods.BISON_PATTY)));
    public static final Item RAW_BUNFUNGUS_DRUMSTICK = registerItem("raw_bunfungus_drumstick", new Item(new Item.Settings().food(ModFoods.RAW_BUNFUNGUS_DRUMSTICK)));
    public static final Item COOKED_BUNFUNGUS_DRUMSTICK = registerItem("cooked_bunfungus_drumstick", new Item(new Item.Settings().food(ModFoods.COOKED_BUNFUNGUS_DRUMSTICK)));
    public static final Item RAW_CATFISH_SLICE = registerItem("raw_catfish_slice", new Item(new Item.Settings().food(ModFoods.RAW_CATFISH_SLICE)));
    public static final Item COOKED_CATFISH_SLICE = registerItem("cooked_catfish_slice", new Item(new Item.Settings().food(ModFoods.COOKED_CATFISH_SLICE)));
    public static final Item RAW_BEAR_SHANK = registerItem("raw_bear_shank", new Item(new Item.Settings().food(ModFoods.RAW_BEAR_SHANK)));
    public static final Item COOKED_BEAR_SHANK = registerItem("cooked_bear_shank", new Item(new Item.Settings().food(ModFoods.COOKED_BEAR_SHANK)));
    public static final Item RAW_CROCODILE_TAIL = registerItem("raw_crocodile_tail", new Item(new Item.Settings().food(ModFoods.RAW_CROCODILE_TAIL)));
    public static final Item COOKED_CROCODILE_TAIL = registerItem("cooked_crocodile_tail", new Item(new Item.Settings().food(ModFoods.COOKED_CROCODILE_TAIL)));
    public static final Item RAW_CAIMAN_RIBS = registerItem("raw_caiman_ribs", new Item(new Item.Settings().food(ModFoods.RAW_CAIMAN_RIBS)));
    public static final Item COOKED_CAIMAN_RIBS = registerItem("cooked_caiman_ribs", new Item(new Item.Settings().food(ModFoods.COOKED_CAIMAN_RIBS)));

    // MEATS
    public static final Item RAW_BISON = registerItem("raw_bison", new Item(new Item.Settings().food(ModFoods.RAW_BISON)));
    public static final Item COOKED_BISON = registerItem("cooked_bison", new Item(new Item.Settings().food(ModFoods.COOKED_BISON)));
    public static final Item RAW_BUNFUNGUS = registerItem("raw_bunfungus", new Item(new Item.Settings().food(ModFoods.RAW_BUNFUNGUS)));
    public static final Item COOKED_BUNFUNGUS = registerItem("cooked_bunfungus", new Item(new Item.Settings().food(ModFoods.COOKED_BUNFUNGUS)));
    public static final Item COOKED_CENTIPEDE_LEG = registerItem("cooked_centipede_leg", new Item(new Item.Settings().food(ModFoods.COOKED_CENTIPEDE_LEG)));

    // MEALS
    public static final Item GONGYLIDIA_BRUSCHETTA = registerItem("gongylidia_bruschetta", new Item(new Item.Settings().food(ModFoods.GONGYLIDIA_BRUSCHETTA)));
    public static final Item MAGGOT_SALAD = registerItem("maggot_salad", new StewItem(new Item.Settings().maxCount(16).food(ModFoods.MAGGOT_SALAD)));
    public static final Item KANGAROO_STEW = registerItem("kangaroo_stew", new StewItem(new Item.Settings().maxCount(16).food(ModFoods.KANGAROO_STEW)));
    public static final Item ACACIA_BLOSSOM_SOUP = registerItem("acacia_blossom_soup", new StewItem(new Item.Settings().maxCount(16).food(ModFoods.ACACIA_BLOSSOM_SOUP)));
    public static final Item LOBSTER_PASTA = registerItem("lobster_pasta", new StewItem(new Item.Settings().maxCount(16).food(ModFoods.LOBSTER_PASTA)));
    public static final Item BISON_BURGER = registerItem("bison_burger", new Item(new Item.Settings().food(ModFoods.BISON_BURGER)));
    public static final Item BUNFUNGUS_SANDWICH = registerItem("bunfungus_sandwich", new Item(new Item.Settings().food(ModFoods.BUNFUNGUS_SANDWICH)));
    public static final Item KANGAROO_PASTA = registerItem("kangaroo_pasta", new StewItem(new Item.Settings().maxCount(16).food(ModFoods.KANGAROO_PASTA)));
    public static final Item BEAR_STEW = registerItem("bear_stew", new StewItem(new Item.Settings().maxCount(16).food(ModFoods.BEAR_STEW)));
    public static final Item SWAMP_GUMBO = registerItem("swamp_gumbo", new StewItem(new Item.Settings().maxCount(16).food(ModFoods.SWAMP_GUMBO)));
    public static final Item CAIMAN_RIBS_PLATTER = registerItem("caiman_ribs_platter", new Item(new Item.Settings().food(ModFoods.CAIMAN_RIBS_PLATTER)));

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AlexsCuisine.MOD_ID, "alexscuisine"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(RAW_BISON))
                    .displayName(Text.translatable("itemGroup.alexscuisine"))
                    .entries((context, entries) -> {
                        entries.add(KANGAROO_SHANK);
                        entries.add(COOKED_KANGAROO_SHANK);
                        entries.add(LOOSE_MOOSE_RIB);
                        entries.add(COOKED_LOOSE_MOOSE_RIB);
                        entries.add(BISON_MINCE);
                        entries.add(BISON_PATTY);
                        entries.add(RAW_BUNFUNGUS_DRUMSTICK);
                        entries.add(COOKED_BUNFUNGUS_DRUMSTICK);
                        entries.add(RAW_CATFISH_SLICE);
                        entries.add(COOKED_CATFISH_SLICE);
                        entries.add(RAW_BEAR_SHANK);
                        entries.add(COOKED_BEAR_SHANK);
                        entries.add(RAW_CROCODILE_TAIL);
                        entries.add(COOKED_CROCODILE_TAIL);
                        entries.add(RAW_CAIMAN_RIBS);
                        entries.add(COOKED_CAIMAN_RIBS);
                        entries.add(RAW_BISON);
                        entries.add(COOKED_BISON);
                        entries.add(RAW_BUNFUNGUS);
                        entries.add(COOKED_BUNFUNGUS);
                        entries.add(COOKED_CENTIPEDE_LEG);
                        entries.add(GONGYLIDIA_BRUSCHETTA);
                        entries.add(MAGGOT_SALAD);
                        entries.add(KANGAROO_STEW);
                        entries.add(ACACIA_BLOSSOM_SOUP);
                        entries.add(LOBSTER_PASTA);
                        entries.add(BISON_BURGER);
                        entries.add(BUNFUNGUS_SANDWICH);
                        entries.add(KANGAROO_PASTA);
                        entries.add(BEAR_STEW);
                        entries.add(SWAMP_GUMBO);
                        entries.add(CAIMAN_RIBS_PLATTER);
                    })
                    .build());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AlexsCuisine.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // Static field initialization handles registration.
    }
}
