package Chapter5;


public class EXERCISE2_2 {
	String s1 = "Initialized at Definition";
	String s2;
	public EXERCISE2_2(String s){
		s2 = s;
	}

	public static void main(String[] args) {
		EXERCISE2_2 e1 = new EXERCISE2_2("Initialized at Construction");
		System.out.println("e1.s1="+e1.s1);
		System.out.println("e1.s2="+e1.s2);

	}

}
