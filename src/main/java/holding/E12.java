package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class E12 {
	public static List<Integer> reverse(List<Integer> list){
		ListIterator<Integer> it = list.listIterator();
		List<Integer> li = new ArrayList<Integer>();
		while(it.hasNext()){
			it.next();
		}
		while(it.hasPrevious()){
			li.add(it.previous());
		}
		return li;
		
	}
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		List<Integer> list2 = new ArrayList<Integer>(list1);
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		list2 = reverse(list1);
		
		System.out.println("list1:"+list1);
		System.out.println("Reversed:");
		System.out.println("list2:"+list2);
	}

}
