package Chapter5;

class test5{
	static String s1 ="Initialized at definition";
	static String s2;
	static{
		s2 = "Initialized in static block";
	}
	static void print(){
		System.out.println(s1+"   "+s2);
	}
}

public class EXERCISE14_1 {
	public static void main(String[] args){
		test5.print();
	}

}
