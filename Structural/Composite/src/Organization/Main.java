package Organization;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Developer("ABC", 100_000);
        Employee employee2 = new Developer("DEF", 150_000);
        Employee manager1 = new Manager("GHI", 200_000);
        manager1.add(employee1);
        manager1.add(employee2);
        Employee employee3 = new Developer("JKL", 150_000);
        Manager generalManager = new Manager("MNO", 500_000);
        generalManager.add(employee3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
