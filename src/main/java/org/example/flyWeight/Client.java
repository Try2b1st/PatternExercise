package org.example.flyWeight;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeFactory factory = new ShapeFactory();

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            processCommand(factory, command);
        }

    }

    public static void processCommand(ShapeFactory factory, String command) {
        String[] parts = command.split(" ");
        ShapeType type = ShapeType.valueOf(parts[0]);
        int x = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);

        Shape shape = factory.getShape(type);
        shape.draw(new Position(x, y));
        ((ConcreteShape) shape).setFirstDraw(false);
    }
}
