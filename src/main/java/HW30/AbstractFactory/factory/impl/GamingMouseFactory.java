package HW30.AbstractFactory.factory.impl;

import HW30.AbstractFactory.factory.MouseFactory;
import HW30.AbstractFactory.model.Engine;
import HW30.AbstractFactory.model.Material;
import HW30.AbstractFactory.model.Options;
import HW30.AbstractFactory.model.impl.GamingEngine;
import HW30.AbstractFactory.model.impl.GamingMaterial;
import HW30.AbstractFactory.model.impl.GamingOptions;

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
