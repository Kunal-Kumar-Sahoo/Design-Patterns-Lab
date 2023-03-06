package Vehicles;

import java.util.ArrayList;

public class Vehicle {
    private ArrayList<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<String>();
    }

    public Vehicle(ArrayList<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Vehicle clone() {
        return new Vehicle(
                new ArrayList<String>(this.vehicleList)
        );
    }

    public ArrayList<String> getVehicleList() {
        return this.vehicleList;
    }

    public void addVehicles() {
        this.vehicleList.add("Swift");
        this.vehicleList.add("Ciaz");
        this.vehicleList.add("Veyron");
        this.vehicleList.add("Avantador");
    }

    public void insertVehicle(String vehicle) {
        this.vehicleList.add(vehicle);
    }

    public void removeVehicle(String car) {
        this.vehicleList.remove(car);
    }

    public String modify() {
        return this.vehicleList.get(0);
    }

}
