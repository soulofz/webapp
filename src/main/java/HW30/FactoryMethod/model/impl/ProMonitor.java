package HW30.FactoryMethod.model.impl;

import HW30.FactoryMethod.model.Device;

public class ProMonitor implements Device {
    @Override
    public void info() {
        System.out.println("My monitor is 500 hertz.");
    }
}
