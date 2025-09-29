package HW30.AbstractFactory.model.impl;

import HW30.AbstractFactory.model.Engine;

public class GamingEngine implements Engine {
    @Override
    public void click() {
        System.out.println("Gaming mouse doesn't double click.");
    }

    @Override
    public String getTypeOfConnection() {
        return "Wireless";
    }
}
