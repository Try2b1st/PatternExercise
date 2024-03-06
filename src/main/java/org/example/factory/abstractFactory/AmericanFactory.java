package org.example.factory.abstractFactory;

public class AmericanFactory implements AbstractFactory{
    @Override
    public Coffee makeCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert makeDessert() {
        return new MatchMousse();
    }
}
