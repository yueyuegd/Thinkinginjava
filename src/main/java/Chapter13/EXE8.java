package Chapter13;
import java.util.Arrays;

import Strings.Spilting;

public class EXE8 {
	public static String str = Spilting.knights;
	public static void match(String regex){
		System.out.println(Arrays.toString(str.split(regex)));
	}
	public static void main(String[] args) {
		match("the|you");
	}

}
