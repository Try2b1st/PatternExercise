package org.example.decorator;

public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new Egg(new Bacon(new FastRice()));
        System.out.println(fastFood.getDesc() + "," + fastFood.getPrice() + "元");
    }
}
