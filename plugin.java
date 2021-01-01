package com.meeku.tutorialPlugin;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;




public class SpigotBlankPlugin extends JavaPlugin {
	 // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	this.getCommand("kit").setExecutor(new CommandKit());
    	//Allows use of commands in plugin ex. /kit
    	getServer().getPluginManager().registerEvents(new Charged(), this);
    	//Allows checking for events such as creature spawn
    	ItemStack WBlock = new ItemStack(Material.OAK_PLANKS);
    	ItemMeta WBlockMeta = WBlock.getItemMeta();
    	WBlockMeta.setDisplayName("§awooden-axe-block");
    	WBlock.setItemMeta(WBlockMeta);
    	WBlock.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
    NamespacedKey WXBlockKey = new NamespacedKey(this,"wooden-axe-block");
    ShapedRecipe WXBlockRecipe = new ShapedRecipe(WXBlockKey, WBlock);
    WXBlockRecipe.shape("WWW","WWW","WWW");
    WXBlockRecipe.setIngredient('W', Material.WOODEN_AXE);
    Bukkit.addRecipe(WXBlockRecipe);
    	ItemStack SPick = new ItemStack(Material.STONE_PICKAXE);
    	ItemMeta SPickMeta = SPick.getItemMeta();
    	SPickMeta.setDisplayName("§achad-pick");
    	SPick.setItemMeta(SPickMeta);
    	SPick.addEnchantment(Enchantment.DIG_SPEED, 5);
    NamespacedKey SCPickKey = new NamespacedKey(this,"chad-pick");
    ShapedRecipe SCPickRecipe = new ShapedRecipe(SCPickKey, SPick);
    SCPickRecipe.shape("BBB","ASA","ASA");
    SCPickRecipe.setIngredient('S', Material.STICK);
    SCPickRecipe.setIngredient('B', Material.CRAFTING_TABLE);
    Bukkit.addRecipe(SCPickRecipe);
   
    }
    @Override
    public void onDisable() {
    }
    
}
    	
