package org.example.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 被观察者
 */
public class Clock implements Subject {
    private int h;
    private int m;

    private List<Observer> observerList;

    public Clock() {
        GregorianCalendar calendar = new GregorianCalendar();

        this.observerList = new ArrayList<>();
        this.h = calendar.get(Calendar.HOUR_OF_DAY);
        this.m = calendar.get(Calendar.MINUTE);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(this.h);
        }
    }

    public void setH(int h) {
        this.h = h;
        notifyObserver();
    }
}
