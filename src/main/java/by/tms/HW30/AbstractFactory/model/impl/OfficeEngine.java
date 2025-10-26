package by.tms.HW30.AbstractFactory.model.impl;

import by.tms.HW30.AbstractFactory.model.Engine;

public class OfficeEngine implements Engine {
    @Override
    public void click() {
        System.out.println("Office mouse double clicks sometimes.");
    }

    @Override
    public String getTypeOfConnection() {
        return "USB-A";
    }
}
