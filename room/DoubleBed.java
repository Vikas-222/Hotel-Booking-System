package com.company.room;

import com.company.room.Rooms;

public class DoubleBed extends Rooms {

    private float gymCharge = 500.0f;

    public DoubleBed(Builder builder) {
        super(builder);
    }

    public float getGymCharge() {
        return gymCharge;
    }




    //Builder
    public static class DoubleBedBuilder extends Rooms.Builder<DoubleBed.DoubleBedBuilder> {

        private float gymCharge = 500.0f;

        public DoubleBed build() {
            return new DoubleBed(this);
        }

        @Override
        protected DoubleBedBuilder self() {
            return this;
        }

        public DoubleBedBuilder setGymCharge(float gymCharge) {
            this.gymCharge = gymCharge;
            return self();
        }
    }

    @Override
    public float calculateTotal() {
        float amt = (getRoomPrice() + getServiceCharge() + getGymCharge());
        float gstamt = (amt * getGst());
        return amt + gstamt;
    }

}
