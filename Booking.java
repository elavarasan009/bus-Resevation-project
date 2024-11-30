package busReservation.java;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Booking {
	private static final boolean Bus = true;
	String passangername;
	int busno;
	Date date;

	

	Booking(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name :");
		 passangername= scan.next();
		 System.out.println("Enter bus no :");
		 busno=scan.nextInt();
		 System.out.println("Select  your mm-dd-yyyy :");
		 String dateInput =scan.next();	
		 SimpleDateFormat dateFormat = new SimpleDateFormat ("MM-dd-yyyy");
		
		 
		
			try {
				date=dateFormat.parse(dateInput);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	 public boolean isAvailable( ArrayList<Booking>bookings,ArrayList<Bus>buses) {
		    
	 int capacity=0;
	 for(Bus bus:buses) {
		 if(bus.getbusno()==busno) {
			 capacity=bus.getCapacity();
			 
		 }
	 }
	 int booked=0;
	 for(Booking b:bookings) {
		if(b.busno==busno&&b.date.equals(date));
		booked++;
	 }
	return booked<capacity?true:false;
	 
}}
