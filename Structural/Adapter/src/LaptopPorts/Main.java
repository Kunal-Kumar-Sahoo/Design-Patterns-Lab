package LaptopPorts;

public class Main {
    public static void main(String[] args) {
        LaptopIO laptopIO = new LaptopIO();

        laptopIO.read("usb-a", "D:/");
        laptopIO.read("usb-b", "E:/");
        laptopIO.read("usb-c", "F:/");
        laptopIO.read("RJ45", "RasPi");
        laptopIO.read("sata", "hdd");
    }
}
