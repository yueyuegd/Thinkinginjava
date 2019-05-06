package Chapter7;

class test2{
	void show(){
		System.out.println("show()");
	}
	int show(int i){
		System.out.println(i+"show()");
		return 1;
	}
	double show(double d){
		System.out.println(d+"show()");
		return 1.0;
	}
}
class test3 extends test2{
	char show(char c){
		System.out.println(c+"show()");
		return 'w';
	}
}

public class E13_2 {

	public static void main(String[] args) {
		new test3().show();
		new test3().show('w');
		new test3().show(921);
		new test3().show(1.0);

	}

}
