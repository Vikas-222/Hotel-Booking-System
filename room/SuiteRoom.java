package com.company.room;

import com.company.room.Rooms;

import java.util.Iterator;

public class SuiteRoom extends Rooms {

    private float gymCharge = 500.0f;
    private float swimmingPoolCharge = 1000.0f;

    public SuiteRoom(Builder builder) {
        super(builder);
    }

    public float getGymCharge() {
        return gymCharge;
    }


    public float getSwimmingPoolCharge() {
        return swimmingPoolCharge;
    }


    @Override
    public float calculateTotal() {
        float amt = (getRoomPrice() + getServiceCharge() + getGymCharge() + getSwimmingPoolCharge());
        float gstamt = (float) (amt * 0.15);
        return amt + gstamt;
    }

    public static class SuiteRoomBuilder extends Rooms.Builder<SuiteRoom.SuiteRoomBuilder> {

        private float gymCharge;
        private float swimmingPoolCharge;

        @Override
        public SuiteRoom build() {
            return new SuiteRoom(this);
        }

        @Override
        protected SuiteRoomBuilder self() {
            return this;
        }


        public void setGymCharge(float gymCharge) {
            this.gymCharge = gymCharge;
        }

        public void setSwimmingPoolCharge(float swimmingPoolCharge) {
            this.swimmingPoolCharge = swimmingPoolCharge;
        }

    }
}
