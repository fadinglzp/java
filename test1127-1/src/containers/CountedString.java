package containers;

import java.util.*;
import static lzp.tools.*;

public class CountedString implements Comparable<CountedString> {
	private static List<String> created = new ArrayList<String>();
	private String s;
	private int id = 0;

	public CountedString(String str) {
		s = str;
		created.add(s);
		for (String s2 : created)
			if (s2.equals(s))
				id++;
	}

	public String toString() {
		return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
	}

	public int hashCode() {
		int result = 17;
		result = 37 * result + s.hashCode();
		result = 37 * result + id;
		return result;
	}

	public boolean equals(Object o) {
		return o instanceof CountedString && s.equals(((CountedString) o).s) && id == (((CountedString) o).id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<CountedString, Integer> map = new TreeMap<CountedString, Integer>();
		CountedString[] cs = new CountedString[5];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = new CountedString("hi");
			map.put(cs[i], i);
		}
		print(map);
		for (CountedString cstring : cs) {
			print("Looking up" + cstring);
			print(map.get(cstring));
		}
	}

	public int compareTo(CountedString o) {
		// TODO Auto-generated method stub
		return id > o.id ? 1 : id < o.id ? -1 : 0;
	}

}