package LaptopPorts;

public class LaptopIO {
    Dongle dongle;

    public void read(String portType, String driveName) {
        if(portType.equalsIgnoreCase("usb-a"))
            System.out.println("Mounting " + driveName + " with USB Type B port");

        else if(portType.equalsIgnoreCase("usb-b")) {
            dongle = new Dongle(portType);
            dongle.mount(portType, driveName);
        }

        else if(portType.equalsIgnoreCase("usb-c"))
            System.out.println("Mounting " + driveName + " with USB Type C port");

        else if(portType.equalsIgnoreCase("rj45")) {
            dongle = new Dongle(portType);
            dongle.mount(portType, driveName);
        }

        else
            System.out.println("Unrecognized port " + portType);

    }
}
