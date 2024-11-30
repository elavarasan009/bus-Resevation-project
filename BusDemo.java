package busReservation.java;
	 import java.util.Scanner;
     import java.util.ArrayList;
	 public class BusDemo {
	
	   public static void main(String []args) {
		   ArrayList<Bus>buses=new ArrayList<Bus>();
           ArrayList<Booking>bookings=new ArrayList<Booking>();
		   buses.add(new Bus(1,true,2));
		   buses.add(new Bus(2,true,47));
		   buses.add(new Bus(3,true,50));
		   for(Bus b:buses) {
			 b.displayBusInfo();
		   }
		   int userinput=1;
		   try (Scanner scan = new Scanner(System.in)) {
			while(userinput==1) {
				   System.out.println("Enter 1 to booking and 2 to Exit");
				   userinput=scan.nextInt();
				   if(userinput==1) {
					Booking booking=new Booking();
					if(booking.isAvailable(bookings,buses)) {
						bookings.add(booking);
						System.out.println("Your booking is Confirm");
					}
					else {
						System.out.println("Sorry. Bus is full.Try another bus or date");
					}
					
					
					   
				   }
				 
			   }
		}
		   
		  
		   
		}
	}



