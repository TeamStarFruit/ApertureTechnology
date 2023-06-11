package org.starfruit.aperturetech.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class EmergencyIntelligenceIncineratorBlock extends Block {

    public EmergencyIntelligenceIncineratorBlock(Properties pProperties) {
        super(BlockBehaviour.Properties.of(Material.STONE)
                .strength(0.3F).sound(SoundType.STONE)
                .noOcclusion());
    }

}
