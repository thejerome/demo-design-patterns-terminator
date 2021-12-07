package com.epam.demo;

import com.epam.demo.humankind.Humankind;
import com.epam.demo.skynet.Skynet;
import com.epam.demo.skynet.SkynetHuntingSarahConnor;
import com.epam.demo.terminator.factory.TerminatorFactory1984;
import com.epam.demo.terminator.factory.TerminatorFactory1991;

public class Main {
    public static void main(String[] args) {
        Humankind humankind = new Humankind();
        Skynet skynet = new SkynetHuntingSarahConnor(new TerminatorFactory1984(humankind));

        skynet.enslaveHumankind(humankind);
    }
}
