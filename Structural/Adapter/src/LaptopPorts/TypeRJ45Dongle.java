package LaptopPorts;

public class TypeRJ45Dongle implements AdvancedMounting {
    @Override
    public void mount_b_type(String driveName) {}

    @Override
    public void mount_RJ45(String driveName) {
        System.out.println("Mounting drive " + driveName + " with RJ45 port");
    }
}
