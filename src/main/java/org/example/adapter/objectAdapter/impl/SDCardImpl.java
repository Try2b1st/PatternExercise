package org.example.adapter.objectAdapter.impl;

import org.example.adapter.objectAdapter.SDCard;

public class SDCardImpl implements SDCard {
    @Override
    public void writeSD(String s) {
        System.out.println("SD write " + s);
    }

    @Override
    public String readSD() {
        System.out.println("SD read data");
        return "Hello Word";
    }
}
