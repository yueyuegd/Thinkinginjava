package Chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EXE11 {
	public static void main(String[] args) {
		String str = "Arline ate eught apples and one orange while Anita hadn\'t any";
		String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println("Matcher \""+m.group()+"\""+"position at"+m.start()+"-"+(m.end()-1));
		}
	}

}
