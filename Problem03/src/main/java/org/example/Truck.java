package org.example;

public class Truck extends Vehicle{
    private int bedLength;
    private double payloadCapacity;

    public Truck() {
    }

    public Truck(int bedLength, double payloadCapacity) {
        this.bedLength = bedLength;
        this.payloadCapacity = payloadCapacity;
    }

    public Truck(String make, String model, int year, String color, double price, int bedLength, double payloadCapacity) {
        super(make, model, year, color, price);
        this.bedLength = bedLength;
        this.payloadCapacity = payloadCapacity;
    }

    public int getBedLength() {
        return bedLength;
    }

    public void setBedLength(int bedLength) {
        this.bedLength = bedLength;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }
}
