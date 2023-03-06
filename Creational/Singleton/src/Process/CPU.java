package Process;

import java.util.ArrayList;

public class CPU {
    private static CPU cpu = new CPU();
    public ArrayList<Integer> process_queue = new ArrayList<Integer>();

    private CPU() {
        System.out.println("CPU created");
    }

    public static CPU getCPU() {
        return cpu;
    }

    public void addProcess(int pid) {
        process_queue.add(pid);
    }

    public int execute() {
        return process_queue.remove(0);
    }

    public ArrayList<Integer> waiting() {
        ArrayList<Integer> waiting_queue = new ArrayList<Integer>();
        for(int i = 1; i < process_queue.size(); ++i)
            waiting_queue.add(process_queue.get(i));
        return waiting_queue;
    }
}
