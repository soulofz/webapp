package by.tms.HW30.AbstractFactory.model.impl;

import by.tms.HW30.AbstractFactory.model.Engine;

public class HomeEngine implements Engine {

    @Override
    public void click() {
        System.out.println("Mouse at home double clicks after few years of work.");
    }

    @Override
    public String getTypeOfConnection() {
        return "USB-C";
    }
}
