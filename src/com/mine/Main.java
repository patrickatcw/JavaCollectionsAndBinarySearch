package com.mine;

//initial code from JavaCollections
public class Main {

    public static void main(String[] args) {

        //step 13 instance for object
        Theater theater = new Theater("Severance Hall", 8, 12);

        //step 14 call method to getseats
        //theater.getSeats();   step 17 commented this out
        //run

        //step 15 for reserve seat
        if(theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
            //then run
        }

        //step 16 same code to demonstrate seat taken
        if(theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
            //then run
        }

    }
}
