package containers;

import java.util.*;
import static lzp.tools.*;

class Element {
	private String ident;

	public Element(String id) {
		ident = id;
	}

	public String toString() {
		return ident;
	}

	public int hashCode() {
		return ident.hashCode();
	}

	public boolean equals(Object r) {
		return r instanceof Element && ident.equals(((Element) r).ident);
	}

	protected void finalize() {
		print("Finaling " + getClass().getSimpleName() + " " + ident);
	}
}

class Key extends Element {
	public Key(String id) {
		super(id);
	}
}

class Value extends Element {
	public Value(String id) {
		super(id);
	}
}

enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER
}

public class CanonicalMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String > stack=new Stack<String>();
		for(Month m: Month.values())
			stack.push(m.toString());
		print("stack = "+stack);
		stack.addElement("The last line");
		print("element 5 = "+stack.elementAt(5));
		print("popping elements: ");
		while(!stack.empty())
			printl(stack.pop()+" ");
		print();
		LinkedList<String> lstack=new LinkedList<String>();
		for(Month m:Month.values())
			lstack.addFirst(m.toString());
		print("lstack = "+lstack);
		while(!lstack.isEmpty())
			printl(lstack.removeFirst()+" ");
		lzp.Stack<String> stack2=new lzp.Stack<String>();
		for(Month m : Month.values())
			stack2.push(m.toString());
		print("stack2 = "+stack2
				);
		while(!stack2.empty())
			printl(stack2.pop()+" ");
		
		
		
		
		

		// Vector<String> v=new Vector<String>(Countries.names(10));
		// Enumeration<String> e=v.elements();
		// while(e.hasMoreElements())
		// printl(e.nextElement()+", ");
		// print();
		// print("----------------------------");
		// Enumeration<String> e2=Collections.enumeration(new
		// ArrayList<String>(Countries.names(9)));
		// print(e2);

		// int size=10000;
		// if(args.length>0)
		// size=new Integer(args[0]);
		// Key[] keys=new Key[size];
		// WeakHashMap<Key,Value> map=new WeakHashMap<Key,Value>();
		// for(int i=0;i<size;i++){
		// Key k=new Key(Integer.toString(i));
		// Value v=new Value(Integer.toString(i));
		// if(i%3==0)
		// keys[i]=k;
		// map.put(k, v);
		// }
		//
		// System.gc();
		// print("finish");
	}

}
