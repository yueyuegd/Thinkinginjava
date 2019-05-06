package Chapter8_1;
class Meal{
	Meal(){System.out.println("Meal()");}//1
}
class Bread{
	Bread(){System.out.println("Bread()");}//4
}
class Cheese{
	Cheese(){System.out.println("Cheese()");}//5
}
class Lettuce{
	Lettuce(){System.out.println("Lettuce()");}//6
}
class Pickel{
	Pickel(){System.out.println("Pickel()");}//7
}
class Lunch extends Meal{//2
	Lunch(){System.out.println("Lunch()");}
}
class PortableLunch extends Lunch{//3
	PortableLunch(){System.out.println("PortableLunch()");}
	
}
public class Sandwich extends PortableLunch{
	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickel p = new Pickel();
	private Sandwich(){
		System.out.println("sandwich()");//8
	}

	public static void main(String[] args) {
		new Sandwich();

	}

}
