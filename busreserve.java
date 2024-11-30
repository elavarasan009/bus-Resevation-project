package busReservation.java;
 import java.util.Scanner;
public class busreserve {
   public static void main(String []args) {
	   
	   int userinput=1;
	   Scanner scan=new Scanner(System.in);
	   while(userinput==1) {
		   System.out.println("Enter 1 to booking and 2 to Exit");
		   userinput=scan.nextInt();
		   if(userinput==1) {
			   System.out.println("booking open");
			   
		   }
		   else {
			   System.out.println("booking closed");
		   }
	   }
	   
	  
	   
	   }
}
