package me.servercaster.converter.code;

import org.bukkit.ChatColor;

/**
 *
 * @author Patrick Beuks (killje) And Floris Huizinga(Flexo013)
 */
public class ColorConverter extends SpecialCodeConverter{

    private final String name;
    private final ChatColor color;

    public ColorConverter(String name, ChatColor color) {
        super(0);
        this.name = name;
        this.color = color;
    }

    @Override
    public String getCode() {
        return name;
    }

    @Override
    public void doAction(String s) {
        fm.color(color);
    }
    
    
}
