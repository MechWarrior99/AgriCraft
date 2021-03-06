package com.InfinityRaider.AgriCraft.compatibility.computercraft.method;

import com.InfinityRaider.AgriCraft.api.v1.BlockWithMeta;
import com.InfinityRaider.AgriCraft.apiimpl.v1.cropplant.CropPlant;
import com.InfinityRaider.AgriCraft.farming.GrowthRequirementHandler;
import com.InfinityRaider.AgriCraft.tileentity.TileEntityCrop;
import net.minecraft.item.ItemStack;

public class MethodGetBaseBlock extends MethodCropBase {
    public MethodGetBaseBlock() {
        super("getBaseBlock");
    }

    @Override
    protected Object[] onMethodCalled(TileEntityCrop crop) {
        CropPlant plant = crop.getPlant();
        if(plant==null) {
            return null;
        }
        BlockWithMeta block = GrowthRequirementHandler.getGrowthRequirement(plant).getRequiredBlock();
        return new Object[] {(new ItemStack(block.getBlock(), 1, block.getMeta())).getDisplayName()};
    }

    @Override
    protected boolean requiresJournal() {
        return true;
    }
}
