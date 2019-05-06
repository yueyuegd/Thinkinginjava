package Chapter9;
abstract class Base{
	public abstract void print();
	public Base(){
		print();
	}
}
class Son extends Base{
	private int counter = 921;
	public void print(){
		System.out.println("Son.print()"+counter);
	}
}

public class EXE03 {
	public static void main(String[] args) {
		Son s = new Son();
	    s.print();
	}
	

}
