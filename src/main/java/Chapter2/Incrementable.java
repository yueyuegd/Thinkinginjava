package Chapter2;
class StaticTest{
	static int i = 47;
}
public class Incrementable {
	static void increment(){
		StaticTest.i++;
	}

	public static void main(String[] args) {
		Incrementable sf = new Incrementable();
		sf.increment();
		Incrementable.increment();
		increment();

	}

}
