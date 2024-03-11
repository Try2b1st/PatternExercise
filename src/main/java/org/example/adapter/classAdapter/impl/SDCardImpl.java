package org.example.adapter.classAdapter.impl;

import org.example.adapter.classAdapter.SDCard;

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
