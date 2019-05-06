package holding;

import java.util.Collection;
import java.util.Iterator;

import pets.Pet;
import pets.Pets;

public class CollectionSequence implements Collection<Pet>{
	private Pet[] pets = Pets.createArray(8);
	public int size(){
		return pets.length;
	}
	
	@Override
	public Iterator<Pet> iterator() {
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
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}

	@Override
	public boolean isEmpty() {
		
		return pets.length==0;
	}

	@Override
	public boolean contains(Object o) {
		if(o==null){return false;}
		for(int i=0;i<pets.length;i++){
			if(o.equals(pets[i])){
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		Object[] result = new Object[pets.length];
		System.arraycopy(pets,0,result,0,pets.length);
		return result;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Pet e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Pet> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	

}
