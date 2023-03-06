package Gadgets;

public abstract class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case LAPTOPFACTORY: return new LaptopFactory();
            case MOBILEFACTORY: return new MobileFactory();
        }
        return null;
    }
}
