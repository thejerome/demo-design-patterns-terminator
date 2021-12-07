package com.epam.demo.humankind;

import java.util.ArrayList;
import java.util.List;

public class Neighbor extends SimpleHuman {
    List<SarahConnorIsBackFromWorkObserver> observers = new ArrayList<>();

    public Neighbor(final String name) {
        super(name);
    }

    public void fireSarahConnorIsBackFromWorkEvent(){
        for (SarahConnorIsBackFromWorkObserver observer : observers) {
            observer.onSarahConnorIsBackFromWork();
        }
    }

    public void addSarahConnorIsBackFromWorkObserver(SarahConnorIsBackFromWorkObserver observer) {
        observers.add(observer);
    }

}
