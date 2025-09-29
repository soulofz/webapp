package HW30.AbstractFactory.factory.impl;

import HW30.AbstractFactory.factory.MouseFactory;
import HW30.AbstractFactory.model.Engine;
import HW30.AbstractFactory.model.Material;
import HW30.AbstractFactory.model.Options;
import HW30.AbstractFactory.model.impl.HomeEngine;
import HW30.AbstractFactory.model.impl.HomeMaterial;
import HW30.AbstractFactory.model.impl.HomeOptions;

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
