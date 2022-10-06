package com.joostmsoftware.startingrevamp.item.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum StartingRevampToolMaterials implements ToolMaterial {
//     [ Vanilla Values ]
//    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
//        return Ingredient.fromTag(ItemTags.PLANKS);
//    }),
//    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
//        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
//    }),
//    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
//    }),
//    DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
//    }),
//    GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
//    }),
//    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
//        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
//    });
    FLINT(0, 32, 1.0f, 0.0f, 10, () -> Ingredient.ofItems(Items.FLINT))
    ;

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private StartingRevampToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
