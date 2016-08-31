package Chapter5;
class test6{
	test6(String s){
		System.out.print(s+" ");
	}
}

public class EXERCISE17_2 {

	public static void main(String[] args) {
		test6[] t = new test6[3];
		for(int i=0;i<t.length;i++){
			t[i] = new test6(Integer.toString(i));
		}
	}

}
