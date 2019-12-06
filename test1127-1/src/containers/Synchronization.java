package containers;

import java.util.*;
import static lzp.tools.*;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		Set<String> s = Collections.synchronizedSet(new HashSet<String>());
		Set<String> ss = Collections.synchronizedSortedSet(new TreeSet<String>());
		Map<String, String> m = Collections.synchronizedMap(new HashMap<String, String>());
		Map<String, String> sm = Collections.synchronizedSortedMap(new TreeMap<String, String>());

		Collection<String> c1 = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("An object");
		try {
			String s1 = it.next();
		} catch (Exception e) {
			print(e);
		}
	}

}
