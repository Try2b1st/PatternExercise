package org.example.adapter.objectAdapter;

import org.example.adapter.objectAdapter.impl.TFCardImpl;

public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public TFCard getTfCard() {
        return tfCard;
    }

    public void setTfCard(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void writeSD(String s) {
        tfCard.writeTF(Integer.parseInt(s));
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }
}
