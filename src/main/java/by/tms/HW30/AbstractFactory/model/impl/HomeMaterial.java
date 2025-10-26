package by.tms.HW30.AbstractFactory.model.impl;

import by.tms.HW30.AbstractFactory.model.Material;

public class HomeMaterial implements Material {
    @Override
    public String getMaterial() {
        return "Plastic with metal.";
    }

    @Override
    public String getColor() {
        return "Black";
    }
}
