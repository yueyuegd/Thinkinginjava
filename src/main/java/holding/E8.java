package holding;

import java.util.ArrayList;
import java.util.Iterator;

class Gerbil1{
	private final int gerbilNumber;
	Gerbil1(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	public String toString(){
		return "gerbil "+gerbilNumber;
	}
	public void hop(){
		System.out.println(this+" is hopping");
	}
	
}

public class E8 {
	public static void main(String[] args) {
		ArrayList<Gerbil1> gerbils = new ArrayList<Gerbil1>();
		for(int i=0;i<10;i++){
			gerbils.add(new Gerbil1(i));
		}
		/*for(int i=0;i<gerbils.size();i++){
			gerbils.get(i).hop();
		}*/
		Iterator<Gerbil1> it = gerbils.iterator();
		while(it.hasNext()){
			it.next().hop();
		}
	}

}

