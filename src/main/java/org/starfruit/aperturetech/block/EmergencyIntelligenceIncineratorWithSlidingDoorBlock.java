package org.starfruit.aperturetech.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.starfruit.aperturetech.init.ModShapes;

public class EmergencyIntelligenceIncineratorWithSlidingDoorBlock extends Block {

    public EmergencyIntelligenceIncineratorWithSlidingDoorBlock(Properties pProperties) {
        super(BlockBehaviour.Properties.of(Material.STONE)
                .strength(0.3F).sound(SoundType.STONE)
                .noOcclusion());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return ModShapes.EMERGENCY_INTELLIGENCE_INCINERATOR_BLOCK_BLOCK_ENTRY_WITH_SLIDING_DOOR;
    }

}