package by.tms.HW30.AbstractFactory.factory;

import by.tms.HW30.AbstractFactory.model.Engine;
import by.tms.HW30.AbstractFactory.model.Material;
import by.tms.HW30.AbstractFactory.model.Options;

public interface MouseFactory {
    Engine createEngine();
    Material createMaterial();
    Options createOptions();
    String getFactoryName();
}
