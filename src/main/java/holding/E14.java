package holding;

import java.util.LinkedList;
import java.util.ListIterator;

public class E14 {
	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<Integer>();
		ListIterator<Integer> it = llist.listIterator();
		for(int i=1;i<=10;i++){
			it.add(i);
			if(i%2==0){
				it.previous();
			}
		}
		System.out.println(llist);
	}

}
