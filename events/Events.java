package fr.mrlygikas.com.youtube.events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.mrlygikas.com.youtube.Main;

public class Events implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();

		p.getInventory().clear();
		p.setHealth(20.0);
		p.setFoodLevel(20);
		p.setLevel(0);
		p.setExp(0);

		e.setJoinMessage("§7[§a+§7] §e" + p.getName() + " a rejoint le serveur");
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();

		e.setQuitMessage("§7[§c-§7] §e" + p.getName() + " a quitté le serveur");
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();

		p.sendMessage("§eTu vient de casser le block " + e.getBlock().getType());
	}

}
