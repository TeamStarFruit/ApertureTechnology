package org.starfruit.aperturetech.init;

import com.tterrag.registrate.util.entry.BlockEntry;
import org.starfruit.aperturetech.block.EmergencyIntelligenceIncineratorBlock;

import static org.starfruit.aperturetech.ApertureTechMod.REGISTRATE;

public class ModBlocks {

    static {
        REGISTRATE.creativeModeTab(() -> ModTabs.APERTURETECH);
    }

    public static final BlockEntry<EmergencyIntelligenceIncineratorBlock> SCHEMATIC_TABLE =
            REGISTRATE.block("emergency_intelligence_incinerator", EmergencyIntelligenceIncineratorBlock::new)
                    .lang("Emergency Intelligence Incinerator")
                    .simpleItem()
                    .register();

    public static void register() {}
}
