package by.tms.HW30.FactoryMethod.model.impl;

import by.tms.HW30.FactoryMethod.model.Device;

public class ProMonitor implements Device {
    @Override
    public void info() {
        System.out.println("My monitor is 500 hertz.");
    }
}
