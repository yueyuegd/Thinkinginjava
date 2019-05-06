package Chapter6;

class test{
	public int a;
	private int b;
	protected int c;
	int d;
	public void show1(){
		System.out.println("show1");
	}
	private void show2(){
		System.out.println("show2");
	}
	protected void show3(){
		System.out.println("show3");
	}
	 void show4(){
		System.out.println("show4");
	}
}

public class EXERCISE5_2 {

	public static void main(String[] args) {
		test t = new test();
		t.a = 1;
		//t.b = 2;
		t.c = 3;
		t.d = 4;

	}

}
