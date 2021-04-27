package Exercise4p2;

public class GreenApple extends Apple {
	private double DiscP;
	
	
	public GreenApple(String name, int q, double p, double dP) {   //Constructor with 4 arguments
		super(name, q, p);
		this.DiscP = dP;
		
	}

	public double Afdics(double p, int q) {
		return (p * q) - this.DiscP * (p * q);
	}
	
	public String toString() {   //overriding method
		return "Total price of " + quantity + " "+ name + " after " + this.DiscP*100 + " % discount: RM"; 
	}
	
}
