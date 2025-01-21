package com.company;

public class DoubleBed extends Rooms {

    private float gymCharge = 500.0f;

    public DoubleBed(String roomNumber, float price, int capacity, float serviceCharge, boolean status, String roomType) {
        super(roomNumber, price, capacity, serviceCharge, status, roomType);
    }

    public float getGymCharge() {
        return gymCharge;
    }

    public void setGymCharge(float gymCharge) {
        this.gymCharge = gymCharge;
    }

    @Override
    public double calculateTotal() {
        return (getRoomPrice() + getServiceCharge() + getGymCharge()) * getGst();
    }
}
