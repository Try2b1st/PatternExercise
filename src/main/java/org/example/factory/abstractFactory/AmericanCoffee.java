package org.example.factory.abstractFactory;

public class AmericanCoffee extends Coffee{
    @Override
    public void getName() {
        System.out.println("美式咖啡");
    }
}
