package org.example.factory.factoryMethod;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee makeCoffee() {
        return new AmericanCoffee();
    }
}
