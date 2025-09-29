package HW30.AbstractFactory.factory.impl;

import HW30.AbstractFactory.factory.MouseFactory;
import HW30.AbstractFactory.model.Engine;
import HW30.AbstractFactory.model.Material;
import HW30.AbstractFactory.model.Options;
import HW30.AbstractFactory.model.impl.OfficeEngine;
import HW30.AbstractFactory.model.impl.OfficeMaterial;
import HW30.AbstractFactory.model.impl.OfficeOptions;

public class OfficeMouseFactory implements MouseFactory {
    @Override
    public Engine createEngine() {
        return new OfficeEngine();
    }

    @Override
    public Material createMaterial() {
        return new OfficeMaterial();
    }

    @Override
    public Options createOptions() {
        return new OfficeOptions();
    }

    @Override
    public String getFactoryName() {
        return "OfficeMouseFactory";
    }
}
