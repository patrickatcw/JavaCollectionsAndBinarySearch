package com.mine;

import java.util.ArrayList;
import java.util.List;

//step 1 class
public class Theater {

    //step 2 fields or variables
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();

    //step 3 constructor
    public Theater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }

    }

    //step 4 getter for theaterName
    public String getTheaterName() {
        return theaterName;
    }

    //step 5 method to reserve seat
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat==null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    //step 6 method for testing
    public void getSeats() {
        for (Seat seat : seats) {

            System.out.println(seat.getSeatNumber());
        }
    }

    //step 7 set up private class
    private class Seat {

        //step 8 variables or fields
        private final String seatNumber;
        private boolean reserved = false;

        //step 9 constructor for just seatnumber
        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        //step 10 method for reserve
        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " is reserved");
                return true;
            } else {
                return false;
            }
        }

        //step 11 cancel function
        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }

        }

        //step 12 getter for seatnumber
        public String getSeatNumber() {
            return seatNumber;

            //step 13 to main
        }
    }

}
