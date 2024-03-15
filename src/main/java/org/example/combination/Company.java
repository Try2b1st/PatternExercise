package org.example.combination;

public class Company {
    private String name;
    private Department root;

    public Company(String name) {
        this.name = name;
        root = new Department(name + " : ");
    }

    public void add(Component component) {
        root.add(component);
    }

    public void display() {
        System.out.println("Company Structure:");
        root.display(0);
    }
}
