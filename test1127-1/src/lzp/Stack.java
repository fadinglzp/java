package lzp;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v){ storage.addFirst(v); }
	public T peek(T v){
		return storage.getFirst();
	}
	public T pop(T v){
		return storage.removeFirst();
	}
	public boolean empty(){
		return storage.isEmpty();
	}
	public String toString(){
		return storage.toString();
	}
}
