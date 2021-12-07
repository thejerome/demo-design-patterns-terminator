package com.epam.demo.terminator;

import com.epam.demo.humankind.Human;
import com.epam.demo.humankind.Humankind;
import com.epam.demo.humankind.Neighbor;
import com.epam.demo.humankind.SarahConnorIsBackFromWorkObserver;
import com.epam.demo.humankind.SimpleHuman;
import com.epam.demo.humankind.phonebook.PhoneBook;

public class T800 implements TerminatorHuntingSarahConnor {

    private Humankind humankind;

    public T800(final Humankind humankind) {
        this.humankind = humankind;
    }

    @Override
    public void huntHumans() {
        findSarahConnor();
    }

    @Override
    public void findSarahConnor() {
        PhoneBook phoneBook = humankind.getPhoneBook();
        while (phoneBook.hasNextHuman()){
            SimpleHuman human = phoneBook.nextHuman();
            if (human.getName().equals("Sarah Connor")){
                System.out.println("Found " + human);
                if (human.isOnWork()){
                    Neighbor neighbor = new Neighbor("vasya");
                    neighbor.addSarahConnorIsBackFromWorkObserver(new SarahConnorIsBackFromWorkObserver() {
                        @Override
                        public void onSarahConnorIsBackFromWork() {
                            System.out.println(this + " shoots!");
                        }
                    });

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    neighbor.fireSarahConnorIsBackFromWorkEvent();
                } else {
                    System.out.println(this + " shoots!");
                }
                break;
            } else {
                System.out.println(human + " is not related");
            }
        }
    }
}
