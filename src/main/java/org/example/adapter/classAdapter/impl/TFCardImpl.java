package org.example.adapter.classAdapter.impl;

import org.example.adapter.classAdapter.TFCard;

public class TFCardImpl implements TFCard {
    @Override
    public void writeTF(String s) {
        System.out.println("TF write " + s);
    }

    @Override
    public String readTF() {
        System.out.println("TF read data");
        return "Hello Word";
    }
}
