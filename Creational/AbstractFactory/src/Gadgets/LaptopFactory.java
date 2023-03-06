package Gadgets;

public class LaptopFactory extends AbstractDeviceFactory {
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case HP: return new HP("8gb", "Intel", "NVIDIA");
            case DELL: return new Dell("12gb", "AMD", "NVIDIA");
        }

        return null;
    }
}
