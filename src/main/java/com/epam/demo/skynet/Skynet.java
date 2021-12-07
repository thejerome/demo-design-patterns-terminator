package com.epam.demo.skynet;

import com.epam.demo.humankind.Humankind;
import com.epam.demo.terminator.Terminator;

public abstract class Skynet {
    public void enslaveHumankind(Humankind humankind) {
        while (!humankind.isEnsalved()) {
            createTerminator().huntHumans();
            waitALittle();
        }
    }

    protected abstract Terminator createTerminator();

    private void waitALittle() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
