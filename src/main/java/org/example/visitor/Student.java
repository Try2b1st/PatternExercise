package org.example.visitor;

public class Student implements Visitor {
    @Override
    public void visited(Circle circle) {
        System.out.println("Circle r=5 S = " + circle.getRadius() * circle.getRadius() * Math.PI);
    }

    @Override
    public void visited(Rectangle rectangle) {
        System.out.println("Rectangle h = " + rectangle.getHeight() + " w = " + rectangle.getWidth() + " S = " + rectangle.getWidth() * rectangle.getHeight());
    }
}
