package com.epam.demo.humankind.decorators;

import com.epam.demo.humankind.Human;

public class HumanClothesDecorator extends AbstractHumanDecorator{

    public HumanClothesDecorator(final Human human) {
        super(human);
    }

    public void interact(Human human){
        System.out.println("Hey there");
    }
}
