package org.example.adapter.classAdapter;

public class Computer {
    private SDCard sdCard;

    public Computer() {
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public String readSD() {
        return sdCard.readSD();
    }

    public void writeSD(String s){
        sdCard.writeSD(s);
    }
}
