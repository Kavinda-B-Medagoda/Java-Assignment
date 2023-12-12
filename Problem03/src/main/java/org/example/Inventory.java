package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventory {
    private Vehicle vehicles[] = new Vehicle[6];

    public Inventory(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
    public Inventory() {
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public double getAveragePrice(){
       if (vehicles.length == 0){
           return 0;
       }

       double sum = 0;
       for (Vehicle num: vehicles){
           return sum += num.getPrice();
       }

       return sum/vehicles.length;
    }

    public Vehicle[] searchMakeAndModel(String make, String model) {
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        for (Vehicle obj : vehicles) {
            if (obj.getMake().equals(make) && obj.getModel().equals(model)) {
                vehicleArrayList.add(obj);
            }
        }

        return vehicleArrayList.toArray(new Vehicle[0]);
    }

}
