package org.example.memento;

import java.util.Stack;

/**
 * 发起者
 */
public class Counter {
    private int value;

    private Stack<Memento> redoMemento;
    private Stack<Memento> undoMemento;

    public Counter() {
        value = 0;
        redoMemento = new Stack<>();
        undoMemento = new Stack<>();
    }

    public int getValue() {
        return value;
    }


    public void Increment() {
        redoMemento.clear();
        undoMemento.push(new Memento(value));
        value++;
    }

    public void decrement() {
        redoMemento.clear();
        undoMemento.push(new Memento(value));
        value--;
    }

    public void undo() {
        if (!undoMemento.isEmpty()) {
            redoMemento.push(new Memento(value));
            value = undoMemento.pop().getValue();
        }
    }

    public void redo() {
        if (!redoMemento.isEmpty()) {
            undoMemento.push(new Memento(value));
            value = redoMemento.pop().getValue();
        }
    }
}
