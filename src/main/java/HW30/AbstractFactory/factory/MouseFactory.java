package HW30.AbstractFactory.factory;

import HW30.AbstractFactory.model.Engine;
import HW30.AbstractFactory.model.Material;
import HW30.AbstractFactory.model.Options;

public interface MouseFactory {
    Engine createEngine();
    Material createMaterial();
    Options createOptions();
    String getFactoryName();
}
