package org.example.flyWeight;

public class ConcreteShape implements Shape {
    private ShapeType shapeType;
    private Boolean firstDraw = true;

    public ConcreteShape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public void draw(Position position) {
        System.out.println(shapeType.name() + ":" + (firstDraw ? " drawn" : " shared") + " x=" + position.getX() + ", y=" + position.getY());
    }

    public void setFirstDraw(Boolean firstDraw) {
        this.firstDraw = firstDraw;
    }
}
