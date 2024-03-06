package org.example.prototype;

public class Realize implements Cloneable {

    public Realize() {
        System.out.println("construct success");
    }

    public Realize clone() throws CloneNotSupportedException {
        System.out.println("clone success");
        return (Realize) super.clone();
    }
}
