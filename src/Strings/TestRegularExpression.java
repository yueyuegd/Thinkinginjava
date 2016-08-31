package Strings;
import java.util.regex.*;

public class TestRegularExpression {
	public static void main(String[] args) {
		String[] str = {"abcabcabcdefabc","abc+","(abc)+","(abc){2,}"};
		if(str.length<2){
			System.out.println("Usage:\njava TestRegularExpression"+"characterSequence regularExpression+");
			System.exit(0);
		}
		System.out.println("Input:\""+str[0]+"\"");
		for(String arg:str){
			System.out.println("Regular expression:\""+arg+"\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(str[0]);
			while(m.find()){
				System.out.println("Match \""+m.group()+"\" at position"+m.start()+"-"+(m.end()-1));
			}
		}
	}

}
