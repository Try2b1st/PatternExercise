package org.example.observer;

public class Client {
    public static void main(String[] args) {
        Student student1 = new Student("王维楚", "12345678910");
        Student student2 = new Student("周杰伦", "12345678911");

        Clock clock = new Clock();
        clock.addObserver(student1);
        clock.addObserver(student2);

        for (int i = 12; i < 20; i++) {
            clock.setH(i);
        }

    }
}
