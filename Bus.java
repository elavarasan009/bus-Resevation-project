package busReservation.java;

public class Bus {
	
	 private int busno;
	   private boolean ac;
	  private int capacity;//get and set method
	  Bus(int no,boolean ac ,int cap){
		  
		  this.busno=no;
		  this.ac=ac;
		  this.capacity=cap;
		  }
	  public int getCapacity() {//accessor method
		return capacity;
		  
	  }
	  public void setCapacity(int cap)  //muteator
	  {
		  capacity=cap;
		  
	  }
	  public boolean isAc(boolean val) {//accessor method
			return ac;
			  
		  }
		 
		  public int getbusno() {//accessor method
				return busno;
				  
			  }
			 public void displayBusInfo() {
				 System.out.println(" Busno:"+busno+ " Ac: "  +ac+   " Total_Capacity: " +capacity);
				 
			 }

	public static void main(String[] args) {
		

	}

}
