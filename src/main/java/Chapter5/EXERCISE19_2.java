package Chapter5;

public class EXERCISE19_2 {
	public static void f(String... args){
		for(String s:args){
			System.out.print(s+" ");
		}
		System.out.print("one");
	}

	public static void main(String[] args) {
		f("Karry","Roy","Jackson");

	}

}
