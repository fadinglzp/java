package containers;

import static lzp.tools.*;
import java.util.*;
import lzp.*;

public class Lists {
	private static Boolean b;
	private static String s;
	private static Integer i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;

	public static void basicTest(List<String> a) {
		a.add(1, "x");
		a.add("x");
		a.addAll(Countries.names());
		a.addAll(3, Countries.names());
		b = a.contains("1");
		b = a.containsAll(Countries.names());
		s = a.get(1);
		i = a.indexOf("1");
		b = a.isEmpty();
		it = a.iterator();
		lit = a.listIterator();
		lit = a.listIterator(3);
		i = a.lastIndexOf("1");
		a.remove(1);
		a.remove("3");
		a.set(1, "y");
		a.retainAll(Countries.names());
		a.removeAll(Countries.names());
		i = a.size();
		a.clear();
	}

	public static void iterMotion(List<String> a) {
		ListIterator<String> it = a.listIterator();
		b = it.hasNext();
		b = it.hasPrevious();
		s = it.next();
		i = it.nextIndex();
		s = it.previous();
		i = it.previousIndex();
	}

	public static void iterManipulation(List<String> a) {
		ListIterator<String> it = a.listIterator();
		it.add("47");
		it.next();
		it.remove();
		it.next();
		it.set("47");
	}

	public static void testVisual(List<String> a) {
		print("testVisual start");
		print(a);
		List<String> b = Countries.names();
		a.addAll(b);
		a.addAll(b);
		print(a);
		ListIterator<String> x = a.listIterator(a.size() / 2);
		x.add("one");
		print(a);
		print(x.next());
		x.remove();
		print(x.next());
		x.set("47");
		print(a);
		x = a.listIterator(a.size());
		while (x.hasPrevious())
			printl(x.previous() + " ");
		print();
		print("testVisual finished");
	}

	public static void testLinkedList() {
		print("testLinkedList start");
		LinkedList<String> ll = new LinkedList<String>();
		ll.addAll(Countries.names());
		print(ll);
		print(ll.getFirst());
		ll.addFirst("one");
		ll.addLast("two");
		ll.add("X");
		print(ll);
		print(ll.getFirst());
		print(ll.removeFirst());
		print(ll.removeFirst());
		print(ll.removeLast());
		print(ll);
		for(String s: ll)
			printl(s+" ");
		print();
		ListIterator lt=ll.listIterator();
		while(lt.hasNext())
			printl(lt.next()+" ");
		print();
		print("testLinkedList finished");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		basicTest(new LinkedList<String>(Countries.names()));
		basicTest(new ArrayList<String>(Countries.names()));
		iterMotion(new LinkedList<String>(Countries.names()));
		iterMotion(new ArrayList<String>(Countries.names()));
		iterManipulation(new LinkedList<String>(Countries.names()));
		iterManipulation(new ArrayList<String>(Countries.names()));
		testVisual(new LinkedList<String>(Countries.names()));
		testLinkedList();

	}

}
