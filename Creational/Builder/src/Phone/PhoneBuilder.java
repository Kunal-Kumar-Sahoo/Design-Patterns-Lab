package Phone;

public class PhoneBuilder {
    private String OS, processor;
    private int RAM, battery;
    private float screensize;

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setScreensize(float screensize) {
        this.screensize = screensize;
        return this;
    }

    public Phone getPhone() {
        return new Phone(this.OS, this.RAM, this.processor, this.screensize, this.battery);
    }
}
