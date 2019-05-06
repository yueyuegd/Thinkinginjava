package Chap3;

public class EXERCISE14_3 {

	public static void main(String[] args) {
		//Compare("Hello","Hello");
		//String s = new String("Hello");
	   //Compare("Hello",s);
		Compare("Hello","World");

	}
	public static void Compare(String s1,String s2){
		System.out.println("s1:"+s1+" s2:"+s2);
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1!=s2:"+(s1!=s2));
		System.out.println("s1.equals(s2):"+(s1.equals(s2)));
	}

}
