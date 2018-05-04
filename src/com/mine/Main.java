package com.mine;

//initial code from JavaCollections
//https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
public class Main {

    public static void main(String[] args) {

        //step 13 instance for object
        Theater theater = new Theater("Severance Hall", 8, 12);

        //step 14 call method to getseats
        //theater.getSeats();  //step 17 commented this out, then to step 18 in theaterclass
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

            //step 25 run again

            //step 26 back to theater class

            //step 32 run again

            //step 33 back to theater class method reserveseat

            //step 34 run, more efficient, got rid of many periods in before,
            //demonstrating a type of counting through elements

            //and as a note, typically you would call the binary search method
            //that java has, instead of putting it in and it being taylored
            //for our program
        }

    }
}

//final results
/*
......Seat H11 is reserved
Please pay
......Sorry, seat is taken
 */

//compared to previous
/*
...................................................................................................Seat H11 is reserved
Please pay
...................................................................................................Sorry, seat is taken
 */