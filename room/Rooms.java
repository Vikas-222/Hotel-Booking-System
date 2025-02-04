package com.company.room;

public abstract class Rooms {

    private String roomNumber;
    private float roomPrice;
    private int capacity;
    private float gst = 0.15f;
    private float serviceCharge;
    private boolean roomStatus;
    private String roomType;

    public Rooms(Builder<?> builder) {
        this.roomNumber = builder.roomNumber;
        this.roomPrice = builder.price;
        this.capacity = builder.capacity;
        this.serviceCharge = builder.serviceCharge;
        this.roomStatus = builder.roomStatus;
        this.roomType = builder.roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public float getRoomPrice() {
        return roomPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public float getGst() {
        return gst;
    }

    public float getServiceCharge() {
        return serviceCharge;
    }

    public float calculateTotal() {
        float gstamt = (getRoomPrice() + getServiceCharge()) * getGst();
        return (getRoomPrice() + getServiceCharge()) + gstamt;
    }

    public boolean getRoomStatus() {
        return roomStatus;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomStatus(boolean b) {
        this.roomStatus = b;
    }


    public static abstract class Builder<T extends Builder<T>> {

        private float price;
        private String roomNumber;
        private int capacity;
        private float gst = 0.15f;
        private float serviceCharge;
        private boolean roomStatus;
        private String roomType;


        public T setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
            return self();
        }

        public T setRoomPrice(float price) {
            this.price = price;
            return self();
        }

        public T setCapacity(int capacity) {
            this.capacity = capacity;
            return self();
        }

        public T setGst(float gst) {
            this.gst = gst;
            return self();
        }

        public T setServiceCharge(float serviceCharge) {
            this.serviceCharge = serviceCharge;
            return self();
        }

        public T setRoomType(String roomType) {
            this.roomType = roomType;
            return self();
        }

        public T setRoomStatus(boolean roomStatus) {
            this.roomStatus = roomStatus;
            return self();
        }

        public abstract Rooms build();
        protected abstract T self();
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
