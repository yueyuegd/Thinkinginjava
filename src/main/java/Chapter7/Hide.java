package Chapter7;

class Homer{
	char doh(char c){
		System.out.println("char(c)");
		return 'd';
	}
	float doh(float f){
		System.out.println("float(c)");
		return 1.0f;
	}
}
class Milhouse{}
class Bart extends Homer{
	void doh(Milhouse m){
		System.out.println("doh(Milhouse)");
	}
}

public class Hide {

	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());

	}

}
