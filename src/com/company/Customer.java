package com.company;


public class Customer extends Users {

    public Customer(int userid, String username, String email, int contact, String role, String gender) {
        super(userid, username, email, contact, role, gender);
    }

    @Override
    public String userRole() {
        return "Customer";
    }




}