package holding;

import java.util.LinkedList;

public class Stack<T>{
	private LinkedList<T> storage = new LinkedList<T>();
	//ÈëÕ»
	public void push(T v){
		storage.addFirst(v);
	}
	public T peek(){
		return storage.getFirst();
	}
	//³öÕ»
	public T pop(){
		return storage.removeFirst();
	}
	//ÅĞ¶ÏÕ»¿Õ
	public boolean empty(){
		return storage.isEmpty();
	}
	public String toString(){
		return storage.toString();
	}

}
