package com.epam.demo.terminator.factory;

import com.epam.demo.terminator.SimpleSoldierTerminator;
import com.epam.demo.terminator.T1000;
import com.epam.demo.terminator.Terminator;
import com.epam.demo.terminator.TerminatorHuntingSarahConnor;

public class TerminatorFactory1991 implements TerminatorFactory {
    @Override
    public Terminator createRegularTerminator() {
        return new SimpleSoldierTerminator();
    }

    @Override
    public TerminatorHuntingSarahConnor createAdvancedTerminatorForSarahConnor() {
        return new T1000();
    }
}
