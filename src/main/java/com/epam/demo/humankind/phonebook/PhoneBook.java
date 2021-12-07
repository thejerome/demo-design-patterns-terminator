package com.epam.demo.humankind.phonebook;

import com.epam.demo.humankind.Human;
import com.epam.demo.humankind.SimpleHuman;

public interface PhoneBook {
    boolean hasNextHuman();
    SimpleHuman nextHuman();
}
