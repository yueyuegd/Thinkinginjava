package Chapter13;

public class EXE7 {
	public static boolean match(String text){
		return text.matches("\\p{javaUpperCase}.*\\.");
	}
	public static void main(String[] args) {
		System.out.println(match("This is correct."));
		System.out.println(match("bad sentence 1."));
		System.out.println(match("Bad sentence 2"));
		System.out.println(match("This is also correct..."));
	}

}
