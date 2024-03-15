package org.example.combination;

public class Employee implements Component{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void display(int desc) {
        String s = " ".repeat(desc + 1) + this.name;
        System.out.println(s);
    }
}
