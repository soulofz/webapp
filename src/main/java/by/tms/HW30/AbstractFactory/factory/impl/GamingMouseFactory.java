package by.tms.HW30.AbstractFactory.factory.impl;

import by.tms.HW30.AbstractFactory.factory.MouseFactory;
import by.tms.HW30.AbstractFactory.model.Engine;
import by.tms.HW30.AbstractFactory.model.Material;
import by.tms.HW30.AbstractFactory.model.Options;
import by.tms.HW30.AbstractFactory.model.impl.GamingEngine;
import by.tms.HW30.AbstractFactory.model.impl.GamingMaterial;
import by.tms.HW30.AbstractFactory.model.impl.GamingOptions;

public class GamingMouseFactory implements MouseFactory {
    @Override
    public Engine createEngine() {
        return new GamingEngine();
    }

    @Override
    public Material createMaterial() {
        return new GamingMaterial();
    }

    @Override
    public Options createOptions() {
        return new GamingOptions();
    }

    @Override
    public String getFactoryName() {
        return "GamingMouseFactory";
    }
}
