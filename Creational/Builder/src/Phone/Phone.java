package Phone;

public class Phone {
    private String OS, processor;
    private int RAM, battery;
    private float screensize;

    public Phone(String OS, int RAM, String processor, float screensize, int battery) {
        this.OS = OS;
        this.processor = processor;
        this.screensize = screensize;
        this.RAM = RAM;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "OS: " + this.OS + "\nRAM: " + this.RAM + "\nProcessor: " + this.processor + "\nScreen-size: " + this.screensize
                + "\nBattery: " + this.battery;
    }
}
