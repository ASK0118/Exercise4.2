package Exercise4p2;

public class FujiApple extends Apple{
	
	private String place;
		
		public FujiApple(String name, int q, int p, String place) {   //Constructor with 4 arguments
			super(name, q, p);
			this.place = place;
		}
		
		public String total(int q, int p, double y) { //overloading method with 3 parameters
			return "Total price of" + q + " apples (japanese yen): " + (q * p * y) + " yen" ;
		}
		
		public String toString() {   //overriding method
			return "Total price of " + quantity + " "+ name + " Ringgit Malaysia : RM";
	}
		
		public String getPlace() {
			return this.place;
		}
}
