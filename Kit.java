package com.meeku.tutorialPlugin;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor {

	 @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            ItemStack food = new ItemStack(Material.COOKED_CHICKEN);
	            food.setAmount(32);
	            ItemStack armorhead = new ItemStack(Material.DIAMOND_HELMET);
	            ItemStack armorbody = new ItemStack(Material.DIAMOND_CHESTPLATE);
	            ItemStack armorpants = new ItemStack(Material.DIAMOND_LEGGINGS);
	            ItemStack armorboots = new ItemStack(Material.DIAMOND_BOOTS);  
	            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
	            player.getInventory().addItem(food, armorhead, armorbody, armorpants, armorboots, sword);
	        }
	        // If the player (or console) uses our command correct, we can return true
	        return true;
		} 
    }
