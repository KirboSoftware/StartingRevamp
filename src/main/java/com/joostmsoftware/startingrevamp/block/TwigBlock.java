package com.joostmsoftware.startingrevamp.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.Waterloggable;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;

public class TwigBlock extends Block implements Waterloggable {

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public TwigBlock() {
        super(FabricBlockSettings.of(Material.STONE).strength(0.15f, 0.15f).sounds(BlockSoundGroup.STONE).noCollision().collidable(false));
//        this.setDefaultState(this.getDefaultState().with(WATERLOGGED, false));
    }
}
