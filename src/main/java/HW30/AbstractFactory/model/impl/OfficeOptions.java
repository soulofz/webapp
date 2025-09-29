package HW30.AbstractFactory.model.impl;

import HW30.AbstractFactory.model.Options;

public class OfficeOptions implements Options {
    @Override
    public int getButtons() {
        return 2;
    }

    @Override
    public int getDPI() {
        return 400;
    }
}
