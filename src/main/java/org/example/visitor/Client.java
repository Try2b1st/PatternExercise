package org.example.visitor;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,3);

        Student student = new Student();

        circle.accept(student);
        rectangle.accept(student);
    }
}
