package me.killje.servercaster.core.converter.action;

import java.util.Collection;
import me.killje.servercaster.core.converter.CodeAction;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 *
 * @author Patrick Beuks (killje) and Floris Huizinga (Flexo013)
 */
public class ColorAction extends CodeAction {

    private final String name;
    private final ChatColor color;

    public ColorAction(String name, ChatColor color) {
        super(0);
        this.name = name;
        this.color = color;
    }

    @Override
    protected String getKeyword() {
        return name;
    }

    @Override
    public void doAction(String argument, Collection<Player> players) {
        getJSONSaver().color(color);
    }

}
