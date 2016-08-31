package Chapter13;

public class EXE10 {
	public static String str = "Java now has regular expressions";
	public static void main(String[] args) {
		System.out.println(str.matches("^Java"));
		System.out.println(str.matches("\\Breg.*"));
		System.out.println(str.matches("n.w\\s+h(a|i)s"));
		System.out.println(str.matches("s?"));
		System.out.println(str.matches("s*"));
		System.out.println(str.matches("s+"));
		System.out.println(str.matches("s{4}"));
		System.out.println(str.matches("s{1}"));
		System.out.println(str.matches("s{0,3}"));
	}

}
