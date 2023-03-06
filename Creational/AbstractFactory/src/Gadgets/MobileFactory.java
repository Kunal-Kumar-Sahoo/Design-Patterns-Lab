package Gadgets;

public class MobileFactory extends AbstractDeviceFactory {
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case NOKIA: return new Nokia("8gb", "Qualcom");
            case ONEPLUS: return new OnePlus("12gb", "Mediatek");
        }
        return null;
    }
}

