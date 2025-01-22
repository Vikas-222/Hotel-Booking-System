package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hotel {
    private String hotelName;
    private String hotelAddress;
    private Set<Rooms> room;
    private String features;
    private Set<Customer> customer;


    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        room = new HashSet<>();
        customer = new HashSet<>();
    }

    public String getHotelName() {
        return hotelName;
    }

    public Set<Rooms> getRoom() {
        return room;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void addRoom(Rooms room) {
        this.room.add(room);
    }

    public void addCustomer(Customer c) {
        this.customer.add(c);
    }

    public boolean removeRoom(Rooms room) {
        return true;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public void allRooms() {
        for (Rooms rooms : room) {
            System.out.println(rooms);
        }
    }

    public void customerDetails() {
        for (Customer c : customer) {
            System.out.println(c);
        }
    }

}
