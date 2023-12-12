package org.example;

public class Car extends Vehicle{
    private int numDoors;
    private int numPassengers;
    private boolean isConvertible;

    public Car() {
    }

    public Car(int numDoors, int numPassengers, boolean isConvertible) {
        this.numDoors = numDoors;
        this.numPassengers = numPassengers;
        this.isConvertible = isConvertible;
    }

    public Car(String make, String model, int year, String color, double price, int numDoors, int numPassengers, boolean isConvertible) {
        super(make, model, year, color, price);
        this.numDoors = numDoors;
        this.numPassengers = numPassengers;
        this.isConvertible = isConvertible;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
}
