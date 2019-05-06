package Strings;

public class Immutable {
	public static String toUpper(String s){
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		String q = "howdy";
		System.out.println(q);
		String qq = toUpper(q);
		System.out.println(q);
		System.out.println(qq);
	}

}
