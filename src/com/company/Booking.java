package com.company;

import java.util.*;

public class Booking {

    private Customer customer;
    private Set<Rooms> room;
    private Hotel hotel;
    private Date from;
    private Date to;
    private List<Rooms> availableRoom;

    public Booking(Customer customer, Hotel hotel) {
        this.customer = customer;
        room = new HashSet<>();
        this.hotel = hotel;
        availableRoom = new ArrayList<>();

    }

    public Date getFrom() {
        return from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public void displayAvailableRooms() {
        for (Rooms room : hotel.getRoom()) {
            if (room.getRoomStatus()) {
                System.out.println(room);
                availableRoom.add(room);
            }
        }
    }

    public void bookRoom(Date from, Date to, int guest) {
        if (from.after(to) && to.before(from)) {
            System.out.println("Please select valid dates");
        } else {
            // generating the index using Math.random()
            int index = (int) (Math.random() * availableRoom.size());
            if (availableRoom.get(index).getCapacity() < guest) {
                bookRoom(from, to, guest);
            } else {
                System.out.println("Your Room Number is: "
                        + availableRoom.get(index));
                availableRoom.get(index).setRoomStatus(false);
            }
        }
    }

    @Override
    public String toString() {
        return "customer=" + customer +
                ", room=" + room +
                ", hotel=" + hotel +
                ", from=" + from +
                ", to=" + to;
    }
}


