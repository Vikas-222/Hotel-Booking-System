package com.company.room;

public abstract class Rooms {
    private String roomNumber;
    private float roomPrice;
    private int capacity;
    private float gst = 0.15f;
    private float serviceCharge;
    private boolean roomStatus;
    private String roomType;

    public Rooms(String roomNumber, float price, int capacity, float serviceCharge, boolean status, String roomType) {
        this.roomNumber = roomNumber;
        this.roomPrice = price;
        this.capacity = capacity;
        this.serviceCharge = serviceCharge;
        this.roomStatus = status;
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public float getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(float price) {
        this.roomPrice = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getGst() {
        return gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }

    public float getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(float serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public float calculateTotal() {
        float gstamt = (getRoomPrice() + getServiceCharge()) * getGst();
        return (getRoomPrice() + getServiceCharge()) + gstamt;
    }

    public boolean getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    @Override
    public String toString() {
        return "roomNumber='" + roomNumber + '\'' +
                ", roomPrice=" + roomPrice +
                ", capacity=" + capacity +
                ", gst=" + gst +
                ", serviceCharge=" + serviceCharge +
                ", roomStatus=" + (getRoomStatus() ? "Available" : "Not available") +
                ", roomType='" + roomType +
                ",Total Cost='" + calculateTotal();
    }
}
