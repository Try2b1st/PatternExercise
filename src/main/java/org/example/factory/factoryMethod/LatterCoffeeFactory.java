package org.example.factory.factoryMethod;

public class LatterCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee makeCoffee() {
        return new LatterCoffee();
    }
}
