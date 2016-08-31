package Chapter5;

public class EXERCISE9_1 {
	int i;
	String s;
	EXERCISE9_1(int i){
		this("Karry");
		this.i = i;
		System.out.println("i="+i);//2
	}
	EXERCISE9_1(String s){
		this.s = s;
		System.out.println("String="+s);//1
	}

	public static void main(String[] args) {
		EXERCISE9_1 e = new EXERCISE9_1(921);

	}

}
