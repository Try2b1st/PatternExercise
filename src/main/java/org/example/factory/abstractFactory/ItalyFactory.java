package org.example.factory.abstractFactory;

public class ItalyFactory implements AbstractFactory{
    @Override
    public Coffee makeCoffee() {
        return new LatterCoffee();
    }

    @Override
    public Dessert makeDessert() {
        return new MatchMousse();
    }
}
