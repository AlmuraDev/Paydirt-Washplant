package org.waterpicker.paydirtwashplant.block.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.waterpicker.paydirtwashplant.tileentity.TileEntityWashplant;

public class GuiHandler implements IGuiHandler {
    public static final int MOD_TILE_ENTITY_GUI = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_TILE_ENTITY_GUI)
            return new ContainerWashPlant(player.inventory, (TileEntityWashplant) world.getTileEntity(x, y, z));

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_TILE_ENTITY_GUI)
            return new GuiWashPlant(player.inventory, (TileEntityWashplant) world.getTileEntity(x, y, z));
        return null;
    }
}
