package com.epam.demo.terminator.factory;

import com.epam.demo.terminator.Terminator;
import com.epam.demo.terminator.TerminatorHuntingSarahConnor;

public interface TerminatorFactory {

    Terminator createRegularTerminator();
    TerminatorHuntingSarahConnor createAdvancedTerminatorForSarahConnor();

}
