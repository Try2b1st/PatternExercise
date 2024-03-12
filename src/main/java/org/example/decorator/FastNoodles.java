package org.example.decorator;

public class FastNoodles implements FastFood {

    @Override
    public String getDesc() {
        return "炒面";
    }

    @Override
    public Double getPrice() {
        return 11.0;
    }
}
