package HW30.AbstractFactory.model.impl;

import HW30.AbstractFactory.model.Options;

public class HomeOptions implements Options {
    @Override
    public int getButtons() {
        return 3;
    }

    @Override
    public int getDPI() {
        return 8000;
    }
}
