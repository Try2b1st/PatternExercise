package org.example.factory.factoryMethod;

public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public CoffeeStore(){}
    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee getCoffee(){
        return coffeeFactory.makeCoffee();
    }
}
