package org.example.template;

public class Latte extends Coffee{
    public Latte(String name) {
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
        System.out.println("adding mike");
    }
}
