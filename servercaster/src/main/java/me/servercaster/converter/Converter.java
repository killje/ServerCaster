package me.servercaster.converter;

import me.servercaster.ServercastMessage;
import mkremins.fanciful.FancyMessage;

/**
 *
 * @author Patrick Beuks (killje) and Floris Huizinga (Flexo013)
 */
public abstract class Converter {

    private String saver = "";
    protected final FancyMessage fm;
    protected final ServercastMessage sm;

    public Converter(FancyMessage fm, ServercastMessage sm) {
        this.fm = fm;
        this.sm = sm;
    }

    public Converter nextChar(char c) {
        if (isEndChar(c)) {
            return end();
        } else {
            addChar(c);
            return this;
        }
    }

    public void done() {
        fm.then(saver);
    }

    protected abstract Converter end();

    protected abstract boolean isEndChar(char c);

    protected String getSavedString() {
        return saver;
    }

    protected void addChar(char c) {
        saver = saver + c;
    }
}