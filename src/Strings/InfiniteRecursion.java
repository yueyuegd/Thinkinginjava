package Strings;
import java.util.*;

public class InfiniteRecursion {
	public String toString(){
		return "InfiniteRecursion adress:"+super.toString()+"\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>();
		for(int i=0;i<10;i++){
			list.add(new InfiniteRecursion());
		}
		System.out.println(list);
		
	}

}
