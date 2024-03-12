package org.example.decorator;

public abstract class CondimentDecorator implements FastFood{

    protected FastFood fastFood;

    public CondimentDecorator(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    @Override
    public String getDesc() {
        return fastFood.getDesc();
    }
    @Override
    public Double getPrice() {
        return fastFood.getPrice();
    }
}
