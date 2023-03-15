package LaptopPorts;

public class Dongle implements Ports {
    AdvancedMounting advancedMounting;

    public Dongle(String portType) {
        if(portType.equalsIgnoreCase("usb-b"))
            advancedMounting = new TypeBDongle();
        else if(portType.equalsIgnoreCase("rj45"))
            advancedMounting = new TypeRJ45Dongle();
    }

    @Override
    public void mount(String portType, String driveName) {
        if(portType.equalsIgnoreCase("usb-b"))
            advancedMounting.mount_b_type(driveName);
        else if(portType.equalsIgnoreCase("rj45"))
            advancedMounting.mount_RJ45(driveName);
    }
}
