package com.epam.demo.humankind.decorators;

import com.epam.demo.humankind.Human;


public class HumanMotorcycleDecorator extends AbstractHumanDecorator {

    public HumanMotorcycleDecorator(final Human human) {
        super(human);
    }

    public void ride() {
        System.out.println("Wrooom!");
    }
}
