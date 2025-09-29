package HW30.FactoryMethod.model.impl;

import HW30.FactoryMethod.model.Device;

public class AmateurMonitor implements Device {
    @Override
    public void info() {
        System.out.println("My monitor is 240 hertz.");
    }
}
