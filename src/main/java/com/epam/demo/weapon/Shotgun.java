package com.epam.demo.weapon;

public class Shotgun implements Weapon {
    @Override
    public void apply() {
        System.out.println("Ba-doom!");
    }
}
