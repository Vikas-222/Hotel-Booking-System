package com.company.main;

import com.company.*;
import com.company.room.DoubleBed;
import com.company.room.Rooms;
import com.company.room.SingleBed;
import com.company.room.SuiteRoom;
import com.company.user.Customer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class OneGuestOnly {

    public static void main(String[] args) {

        //1. Hotel setup
        //2. Add Rooms in hotel
        //3. Add one Customer in hotel
        //4. Customer request for booking..means find operation (from date, end date, no of guest)
        //5. System checks and display available rooms for provided dates along with total price
        //6. Create a logic to select available room from 5th step. and confirm the booking

        //1. Hotel setup
        //2. Add Rooms in hotel
        //3. Add two Customer (C1 and C2) in hotel
        //4. C1 Customer request for booking..means find operation (from date, end date, no of guest)
        //5. System checks and display available rooms for provided dates along with total price
        //6. Create a logic to select available room from 5th step. and confirm the booking
        //7. C2 request for booking for same date which c1 has booked
        //8. System checks and display available rooms for provided dates along with total price
        //9. Create a logic to select available room from 5th step. and confirm the booking

        //1. Hotel setup
        //2. Add Rooms in hotel
        //3. Add two Customer (C1 and C2) in hotel
        //4. C1 Customer request for booking..means find operation (from date, end date, no of guest)
        //5. System checks and display available rooms for provided dates along with total price
        //6. Create a logic to select available room from 5th step. and confirm the booking
        //7. C2 request for booking for any date
        //8. System checks and display available rooms for provided dates along with total price
        //9. Create a logic to select available room from 5th step. and confirm the booking


        Hotel myHotel = new Hotel("Taj Hotel");
        myHotel.setHotelAddress("278/A/2, lal darwaja, station road Surat. Gujarat 395003");
        myHotel.setFeatures("Free Cancellation" + "\n\t" + "Book without advance payment" + "\n\t" + "Breakfast available at extra charges" +
                "\n\t" + "Property with stylish rooms ");


        System.out.println("---------------------------------");
        System.out.println("Hotel name : " + myHotel.getHotelName());
        System.out.println("Address : " + myHotel.getHotelAddress());
        System.out.println("");
        System.out.println("Features : " + myHotel.getFeatures());
        System.out.println("");


        //Room creation"A101", 2500, 2, 400, true, "SingleBed"
        Rooms room1 = new SingleBed.SingleBedBuilder().setRoomNumber("A101").setRoomPrice(2500).setCapacity(2).setServiceCharge(400).setRoomStatus(true).setRoomType("SingleBed").build();
        Rooms room2 = new DoubleBed.DoubleBedBuilder().setRoomNumber("A102").setRoomPrice(5000).setCapacity(5).setServiceCharge(700).setRoomStatus(false).setRoomType("DoubleBed").build();
        Rooms room3 = new SuiteRoom.SuiteRoomBuilder().setRoomNumber("A103").setRoomPrice(7000).setCapacity(8).setServiceCharge(1000).setRoomStatus(true).setRoomType("Suite").build();
        Rooms room4 = new DoubleBed.DoubleBedBuilder().setRoomNumber("A104").setRoomPrice(5000).setCapacity(5).setServiceCharge(700).setRoomStatus(true).setRoomType("DoubleBed").build();
        Rooms room5 = new SingleBed.SingleBedBuilder().setRoomNumber("A105").setRoomPrice(2500).setCapacity(2).setServiceCharge(400).setRoomType("SingleBed").setRoomStatus(true).build();

//        room3.setGymCharge(600);


        //Customer objects
        Customer c1 = new Customer.CustomerBuilder().setUserid(101).setUsername("c1").setEmail("c1@gmail.com").setContact(120120120).setRole("User").setGender("Male").build();
        Customer c2 = new Customer.CustomerBuilder().setUserid(102).setUsername("c2").setEmail("c2@gmail.com").setContact(1220120).setRole("User").setGender("Female").build();
        Customer c3 = new Customer.CustomerBuilder().setUserid(103).setUsername("c3").setEmail("c3@gmail.com").setContact(0120120).setRole("User").setGender("Male").build();


        //Rooms added to hotel
        myHotel.addRoom(room1);
        myHotel.addRoom(room2);
        myHotel.addRoom(room3);
        myHotel.addRoom(room4);
        myHotel.addRoom(room5);
        myHotel.addRoom(room1);           //duplicate room will not be added because of set interface

        //add customer to the hotel
        myHotel.addCustomer(c1);
        myHotel.addCustomer(c2);
        myHotel.addCustomer(c3);
        System.out.println("");

        System.out.println("--------------Available rooms------------------");
        Booking booking1 = new Booking(c1, myHotel);
        // System.out.println("Available Rooms:");
        booking1.displayAvailableRooms();
        System.out.println("");


        //list of all rooms
        System.out.println("-----------Rooms Details-------------");
        myHotel.allRooms();
        System.out.println("");

        //list of all customers
        System.out.println("-----------Customer Details-------------");
        myHotel.customerDetails();
        System.out.println("");

        System.out.println("--------------Customer choose dates------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a checkin date (dd/mm/yyyy): ");
        String s1 = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter a checkout date (dd/mm/yyyy): ");
        String s2 = sc.nextLine();
        System.out.print("Enter number of guest: ");
        int guest = sc.nextInt();
        Date from = null;
        Date to = null;

        try {
            from = sdf.parse(s1);
            to = sdf.parse(s2);

            booking1.bookRoom(from, to, guest);
            //long diff = Math.abs(from.getTime() - to.getTime());
            System.out.println("");

            myHotel.allRooms();

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
