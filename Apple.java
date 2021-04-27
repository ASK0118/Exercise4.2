package Exercise4p2;

public class Apple extends Fruit{

	protected int quantity;
	protected double price;
	
	public Apple(String name, int q, double p) { //Constructor with 3 arguments
		
		super(name);
		this.quantity = q;
		this.price = p;
		
	}
	
	public String total(int q, int p) { //overloading method with 2 parameters
		return "Total price of 3 apples: RM " + (q * p);
	}
		
	public int total(int q) {	//overloading method with 1 parameter
		return q * 95;
	}
	
	public String toString() {  //overriding method
		return "Total calories of 3 apples: ";
	}
}
