package holding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class Gerbil{
	private final int gerbilNumber;
	Gerbil(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	public String toString(){
		return "gerbil "+gerbilNumber;
	}
	public void hop(){
		System.out.println(this+" is hopping");
	}
	
}

public class E17 {
	public static void main(String[] args) {
		Map<String,Gerbil> gerbils = 
				new HashMap<String,Gerbil>();
		 gerbils.put("Fuzzy", new Gerbil(1));
		 gerbils.put("Spot", new Gerbil(2));
		 gerbils.put("Joe", new Gerbil(3));
		 gerbils.put("Ted", new Gerbil(4));
		 gerbils.put("Heather", new Gerbil(5));
		 //System.out.println(gerbils);
		 /*Set<String> names = gerbils.keySet();
		 Iterator<String> it = names.iterator();
		 while(it.hasNext()){
			 System.out.print(it.next());
			 (gerbils.get(it.next())).hop();
		 }*/
		 Iterator<Entry<String,Gerbil>> its = gerbils.entrySet().iterator();
		 while(its.hasNext()){
			 Entry<String,Gerbil> entry = its.next();
			 System.out.print(entry.getKey()+":");
			 entry.getValue().hop();
		 }
	}
	

}
