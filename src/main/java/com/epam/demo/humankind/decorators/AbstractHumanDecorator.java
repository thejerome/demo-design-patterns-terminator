package com.epam.demo.humankind.decorators;

import com.epam.demo.humankind.Human;

public class AbstractHumanDecorator implements Human {
    protected final Human human;

    public AbstractHumanDecorator(final Human human) {
        this.human = human;
    }

    @Override
    public void work() {
        human.work();
    }

    @Override
    public String getName() {
        return human.getName();
    }
}
