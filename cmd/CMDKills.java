package fr.mrlygikas.com.youtube.cmd;

import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMDKills implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("§cIl faut être un joueur pour utiliser cette commande !");
			return true;
		} 
		
		Player p = (Player)sender;
		
		p.sendMessage("§eTon nombre de kill est: §a"+p.getStatistic(Statistic.PLAYER_KILLS));
		return false;
	}

}
