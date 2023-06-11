package org.starfruit.aperturetech.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModShapes {

    public static VoxelShape EMERGENCY_INTELLIGENCE_INCINERATOR_BLOCK_BLOCK_ENTRY =
            Shapes.join(
                    Block.box(0D, 0D, 0D, 16D, 16D, 16D),
                    Block.box(1D, 1D, 1D, 15D, 16D, 15D),
                    BooleanOp.ONLY_FIRST
                    );

    public static VoxelShape EMERGENCY_INTELLIGENCE_INCINERATOR_BLOCK_BLOCK_ENTRY_WITH_SLIDING_DOOR =
            Shapes.join(
                    Block.box(0D, 0D, 0D, 16D, 16D, 16D),
                    Block.box(0D, 0D, 1D, 15D, 16D, 16D),
                    BooleanOp.ONLY_FIRST
            );

    public static final VoxelShape MATERIAL_EMANCIPATION_GRILL_X_AXIS = Block.box(0D, 0D, 6D, 16D, 16D, 10D);
    public static final VoxelShape MATERIAL_EMANCIPATION_GRILL_Y_AXIS = Block.box(6D, 0D, 0D, 10D, 16D, 16D);
    public static final VoxelShape MATERIAL_EMANCIPATION_GRILL_Z_AXIS = Block.box(0D, 6D, 0D, 16D, 10D, 16D);
}
