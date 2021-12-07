package com.epam.demo.humankind;

public class SimpleHuman implements Human{

    private String name;
    private boolean isOnWork = false;

    public SimpleHuman(final String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " goes to work");
        isOnWork = true;
    }

    public boolean isOnWork() {
        return isOnWork;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SimpleHuman{" +
                "name='" + name + '\'' +
                '}';
    }
}
