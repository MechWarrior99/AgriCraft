package com.InfinityRaider.AgriCraft.compatibility.computercraft.method;

import com.InfinityRaider.AgriCraft.tileentity.TileEntityPeripheral;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MethodHasJournal implements IMethod {
    @Override
    public String getName() {
        return "hasJournal";
    }

    @Override
    public Object[] call(TileEntityPeripheral peripheral, World world, int x, int y, int z, ItemStack journal, Object... args) throws MethodException {
        return new Object[] {journal!=null};
    }
}
