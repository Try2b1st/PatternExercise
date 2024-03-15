package org.example.combination;

import java.util.ArrayList;
import java.util.List;

public class Department implements Component {
    private String name;
    private List<Component> list;

    public Department(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void display(int desc) {
        String stringBuilder = " ".repeat(desc) + this.name;
        System.out.println(stringBuilder);
        for (Component component : list) {
            component.display(desc + 1);
        }
    }
}
