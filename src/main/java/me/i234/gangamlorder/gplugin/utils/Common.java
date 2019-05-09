package me.i234.gangamlorder.gplugin.utils;

import me.i234.gangamlorder.gplugin.GPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Map;

public class Common {
    public void send(Player player, String message){
        player.sendMessage(ChatColor.translateAlternateColorCodes('&',message));
    }
    public String colorize(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }
    public Inventory makeGUI(String name, int size, Map<Integer, ItemStack> items){
        Inventory inv = Bukkit.createInventory(null,size,colorize(name));
        ItemStack[] contents = inv.getContents();
        for(int index = 0; index < contents.length; index++){
            if(items.get(index) != null){
                contents[index] = items.get(index);
                continue;
            }
            ItemStack bgItem = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
            ItemMeta bgMeta = bgItem.getItemMeta();
            bgMeta.setDisplayName(" ");
            bgItem.setItemMeta(bgMeta);
            contents[index] = bgItem;
        }
        inv.setContents(contents);
        return inv;
    }
}
