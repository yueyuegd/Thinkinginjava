package holding;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(
				new TextFile("src"+File.separator+"holding"+File.separator+"SetOperation.java","\\W+"));
		System.out.println(words);
		
	}

}
