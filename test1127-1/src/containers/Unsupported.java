package containers;

import java.util.*;
import static lzp.tools.*;

public class Unsupported {
	static void test(String msg, List<String> list) {
		print("--- " + msg + " ---");
		Collection<String> c = list;
		Collection<String> subList = list.subList(1, 8);
		Collection<String> c2 = new ArrayList<String>(subList);
		print(c.getClass());
		print(list.getClass());
		try {
			print(c.retainAll(c2));
		} catch (Exception e) {
			print("retainAll(c2) : " + e);
		}
		try {
			print(c.removeAll(c2));
		} catch (Exception e) {
			print("removeAll(c2) : " + e);
		}
		try {
			c.clear();
		} catch (Exception e) {
			print("clear() : " + e);
		}
		try {
			print(c.add("X"));
		} catch (Exception e) {
			print("add(X) : " + e);
		}
		try {
			print(c.addAll(c2));
		} catch (Exception e) {
			print("addAll(c2) : " + e);
		}
		try {
			print(c.remove("C"));
		} catch (Exception e) {
			print("remove(C) : " + e);
		}
		try {
			list.set(0, "X");
			print(list);
		} catch (Exception e) {
			print("list.set() : " + e);
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		Collection c=new ArrayList(Arrays.asList("A B C D E F G H I J K L".split(" ")));
		c.add("X");
		c.add(1);
		c.add(new Apple());
		print(c);
//		test("Modifiable Copy", new ArrayList<String>(list));
//		test("Arrays.asList()", list);
//		test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));
	}

}
class Apple{
	public Apple(){
		
	}
	public String toString(){
		return"Apple";
	}
	
}
