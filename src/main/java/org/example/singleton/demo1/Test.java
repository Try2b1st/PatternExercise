package org.example.singleton.demo1;

public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}