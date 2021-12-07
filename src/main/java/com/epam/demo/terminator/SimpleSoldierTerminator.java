package com.epam.demo.terminator;

public class SimpleSoldierTerminator implements Terminator{

    @Override
    public void huntHumans() {
        System.out.println(this + " goes forward");
        System.out.println(this + " shoots");
    }
}
