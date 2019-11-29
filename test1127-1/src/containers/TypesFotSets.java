package containers;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import static lzp.tools.*;

class SetType {
	Integer i;

	public SetType(int n) {
		i = n;
	}

	public boolean equals(Object o) {
		return o instanceof SetType && (i == ((SetType) o).i);
	}

	public String toString() {
		return Integer.toString(i);
	}
}

class HashType extends SetType {
	public HashType(int n) {
		super(n);
	}

	public int hashCode() {
		return i;
	}

}

class TreeType extends SetType implements Comparable<TreeType> {
	public TreeType(int n) {
		super(n);
	}

	public int compareTo(TreeType arg) {
		return arg.i < i ? -1 : (arg.i > i ? 1 : 0);
	}
}

public class TypesFotSets {
	static <T> Set<T> fill(Set<T> set, Class<T> type) {
		try {
			for (int i = 0; i < 10; i++)
				set.add(type.getConstructor(int.class).newInstance(i));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return set;
	}

	static <T> void test(Set<T> set, Class<T> type) {
		fill(set, type);
		fill(set, type);
		fill(set, type);
		print(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class t=Apple.class;
		// try {
		// Object obj=t.getConstructor().newInstance();
		// print(obj);
		// } catch (Exception e1) {
		// e1.printStackTrace();
		// }

		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>(new CountingMapData(9));
		print(linkedMap);
		linkedMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);
		linkedMap.putAll(new CountingMapData(9));
		print(linkedMap);
		for (int i = 0; i < 6; i++)
			linkedMap.get(i);
		print(linkedMap);
		linkedMap.get(0);
		print(linkedMap);

		SortedSet<String> sortedSet = new TreeSet<String>();
		Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
		print(sortedSet);
		String low = sortedSet.first();
		String high = sortedSet.last();
		print(low);
		print(high);
		Iterator<String> it = sortedSet.iterator();
		for (int i = 0; i < 7; i++) {
			if (i == 3)
				low = it.next();
			if (i == 6)
				high = it.next();
			else
				it.next();
		}
		print(low);
		print(high);
		print(sortedSet.subSet(low, high));
		print(sortedSet.headSet(high));
		print(sortedSet.tailSet(low));

		test(new HashSet<HashType>(), HashType.class);
		test(new LinkedHashSet<HashType>(), HashType.class);
		test(new TreeSet<TreeType>(), TreeType.class);
		test(new HashSet<SetType>(), SetType.class);
		test(new HashSet<TreeType>(), TreeType.class);
		test(new LinkedHashSet<SetType>(), SetType.class);
		test(new LinkedHashSet<TreeType>(), TreeType.class);
		try {
			test(new TreeSet<SetType>(), SetType.class);
		} catch (Exception e) {
			print(e.getMessage());
		}
		try {
			test(new TreeSet<HashType>(), HashType.class);

		} catch (Exception e) {
			print(e.getMessage());
		}

	}

}
