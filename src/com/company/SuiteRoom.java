package com.company;

public class SuiteRoom extends Rooms {

    private float gymCharge = 500.0f;
    private float swimmingPoolCharge = 1000.0f;

    public SuiteRoom(String roomNumber, float price, int capacity, float serviceCharge,boolean status,String roomType) {
        super(roomNumber, price, capacity, serviceCharge,status,roomType);
    }

    public float getGymCharge() {
        return gymCharge;
    }

    public void setGymCharge(float gymCharge) {
        this.gymCharge = gymCharge;
    }

    public float getSwimmingPoolCharge() {
        return swimmingPoolCharge;
    }

    public void setSwimmingPoolCharge(float swimmingPoolCharge) {
        this.swimmingPoolCharge = swimmingPoolCharge;
    }

    @Override
    public double calculateTotal() {
        return (getRoomPrice() + getServiceCharge() + getGymCharge() + getSwimmingPoolCharge()) * getGst();
    }
}
