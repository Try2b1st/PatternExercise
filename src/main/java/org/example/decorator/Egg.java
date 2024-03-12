package org.example.decorator;

public class Egg extends CondimentDecorator {

    public Egg(FastFood fastFood) {
        super(fastFood);
    }

    @Override
    public String getDesc() {
        return fastFood.getDesc() + "+鸡蛋";
    }

    @Override
    public Double getPrice() {
        return fastFood.getPrice() + 1.0;
    }
}
