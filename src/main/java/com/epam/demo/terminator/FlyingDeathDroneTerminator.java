package com.epam.demo.terminator;

public class FlyingDeathDroneTerminator implements Terminator{
    @Override
    public void huntHumans() {
        System.out.println(this + " flies all around");
        System.out.println(this + " does pew-pew");
    }
}
