package com.epam.demo.terminator.factory;

import com.epam.demo.humankind.Humankind;
import com.epam.demo.terminator.SimpleSoldierTerminator;
import com.epam.demo.terminator.T800;
import com.epam.demo.terminator.Terminator;
import com.epam.demo.terminator.TerminatorHuntingSarahConnor;

public class TerminatorFactory1984 implements TerminatorFactory {
    private Humankind humankind;

    public TerminatorFactory1984(final Humankind humankind) {
        this.humankind = humankind;
    }

    @Override
    public Terminator createRegularTerminator() {
        return new SimpleSoldierTerminator();
    }

    @Override
    public TerminatorHuntingSarahConnor createAdvancedTerminatorForSarahConnor() {
        return new T800(humankind);
    }
}
