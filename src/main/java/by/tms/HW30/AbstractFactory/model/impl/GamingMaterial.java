package by.tms.HW30.AbstractFactory.model.impl;

import by.tms.HW30.AbstractFactory.model.Material;

public class GamingMaterial implements Material {
    @Override
    public String getMaterial() {
        return "Magnesium alloy.";
    }

    @Override
    public String getColor() {
        return "Pink.";
    }
}
