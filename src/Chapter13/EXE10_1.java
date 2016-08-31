package Chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EXE10_1 {
	public static void main(String[] args) {
		String str = "Java now has regular expression";
		String[] regex = {"^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}","s{0,3}"};
		System.out.println("str:"+str);
		for(String pattern:regex){
			System.out.println("regular expression :\""+pattern+"\"");
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(str);
			while(m.find()){
				System.out.println("Matcher \""+m.group()+"\""+"at position  "+m.start()+"-"+(m.end()-1));
			}
		}
	}

}
