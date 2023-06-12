package org.starfruit.aperturetech.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;

public class MaterialEmancipationGrillFrameBlock extends Block {

    public static final DirectionProperty FACING = DirectionalBlock.FACING;

    public MaterialEmancipationGrillFrameBlock(Properties pProperties) {
        super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GLASS).lightLevel(light_level -> {return 1;}));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

}
