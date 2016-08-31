package holding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pets.Cat;
import pets.Cymric;
import pets.Dog;
import pets.Mutt;
import pets.Person;
import pets.Pet;
import pets.Pug;
import pets.Rat;

public class MapOfList {
	public static Map<Person,List<? extends Pet>> petPeople = 
			new HashMap<Person,List<? extends Pet>>();
	static{
		petPeople.put(new Person("Íõ¿¡¿­"), Arrays.asList(new Cymric("Molly"),
				new Mutt("Spot")));
		petPeople.put(new Person("Â¹êÏ"), Arrays.asList(new Cat("Shackleton"),new Cat("Elsie"),
				new Dog("Margrett")));
		petPeople.put(new Person("Ò×ìÈÇ§çô"), Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"),
				new Cat("Stanford aka Stinky el Negro"),new Cat("Pinkola")));
		petPeople.put(new Person("ÍõÔ´"), Arrays.asList(new Rat("Fuzzy"),new Rat("Fizzy")));
		petPeople.put(new Person("ÀîÖÇ¶÷"), Arrays.asList(new Rat("Freckly")));
		
	}
	public static void main(String[] args) {
		System.out.println("People:"+petPeople.keySet());
		System.out.println("pets:"+petPeople.values());
		for(Person p:petPeople.keySet()){
			System.out.print(p+" has ");
			for(Pet pet:petPeople.get(p)){
				System.out.print("    "+pet);
			}
			System.out.println();
		}
	}

}
