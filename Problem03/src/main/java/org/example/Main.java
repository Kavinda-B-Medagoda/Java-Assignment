package org.example;

public class Main {
    public static void main(String[] args) {

        Truck truck1 = new Truck("Ford", "Civic", 2022, "Blue", 35000.0, 6, 1500.0);
        Truck truck2 = new Truck("Chevrolet", "Silverado", 2021, "Red", 38000.0, 5, 1800.0);
        Truck truck3 = new Truck("Toyota", "Tundra", 2023, "Black", 40000.0, 6, 1600.0);
        Car car1 = new Car("Toyota", "Camry", 2022, "Silver", 25000.0, 4, 5, false);
        Car car2 = new Car("Honda", "Civic", 2021, "Blue", 22000.0, 4, 5, true);
        Car car3 = new Car("Ford", "Civic", 2023, "Red", 35000.0, 2, 2, true);

        Vehicle array[] = new Vehicle[6];
        array[0] = truck1;
        array[1] = truck2;
        array[2] = truck3;
        array[3] = car1;
        array[4] = car2;
        array[5] = car3;

        Inventory inventory = new Inventory();
        inventory.setVehicles(array);

        System.out.println("average price of vehicles are: " + inventory.getAveragePrice());

        Vehicle[] array1 = new Vehicle[inventory.searchMakeAndModel("Ford", "Civic").length];
        array1 = inventory.searchMakeAndModel("Ford", "Civic");
        System.out.println("vehicles make Ford and model Civic are: " );
        for (Vehicle obj: array1){
            System.out.println(obj);
        }
    }
}