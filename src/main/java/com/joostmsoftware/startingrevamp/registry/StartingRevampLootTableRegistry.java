package com.joostmsoftware.startingrevamp.registry;

import com.joostmsoftware.startingrevamp.item.StartingRevampItems;
import com.joostmsoftware.startingrevamp.item.StartingRevampToolItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.predicate.item.ItemPredicate;

public class StartingRevampLootTableRegistry {

    public static void registerAdjustedLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
           if (Blocks.GRASS.getLootTableId().equals(id)) {
               if (source != LootTableSource.VANILLA) {
                   throw new AssertionError("grass loot table should have LootTableSource.VANILLA");
               }

               LootPool pool = LootPool.builder()
                       .with(ItemEntry.builder(StartingRevampItems.GRASS_VIBER).build())
                       .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(StartingRevampToolItems.FLINT_GRASS_CUTTERS)).build())
                       .build();

               tableBuilder.pool(pool).build();
           }
        });
    }
}
