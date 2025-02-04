package com.company.user;


public class Customer extends Users {

    public Customer(UserBuilder builder) {
        super(builder);
    }

    public static class CustomerBuilder extends Users.UserBuilder<CustomerBuilder> {


        @Override
        public CustomerBuilder self() {
            return this;
        }

        @Override
        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public String userRole() {
        return "Customer";
    }




}