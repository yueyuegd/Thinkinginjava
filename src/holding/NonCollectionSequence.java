package holding;

import java.util.Iterator;

import pets.Pet;
import pets.Pets;

class PetSequence{
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence{
	
	public Iterable<Pet> reversed(){
		return new Iterable<Pet>(){
			public Iterator<Pet> iterator(){
				return new Iterator<Pet>(){
					int current = pets.length-1;
					public boolean hasNext(){
						return current>-1;
					}
					public Pet next(){
						return pets[current--];
					}
					public void remove(){
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>(){
			private int index = 0;
			public boolean hasNext(){
				return index<pets.length;
			}
			public Pet next(){
				return pets[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
		
		for(Pet p:nc.reversed()){
			System.out.print(p+" ");
		}
	}

}
