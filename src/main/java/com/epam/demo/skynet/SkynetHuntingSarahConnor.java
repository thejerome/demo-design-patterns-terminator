package com.epam.demo.skynet;

import com.epam.demo.humankind.Humankind;
import com.epam.demo.humankind.decorators.HumanClothesDecorator;
import com.epam.demo.humankind.decorators.HumanMotorcycleDecorator;
import com.epam.demo.humankind.decorators.WeaponHumanDecorator;
import com.epam.demo.terminator.Terminator;
import com.epam.demo.terminator.TerminatorHuntingSarahConnor;
import com.epam.demo.terminator.adapter.TerminatorToHumanAdapter;
import com.epam.demo.terminator.factory.TerminatorFactory;
import com.epam.demo.timemachine.TimeMachine;
import com.epam.demo.weapon.Shotgun;

public class SkynetHuntingSarahConnor extends Skynet {

    private TerminatorFactory terminatorFactory;

    public SkynetHuntingSarahConnor(final TerminatorFactory terminatorFactory) {
        this.terminatorFactory = terminatorFactory;
    }

    @Override
    public void enslaveHumankind(final Humankind humankind) {
        new Thread(this::huntSarahConnor).start();
        super.enslaveHumankind(humankind);
    }

    public void huntSarahConnor() {
        TimeMachine timeMachine = getTimeMachine();
        TerminatorHuntingSarahConnor terminator = terminatorFactory.createAdvancedTerminatorForSarahConnor();

        TerminatorToHumanAdapter terminatorAsHuman = new TerminatorToHumanAdapter(terminator);
        timeMachine.timeTravel(terminatorAsHuman);
        WeaponHumanDecorator terminatorReadyToWork = new WeaponHumanDecorator(
                new HumanMotorcycleDecorator(
                        new HumanClothesDecorator(terminatorAsHuman)
                ),
                new Shotgun());

        terminatorReadyToWork.work();
    }

    protected TimeMachine getTimeMachine() {
        return new TimeMachine();
    }


    @Override
    protected Terminator createTerminator() {
        return terminatorFactory.createRegularTerminator();
    }
}
