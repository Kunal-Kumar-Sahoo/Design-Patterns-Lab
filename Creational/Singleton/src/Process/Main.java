package Process;

public class Main {
    public static void main(String[] args) {
        CPU cpu = CPU.getCPU();
        cpu.addProcess(1234);
        cpu.addProcess(5678);
        cpu.addProcess(9012);
        cpu.addProcess(3456);
        cpu.addProcess(7890);
        System.out.println(cpu.waiting());
        System.out.println(cpu.execute());
        System.out.println(cpu.execute());
        System.out.println(cpu.waiting());
    }
}
