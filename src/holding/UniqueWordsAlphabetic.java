package holding;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("src"+File.separator+"holding"+File.separator+"SetOperation.java","\\W+"));
		System.out.println(words);
	}

}
