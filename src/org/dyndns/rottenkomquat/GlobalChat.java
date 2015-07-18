package org.dyndns.rottenkomquat;

import net.md_5.bungee.api.plugin.Plugin;

public class GlobalChat extends Plugin {
    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerCommand(this, new GCommand());
    }
}
