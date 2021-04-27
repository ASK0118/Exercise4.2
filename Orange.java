package Exercise4p2;

public class Orange extends Fruit {
	//private int calories;
	private double weight;
	private String taste;
	
	public Orange(String name, double w, String t) {  //Constructor with 3 arguments 
		super(name);
		//this.calories = c;
		this.weight = w;
		this.taste = t;
	}
	
	public String getInfo() { //overloading method with no parameter
		return this.taste;
	}
	
	public double getInfo(int cal, double w){  //overloading method with 2 parameters
		 return cal * w;
		 
	}
	
	public String toString() { //overriding method
		return "Calories of " + name + " in " + this.weight + " gram: ";
	}
}
