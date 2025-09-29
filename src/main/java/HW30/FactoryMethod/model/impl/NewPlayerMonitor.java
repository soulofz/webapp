package HW30.FactoryMethod.model.impl;

import HW30.FactoryMethod.model.Device;

public class NewPlayerMonitor implements Device {
    @Override
    public void info() {
        System.out.println("My monitor is 60 hertz.");
    }
}
