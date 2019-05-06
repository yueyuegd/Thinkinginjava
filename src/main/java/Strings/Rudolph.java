package Strings;

public class Rudolph {
	public static void main(String[] args) {
		for(String s:new String[]{
				"[rR]udolph","[rR][aeiou][a-z]ol.*","R.*"
		})
			System.out.println("Rudolph".matches(s));
	}

}
