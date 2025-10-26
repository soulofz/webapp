package by.tms.HW30.AbstractFactory.factory.impl;

import by.tms.HW30.AbstractFactory.factory.MouseFactory;
import by.tms.HW30.AbstractFactory.model.Engine;
import by.tms.HW30.AbstractFactory.model.Material;
import by.tms.HW30.AbstractFactory.model.Options;
import by.tms.HW30.AbstractFactory.model.impl.OfficeEngine;
import by.tms.HW30.AbstractFactory.model.impl.OfficeMaterial;
import by.tms.HW30.AbstractFactory.model.impl.OfficeOptions;

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
