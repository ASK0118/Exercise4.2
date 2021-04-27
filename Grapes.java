package Exercise4p2;

public class Grapes extends Fruit {
	private int kJoules;
	private int amount;
	private String nutrition;
	
	public Grapes(String name, int kJ, int a) {  //Constructor with 3 arguments
		super(name);
		this.kJoules = kJ;
		this.amount = a;
		
	}
	
	public int calFoodE() {
		return this.amount * this.kJoules;
	}

	public String toString() {   //overriding method
		return "The " + this.amount + "-gram of " + name + " provided " ; 
	}
	
	public String getNutrition() {   //overloading method with no parameter
		return this.nutrition;
	}
	
	public void getNutrition(String n) {   //overloading method with 1 parameter
		System.out.println("Nutrition of grapes: " + n);
	}
}
