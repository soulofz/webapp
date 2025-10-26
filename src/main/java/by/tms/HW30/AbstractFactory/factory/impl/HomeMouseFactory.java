package by.tms.HW30.AbstractFactory.factory.impl;

import by.tms.HW30.AbstractFactory.factory.MouseFactory;
import by.tms.HW30.AbstractFactory.model.Engine;
import by.tms.HW30.AbstractFactory.model.Material;
import by.tms.HW30.AbstractFactory.model.Options;
import by.tms.HW30.AbstractFactory.model.impl.HomeEngine;
import by.tms.HW30.AbstractFactory.model.impl.HomeMaterial;
import by.tms.HW30.AbstractFactory.model.impl.HomeOptions;

public class HomeMouseFactory implements MouseFactory {
    @Override
    public Engine createEngine() {
        return new HomeEngine();
    }

    @Override
    public Material createMaterial() {
        return new HomeMaterial();
    }

    @Override
    public Options createOptions() {
        return new HomeOptions();
    }

    @Override
    public String getFactoryName() {
        return "HomeMouseFactory";
    }
}
