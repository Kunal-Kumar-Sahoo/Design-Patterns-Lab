package Gadgets;

public class Dell extends Device {
    private String ramsize, processor, gpu;
    public Dell(String ramsize, String processor, String gpu) {
        this.ramsize = ramsize;
        this.processor = processor;
        this.gpu = gpu;
    }

    @Override
    public String getDetails() {
        return "Dell configuration: \n\tRAM: " + this.ramsize + "\n\tProcessor: " + this.processor +
                "\n\tGPU: " + this.gpu;
    }
}
