package org.dyndns.rottenkomquat;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class GCommand extends Command {
	public GCommand()
	{
		super("g");
	}
	
	@Override
	public void execute(CommandSender commandSender, String[] strings)
	{
		ProxiedPlayer player = (ProxiedPlayer)commandSender;
		TextComponent msg1 = new TextComponent("<" + player.getName() + "> ");
		msg1.setColor(ChatColor.GREEN);
		
		TextComponent msg2 = new TextComponent("");
		msg2.setColor(ChatColor.WHITE);
		for (int i = 0; i < strings.length; i++)
		{
			String s = strings[i];
			msg2.addExtra(s);
			if (i != strings.length - 1)
				msg2.addExtra(" ");
		}
		msg1.addExtra(msg2);
		
		for (ProxiedPlayer p: ProxyServer.getInstance().getPlayers())
        {
        	p.sendMessage(msg1);
        }
	}
}
