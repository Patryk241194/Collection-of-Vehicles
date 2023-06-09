package com.vehicles;

abstract class Vehicle {

    private String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }

    abstract void vehicleType();

    abstract void startEngine();

    abstract void stopEngine();


}