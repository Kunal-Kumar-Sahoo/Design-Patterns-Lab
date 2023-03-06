package Organization;

public class Developer implements Employee {
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {} // Empty function

    @Override
    public Employee getChild(int i) {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    @Override
    public void remove(Employee employee) {} // Empty function
}