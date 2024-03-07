package org.example.builder.demo1;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza.getDescription());
    }
}