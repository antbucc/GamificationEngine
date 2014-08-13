package eu.trentorise.game.ruleengine.container;

import eu.trentorise.game.plugin.model.Plugin;

/**
 *
 * @author Luca Piras
 */
public class PluginOperatorContainer implements IPluginOperatorContainer {
    
    protected Plugin gamificationPlugin;

    @Override
    public Plugin getGamificationPlugin() {
        return gamificationPlugin;
    }

    @Override
    public void setGamificationPlugin(Plugin gamificationPlugin) {
        this.gamificationPlugin = gamificationPlugin;
    }

    @Override
    public String toString() {
        return "PluginOperatorContainer{" + "gamificationPlugin=" + gamificationPlugin + '}';
    }
}