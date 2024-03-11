package org.example.adapter.classAdapter;

import org.example.adapter.classAdapter.impl.SDCardImpl;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setSdCard(new SDCardImpl());

        computer.readSD();
        computer.writeSD("SDSDSD");

        System.out.println("=============");

        computer.setSdCard(new SDAdapterTF());

        computer.readSD();
        computer.writeSD("TF TF TF");
    }
}
