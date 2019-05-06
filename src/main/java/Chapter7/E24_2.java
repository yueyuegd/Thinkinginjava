package Chapter7;

class JapaneseBeetle extends Beetle{
	int m = printInit("JapanseBeetle.m initialized");
	public JapaneseBeetle(){
		System.out.println("m="+m);
		System.out.println("j="+j);
	}
	static int x3 = printInit("static Japanese.x3 initialized");
}

public class E24_2 {

	public static void main(String[] args) {
		new JapaneseBeetle();

	}

}
