package de.storch.fluchomat;

/**
 * One Sound with id and text
 */
public class Sound {

    private int id;
    private String text;

    public Sound(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
