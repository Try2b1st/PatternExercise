package org.example.template;

public class AmericanCoffee extends Coffee {
    public AmericanCoffee(String name) {
        super(name);
    }

    @Override
    protected void grindingCoffeeBeans() {
        System.out.println("grinding Coffee Beans");
    }

    @Override
    protected void brewingCoffee() {
        System.out.println("brewing Coffee");
    }

    @Override
    protected void addingCondiments() {
        System.out.println("adding Condiments");
    }
}
