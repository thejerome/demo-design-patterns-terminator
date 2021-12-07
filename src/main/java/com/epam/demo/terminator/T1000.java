package com.epam.demo.terminator;

public class T1000 implements TerminatorHuntingSarahConnor {
    @Override
    public void huntHumans() {
        findSarahConnor();
        System.out.println(this + " shoots!");
    }

    @Override
    public void findSarahConnor() {

    }
}
