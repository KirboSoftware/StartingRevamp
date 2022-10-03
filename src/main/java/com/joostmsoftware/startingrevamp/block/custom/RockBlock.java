package com.joostmsoftware.startingrevamp.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;

public class RockBlock extends Block implements Waterloggable {

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public RockBlock() {
        super(FabricBlockSettings.of(Material.STONE).strength(0.15f, 0.15f).sounds(BlockSoundGroup.STONE).noCollision().collidable(false));
//        this.setDefaultState(this.getDefaultState().with(WATERLOGGED, false));
    }
}
