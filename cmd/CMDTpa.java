package fr.mrlygikas.com.youtube.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMDTpa implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage("§cIl faut être un joueur pour utiliser cette commande !");
			return true;
		}

		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("tpa")) {
			if (args.length == 0) {
				p.sendMessage("§cUsage: /tpa <player>");
				return true;
			} else if (args.length == 1) {
				Player target = Bukkit.getPlayer(args[0]);
				if (target != null) {
					p.teleport(target.getLocation());
					p.sendMessage("§aTu es bien a la position de " + target.getName());
				} else {
					p.sendMessage("§cCe joueur n'est pas en ligne !");
				}
			}

		}

		return false;
	}

}
