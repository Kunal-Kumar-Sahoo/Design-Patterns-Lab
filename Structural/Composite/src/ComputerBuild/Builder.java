package ComputerBuild;

import java.util.ArrayList;

public class Builder {
    public static void main(String[] args) {
        Component monitor = new Leaf("Monitor", 5000);
        Component mouse = new Leaf("Mouse", 200);
        Component keyboard = new Leaf("Keyboard", 300);
        Component cpu = new Leaf("CPU", 10000);
        Component ram = new Leaf("RAM", 8000);
        Component harddrive = new Leaf("Hard Drive", 2000);

        Composite cabinet = new Composite("Cabinet");
        Composite motherboard = new Composite("Motherboard");
        Composite peripherals = new Composite("Peripherals");

        Composite computer = new Composite("Computer");

        computer.addComponent(new Component[] {cabinet, peripherals});
        peripherals.addComponent(new Component[] {monitor, mouse, keyboard});
        cabinet.addComponent(new Component[] {harddrive, motherboard});
        motherboard.addComponent(new Component[] {cpu, ram});

        computer.showPrice();
    }
}
