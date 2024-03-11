package org.example.adapter.objectAdapter.impl;

import org.example.adapter.objectAdapter.TFCard;

public class TFCardImpl implements TFCard {
    @Override
    public void writeTF(Integer i) {
        System.out.println("TF write " + i);
    }

    @Override
    public String readTF() {
        System.out.println("TF read data");
        return "Hello Word";
    }
}
