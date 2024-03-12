package org.example.decorator;

public class Bacon extends CondimentDecorator {
    public Bacon(FastFood fastFood) {
        super(fastFood);
    }

    @Override
    public String getDesc() {
        return fastFood.getDesc() + "+培根";
    }

    @Override
    public Double getPrice() {
        return fastFood.getPrice() + 1.5;
    }
}
