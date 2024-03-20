package org.example.memento;

/**
 * 备忘录
 */
public class Memento {
    private int value;

    public Memento(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
