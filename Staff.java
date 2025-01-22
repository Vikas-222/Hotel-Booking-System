package com.company;

import java.util.List;

public class Staff extends Users {

    private int discounts;
    private List<Rooms> room;

    public Staff(int userid, String username, String email, int contact, String role, String gender) {
        super(userid, username, email, contact, role, gender);
    }

    public int getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int discounts) {
        this.discounts = discounts;
    }

    public void allRooms() {
        for (Rooms rooms : room) {
            System.out.println(rooms);
        }
    }

    @Override
    public String userRole() {
        return "Staff";
    }

}
