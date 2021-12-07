package com.epam.demo.terminator.adapter;

import com.epam.demo.humankind.Human;
import com.epam.demo.terminator.Terminator;

public class TerminatorToHumanAdapter implements Human {
    private final Terminator terminator;


    public TerminatorToHumanAdapter(final Terminator terminator) {
        this.terminator = terminator;
    }

    @Override
    public void work() {
        terminator.huntHumans();
    }

    @Override
    public String getName() {
        return "I'll be back";
    }
}
