package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;


class MovieNameGenerator implements Generator<String>{
	String[] characters = {
			 "Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
			 "Bashful", "Snow White", "Witch Queen", "Prince"
			 };
	int next;

	@Override
	public String next() {
		String r = characters[next];
		next = (next+1)%characters.length;
		return r;
	}
	
}

public class E4 {
	private  static final MovieNameGenerator mng =
			new MovieNameGenerator();
	public  static String[] fill(String[] array){
		for(int i=0;i<array.length;i++){
			array[i] = mng.next();
		}
		return array;
	}
	public  static Collection<String> fill(Collection<String> collection){
		for(int i = 0;i<5;i++){
			collection.add(mng.next());
		}
		return collection;
	}
	public static void main(String[] args) {
		//E4 e = new E4();
		System.out.println(Arrays.toString(fill(new String[5])));
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
	}

}
