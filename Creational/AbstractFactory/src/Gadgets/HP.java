package Gadgets;

public class HP extends Device {
    private String ramsize, processor, gpu;
    public HP(String ramsize, String processor, String gpu) {
        this.ramsize = ramsize;
        this.processor = processor;
        this.gpu = gpu;
    }

    @Override
    public String getDetails() {
        return "HP configuration: \n\tRAM: " + this.ramsize + "\n\tProcessor: " + this.processor +
                "\n\tGPU: " + this.gpu;
    }
}
