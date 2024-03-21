package org.example.template;

public abstract class Coffee {

    private String name;

    public Coffee(String name) {
        this.name = name;

    }

    public final void makeCoffee() {
        System.out.println("make coffee: " + name);
        grindingCoffeeBeans();
        brewingCoffee();
        addingCondiments();
    }

    protected abstract void grindingCoffeeBeans();

    protected abstract void brewingCoffee();

    protected abstract void addingCondiments();
}
