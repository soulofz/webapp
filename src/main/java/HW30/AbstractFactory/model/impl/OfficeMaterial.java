package HW30.AbstractFactory.model.impl;

import HW30.AbstractFactory.model.Material;

public class OfficeMaterial implements Material {
    @Override
    public String getMaterial() {
        return "Plastic.";
    }

    @Override
    public String getColor() {
        return "White.";
    }
}
