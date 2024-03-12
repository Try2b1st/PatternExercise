package org.example.decorator;

public class FastRice implements FastFood{


    @Override
    public String getDesc() {
        return "炒饭";
    }

    @Override
    public Double getPrice() {
        return 10.5;
    }
}
