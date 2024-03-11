package org.example.adapter.classAdapter;

import org.example.adapter.classAdapter.impl.TFCardImpl;

public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public void writeSD(String s) {
        super.writeTF(s);
    }

    @Override
    public String readSD() {
        return super.readTF();
    }
}
