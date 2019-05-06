package holding;

import java.util.Iterator;
import java.util.List;

import pets.Pet;
import pets.Pets;

public class SimpleIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(22);
		Iterator<Pet> it =pets.iterator();
		while(it.hasNext()){
			Pet p = it.next();
			System.out.println(p.id()+":"+p+"");
		}
		System.out.println();
		for(Pet p:pets){
			System.out.println(p.id()+":"+p+"");
		}
		it=pets.iterator();
		for(int i=0;i<6;i++){
			it.next();
			it.remove();
		}
		System.out.println(pets);
		
	}

}
