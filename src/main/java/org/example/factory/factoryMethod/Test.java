package org.example.factory.factoryMethod;

public class Test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        CoffeeFactory coffeeFactory = new LatterCoffeeFactory();

        coffeeStore.setCoffeeFactory(coffeeFactory);

        Coffee coffee = coffeeStore.getCoffee();

        coffee.addSugar();
        coffee.addMilk();
        coffee.getName();
    }
}
