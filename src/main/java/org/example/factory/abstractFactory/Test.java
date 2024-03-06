package org.example.factory.abstractFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AmericanFactory();

        Coffee coffee = abstractFactory.makeCoffee();
        Dessert dessert = abstractFactory.makeDessert();

        coffee.getName();
        dessert.getName();
    }
}
