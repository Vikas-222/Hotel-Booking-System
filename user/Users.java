package com.company.user;

import java.util.Objects;

public abstract class Users {

    private int userid;
    private String username;
    private String email;
    private int contact;
    private String role;
    private String gender;

    public Users(int userid, String username, String email, int contact, String role, String gender) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.role = role;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract String userRole();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userid == users.userid && email.equals(users.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, email);
    }

    @Override
    public String toString() {
        return "userid=" + userid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                ", role='" + role + '\'' +
                ", gender='" + gender;

    }
}
