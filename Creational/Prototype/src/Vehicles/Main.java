package Vehicles;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle a = new Vehicle();
        a.addVehicles();
        Vehicle b = (Vehicle) a.clone();
        System.out.println("A: " + a.getVehicleList());
        System.out.println("B: " + b.getVehicleList());
        b.insertVehicle("R8");
        b.removeVehicle("Swift");
        System.out.println("A: " + a.getVehicleList());
        System.out.println("B: " + b.getVehicleList());
        System.out.println(b.modify());
    }
}
