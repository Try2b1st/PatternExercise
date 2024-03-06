package org.example.factory.configFactory;

public class Test {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.getCoffeeByName("LatterCoffee");
        coffee.getName();
    }
}
