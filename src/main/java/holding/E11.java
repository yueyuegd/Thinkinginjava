package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;



public class E11 {
	public static void printToStrings(Iterator<?> it){
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		System.out.println();
	}
	public static void main(String[] args) {
		List<Collection<String>> list = Arrays.<Collection<String>>asList(
				new ArrayList<String>(),new LinkedList<String>(),
				new HashSet<String>(),new TreeSet<String>());
		for(Collection<String> c : list)
			 E4.fill(c);
			 for(Collection<String> c : list)
			 printToStrings(c.iterator());
		
	}

}
