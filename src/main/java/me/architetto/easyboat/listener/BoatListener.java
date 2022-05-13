package me.architetto.easyboat.listener;

import org.bukkit.Material;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.inventory.ItemStack;

public class BoatListener implements Listener {
    @EventHandler
    public void onBoatLeave(VehicleExitEvent event) {
        if (event.getVehicle() instanceof Boat
                && event.getExited() instanceof Player) {

            if (event.getVehicle().getPassengers().size() != 1)
                return;

            Material boat_material = ((Boat) event.getVehicle()).getBoatMaterial();
            event.getVehicle().remove();
            event.getExited().getWorld().dropItem(event.getExited().getLocation(),new ItemStack(boat_material));

        }
    }
}



