package Exercise4p2;

public class Main {

	public static void main(String[] args) {
		
		/*System.out.println("Info of Fruits");
		System.out.println("---------------");
		Fruit zFruit = new Fruit("Fruits");*/
		
		System.out.println("Info of Apple");
		System.out.println("--------------------");
		Apple q = new Apple("Apple", 3 , 10);
		System.out.println("Price of one apple: RM " + q.price);
		System.out.println(q.total(4, 5));
		System.out.println(q.toString()+ q.total(10));
		
		System.out.println("\nInfo of Orange");
		System.out.println("--------------------");
		Orange wOrange = new Orange("Orange", 12.3, "sour");
		System.out.println("The taste of orange: " + wOrange.getInfo());
		System.out.println(wOrange.toString() + wOrange.getInfo(37, 12.3));
		
		System.out.println("\nInfo of Grapes");
		System.out.println("--------------------");
		Grapes xGrapes = new Grapes("Grapes", 288, 200);
		System.out.println(xGrapes.toString()+ xGrapes.calFoodE() + " kilojoules of food energy.");
		xGrapes.getNutrition("Vitamin C, Vitamin K, Fiber");
		
		System.out.println("\nInfo of Green Apple");
		System.out.println("--------------------");
		GreenApple aa = new GreenApple("Green Apple", 3 , 4, 0.2);
		System.out.println("Price of one green apple: RM " + aa.price);
		System.out.println(aa.toString()+ aa.Afdics(10.0,4));
		//System.out.print(aa);
		//System.out.println(aa.Afdics());
		
		System.out.println("\nInfo of Fuji Apple");
		System.out.println("--------------------");
		FujiApple FA = new FujiApple("Fuji Apple", 8, 4, "Japan");
		System.out.println("Origin of "+ FA.name + ": " + FA.getPlace());
		System.out.println(FA.total(10, 4, 26.26));
		System.out.println(FA.toString() + FA.quantity * FA.price);

	}

}
