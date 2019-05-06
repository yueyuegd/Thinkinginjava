package Chapter13;
import Strings.Spilting;

public class EXE9 {
	public static String str = Spilting.knights;
	public static void main(String[] args) {
		str = str.replaceAll("a|i|o|e|u","_");
		System.out.println(str);
	}

}
