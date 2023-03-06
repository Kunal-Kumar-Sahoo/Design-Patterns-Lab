package Gadgets;

public class OnePlus extends Device {
    private String ram, processor;

    public OnePlus(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    public String getDetails() {
        return "OnePlus configuration: \n\tRAM: " + this.ram + "\n\tProcessor: " + this.processor;
    }
}
