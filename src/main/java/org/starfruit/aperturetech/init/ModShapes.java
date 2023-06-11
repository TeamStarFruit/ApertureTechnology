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
                    Block.box(1D, 1D, 1D, 15D, 16D, 16D),
                    BooleanOp.ONLY_FIRST
            );
}
