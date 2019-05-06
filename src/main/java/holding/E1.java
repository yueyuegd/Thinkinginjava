package holding;

import java.util.ArrayList;

class Gerbil2{
	private final int gerbilNumber;
	Gerbil2(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	public String toString(){
		return "gerbil "+gerbilNumber;
	}
	public void hop(){
		System.out.println(this+" is hopping");
	}
	
}

public class E1 {
	public static void main(String[] args) {
		ArrayList<Gerbil2> gerbils = new ArrayList<Gerbil2>();
		for(int i=0;i<10;i++){
			gerbils.add(new Gerbil2(i));
		}
		for(int i=0;i<gerbils.size();i++){
			gerbils.get(i).hop();
		}
	}

}
