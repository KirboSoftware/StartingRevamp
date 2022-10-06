package com.joostmsoftware.startingrevamp.util;

import com.joostmsoftware.startingrevamp.StartingRevamp;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class StartingRevampTags {

    public static final TagKey<Item> TWIGS = TagKey.of(Registry.ITEM_KEY, StartingRevamp.COMMON_ID("twigs"));
    public static final TagKey<Item> WOOLS = TagKey.of(Registry.ITEM_KEY, StartingRevamp.COMMON_ID("wools"));
}
