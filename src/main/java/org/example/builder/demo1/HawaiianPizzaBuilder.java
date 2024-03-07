package org.example.builder.demo1;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void buildDough() {
        pizza.setDough("thin");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham and pineapple");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}