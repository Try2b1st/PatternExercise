package org.example.memento;

public class Client {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // 1 2 1 2 1 2 1
        counter.Increment();
        System.out.println(counter.getValue());
        counter.Increment();
        System.out.println(counter.getValue());
        counter.decrement();
        System.out.println(counter.getValue());
        counter.Increment();
        System.out.println(counter.getValue());
        counter.undo();
        System.out.println(counter.getValue());
        counter.undo();
        System.out.println(counter.getValue());
        counter.redo();
        System.out.println(counter.getValue());

    }
}
