package com.epam.demo.humankind.decorators;

import com.epam.demo.humankind.Human;
import com.epam.demo.weapon.Weapon;

public class WeaponHumanDecorator extends AbstractHumanDecorator {

    private Weapon weapon;

    public WeaponHumanDecorator(final Human human, final Weapon weapon) {
        super(human);
        this.weapon = weapon;
    }

    public void fight() {
        weapon.apply();
    }
}
