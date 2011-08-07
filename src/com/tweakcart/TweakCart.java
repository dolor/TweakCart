package com.tweakcart;

import com.tweakcart.listeners.TweakCartBlockListener;
import com.tweakcart.listeners.TweakCartVehicleListener;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


/**
 * Created by IntelliJ IDEA.
 * User: Edoxile
 */
public class TweakCart extends JavaPlugin {
    private static Logger log = Logger.getLogger("Minecraft");
    private TweakCartVehicleListener vehicleListener = null;
    private TweakCartBlockListener blockListener = null;

    public void onEnable() {
        // Initialising variables
        vehicleListener = new TweakCartVehicleListener(this);
        blockListener = new TweakCartBlockListener(this);

        // Load plugin-manager and register events
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.VEHICLE_MOVE, vehicleListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.BLOCK_DISPENSE, blockListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.VEHICLE_COLLISION_BLOCK, vehicleListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.SIGN_CHANGE, blockListener , Event.Priority.Normal, this);
        // Loaded!
        log.info("[" + getDescription().getName() + "] Enabled! version:" + getDescription().getVersion());
    }

    public void onDisable() {
        log.info("[" + getDescription().getName() + "] Disabled!");
    }
    
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(cmd.getName().toLowerCase().equals("cartdebug")){
            sender.sendMessage("SoftMap peformance," + ChatColor.GREEN + " Hits: " + vehicleListener.getSoftMapHits() + ChatColor.YELLOW + ", Partial misses: " + vehicleListener.getPartialMisses() + ChatColor.RED + ", Misses: " + vehicleListener.getSoftMapMisses() + ChatColor.GOLD + ", Average Full hits: " + (float) vehicleListener.getSoftMapHits() / ((float) vehicleListener.getSoftMapHits() + (float) vehicleListener.getSoftMapMisses())  * 100.0f + "%");
        }
        return false;
    }
    
    public TweakCartBlockListener getBlockListener(){
        return blockListener;
    }
    
    public TweakCartVehicleListener getVehicleListener(){
        return vehicleListener;
    }
}
