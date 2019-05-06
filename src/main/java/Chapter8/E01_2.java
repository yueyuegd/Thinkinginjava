package Chapter8;
class Unicycle extends Cycle{
	public void ride(){
		System.out.println("骑脚踏车");
	}
}
class Bicycle extends Cycle{
	public void ride(){
		System.out.println("骑单车");
	}
}
class Tricycle extends Cycle{
	public void ride(){
		System.out.println("骑三轮车");
	}
}

public class E01_2 {

	public static void main(String[] args) {
		Cycle c1 = new Unicycle();
		Cycle c2 = new Bicycle();
		Cycle c3 = new Tricycle();
		c1.ride();
		c2.ride();
		c3.ride();

	}

}
