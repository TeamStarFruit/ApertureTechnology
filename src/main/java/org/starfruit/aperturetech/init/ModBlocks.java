package org.starfruit.aperturetech.init;

import com.tterrag.registrate.util.entry.BlockEntry;
import org.starfruit.aperturetech.block.EmergencyIntelligenceIncineratorBlock;
import org.starfruit.aperturetech.block.EmergencyIntelligenceIncineratorWithSlidingDoorBlock;

import static org.starfruit.aperturetech.ApertureTechMod.REGISTRATE;

public class ModBlocks {

    static {
        REGISTRATE.creativeModeTab(() -> ModTabs.APERTURETECH);
    }

    public static final BlockEntry<EmergencyIntelligenceIncineratorBlock> EMERGENCY_INTELLIGENCE_INCINERATOR =
            REGISTRATE.block("emergency_intelligence_incinerator", EmergencyIntelligenceIncineratorBlock::new)
                    .lang("Emergency Intelligence Incinerator")
                    .simpleItem()
                    .register();

    public static final BlockEntry<EmergencyIntelligenceIncineratorWithSlidingDoorBlock> EMERGENCY_INTELLIGENCE_INCINERATOR_WITH_SLIDING_DOOR =
            REGISTRATE.block("emergency_intelligence_incinerator_with_sliding_door", EmergencyIntelligenceIncineratorWithSlidingDoorBlock::new)
                    .lang("Emergency Intelligence Incinerator With Sliding Door")
                    .simpleItem()
                    .register();


    public static void register() {}
}
