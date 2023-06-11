package org.starfruit.aperturetech.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.starfruit.aperturetech.init.ModShapes;

public class MaterialEmancipationGrillBlock extends Block {

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.HORIZONTAL_AXIS;

    public MaterialEmancipationGrillBlock(Properties pProperties) {
        super(BlockBehaviour.Properties.of(Material.PORTAL).noCollission().randomTicks().strength(-1.0F)
                .sound(SoundType.GLASS).lightLevel(light_level -> {return 15;}));
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.X));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return switch (pState.getValue(AXIS)) {
            case X -> ModShapes.MATERIAL_EMANCIPATION_GRILL_X_AXIS;
            case Y -> ModShapes.MATERIAL_EMANCIPATION_GRILL_Y_AXIS;
            default -> ModShapes.MATERIAL_EMANCIPATION_GRILL_Z_AXIS;
        };
    }

    public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) {
        return ItemStack.EMPTY;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AXIS);
    }
}
