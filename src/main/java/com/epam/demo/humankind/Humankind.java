package com.epam.demo.humankind;

import com.epam.demo.humankind.phonebook.PhoneBook;

public class Humankind {

    private SimpleHuman[] humans = new SimpleHuman[]{
            new SimpleHuman("Sarah Condor"),
            new SimpleHuman("Sarah Comtur"),
            new SimpleHuman("Sarah Contur"),
            new SimpleHuman("Sarah Bombur"),
            new SimpleHuman("Sarah Sarah"),
            new SimpleHuman("Sarah Connor"),
            new SimpleHuman("Sarah zs'p;djvcv;"),
            new SimpleHuman("Sarah sl;kok,fdsf"),
    };

    {
        for (SimpleHuman human : humans) {
            human.work();
        }
    }

    private boolean isEnsalved = false;

    public boolean isEnsalved() {
        return isEnsalved;
    }

    public PhoneBook getPhoneBook() {
        return new PhoneBook() {
            private int position = 0;

            @Override
            public boolean hasNextHuman() {
                return position < humans.length;
            }

            @Override
            public SimpleHuman nextHuman() {
                return humans[position++];
            }
        };
    }
}
