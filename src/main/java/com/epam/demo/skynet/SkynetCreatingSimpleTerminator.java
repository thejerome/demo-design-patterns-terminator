package com.epam.demo.skynet;

import com.epam.demo.humankind.Humankind;
import com.epam.demo.terminator.FlyingDeathDroneTerminator;
import com.epam.demo.terminator.SimpleSoldierTerminator;
import com.epam.demo.terminator.Terminator;

public class SkynetCreatingSimpleTerminator extends Skynet {
    public void enslaveHumankind(Humankind humankind) {
        while (!humankind.isEnsalved()) {
            createTerminator().huntHumans();
            waitALittle();
        }
    }

    protected Terminator createTerminator() {
        return new SimpleSoldierTerminator();
    }

    private void waitALittle() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
