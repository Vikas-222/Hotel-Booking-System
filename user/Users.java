package com.company.user;

import com.company.room.Rooms;

import java.util.Objects;

public abstract class Users {

    private int userid;
    private String username;
    private String email;
    private int contact;
    private String role;
    private String gender;

    public Users(UserBuilder<?> builder) {
        this.userid = builder.userid;
        this.username = builder.username;
        this.email = builder.email;
        this.contact = builder.contact;
        this.role = builder.role;
        this.gender = builder.gender;
    }

    public int getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }

    public abstract String userRole();

    public static abstract class UserBuilder<T extends Users.UserBuilder<T>> {

        private int userid;
        private String username;
        private String email;
        private int contact;
        private String role;
        private String gender;

        public T setUserid(int userid) {
            this.userid = userid;
            return self();
        }

        public T setUsername(String username) {
            this.username = username;
            return self();
        }

        public T setRole(String role) {
            this.role = role;
            return self();
        }

        public T setGender(String gender) {
            this.gender = gender;
            return self();
        }

        public T setEmail(String email) {
            this.email = email;
            return self();
        }

        public T setContact(int contact) {
            this.contact = contact;
            return self();
        }

//        public abstract String userRole();

        public abstract T self();

        public abstract Users build();
    }

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
