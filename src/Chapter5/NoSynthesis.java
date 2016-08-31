package Chapter5;
class bird2{
	bird2(int i){}
	bird2(double d){}
}

public class NoSynthesis {

	public static void main(String[] args) {
		//bird2 b1 = new bird2();
		bird2 b2 = new bird2(1);
		bird2 b3 = new bird2(1.0);

	}

}
