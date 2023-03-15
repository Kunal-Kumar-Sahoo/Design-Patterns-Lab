package LaptopPorts;

public class TypeBDongle implements AdvancedMounting {
    @Override
    public void mount_b_type(String driveName) {
        System.out.println("Mounting " + driveName + " with USB Type B port");
    }

    @Override
    public void mount_RJ45(String driveName) {}
}
