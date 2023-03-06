package Gadgets;

public class Nokia extends Device {
    private String ram, processor;

    public Nokia(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    public String getDetails() {
        return "Nokia configuration: \n\tRAM: " + this.ram + "\n\tProcessor: " + this.processor;
    }
}
