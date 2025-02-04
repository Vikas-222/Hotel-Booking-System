package com.company.user;

import com.company.room.Rooms;

import java.util.List;

public class Staff extends Users {

    private int discounts;
    private List<Rooms> room;

    public Staff(UserBuilder builder) {
        super(builder);
    }

    public int getDiscounts() {
        return discounts;
    }

    public void allRooms() {
        for (Rooms rooms : room) {
            System.out.println(rooms);
        }
    }


    public static class StaffBuilder extends Users.UserBuilder<StaffBuilder> {

        private int discounts;

        @Override
        public StaffBuilder self() {
            return this;
        }

        @Override
        public Staff build() {
            return new Staff(this);
        }

        public StaffBuilder setDiscounts(int discounts) {
            this.discounts = discounts;
            return self();
        }
    }

    @Override
    public String userRole() {
        return "Staff";
    }

}
