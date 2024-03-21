package org.example.template;

public class Client {
    public static void main(String[] args) {
        AmericanCoffee americanCoffee = new AmericanCoffee("americanCoffee");
        americanCoffee.makeCoffee();

        System.out.println("-------------------------");

        Latte latte = new Latte("latte");
        latte.makeCoffee();
    }
}
