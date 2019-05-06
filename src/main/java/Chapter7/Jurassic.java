package Chapter7;

class SmallBrain{
	
}
final class Dinosaur{
	int i = 7;
	int j = 9;
	SmallBrain x = new SmallBrain();
	void f(){}
}

public class Jurassic {

	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;

	}

}
