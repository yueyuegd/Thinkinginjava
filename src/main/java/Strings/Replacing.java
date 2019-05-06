package Strings;

public class Replacing {
	static String s = Spilting.knights;
	public static void main(String[] args) {
		System.out.println(s.replaceFirst("f\\w+","located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
	}

}
