package by.tms.HW30.AbstractFactory.model.impl;

import by.tms.HW30.AbstractFactory.model.Options;

public class GamingOptions implements Options {
    @Override
    public int getButtons() {
        return 4;
    }

    @Override
    public int getDPI() {
        return 30000;
    }
}
