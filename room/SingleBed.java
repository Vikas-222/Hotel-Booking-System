package com.company.room;

public class SingleBed extends Rooms {

    private SingleBed(Builder builder) {
        super(builder);
    }


    //builder
    public static class SingleBedBuilder extends Rooms.Builder<SingleBedBuilder> {

        public SingleBed build() {
            return new SingleBed(this);
        }

        @Override
        protected SingleBedBuilder self() {
            return this;
        }
    }

}
