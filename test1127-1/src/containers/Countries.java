package containers;

import java.util.*;
import static lzp.tools.*;

public class Countries {
	public static final String[][] DATA = { { "Adasfa", "a" }, { "Afhdrt", "c" }, { "Aghjffu", "b" }, { "Artydhfg", "e" }, { "Aergfhstr", "d" },
			{ "Aresfhre", "f" }, { "Atydfghdty", "g" }, { "Agfhdgfhdgf", "11" }, { "Afghfdh", "22" }, { "3", "33" }, { "4", "44" }, { "5", "55" } };

	private static class FlyweightMap extends AbstractMap<String, String> {
		private static class Entry implements Map.Entry<String, String> {
			int index;

			Entry(int index) {
				this.index = index;
			}

			public boolean equals(Object obj) {
				return DATA[index][0].equals(obj);
			}

			public String getKey() {
				return DATA[index][0];
			}

			public String getValue() {
				return DATA[index][1];
			}

			public String setValue(String value) {
				throw new UnsupportedOperationException();
			}

			public int hashCode() {
				return DATA[index][0].hashCode();
			}
		}

		static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
			private int size;

			EntrySet(int size) {
				if (size < 0)
					this.size = 0;
				else if (size > DATA.length)
					this.size = DATA.length;
				else
					this.size = size;
			}

			public int size() {
				return size;
			}

			private class Iter implements Iterator<Map.Entry<String, String>> {
				private Entry entry = new Entry(-1);

				public boolean hasNext() {
					return entry.index < size - 1;
				}

				public Map.Entry<String, String> next() {
					entry.index++;
					return entry;
				}

				public void remove() {
					throw new UnsupportedOperationException();
				}
			}

			public Iterator<Map.Entry<String, String>> iterator() {
				return new Iter();
			}

		}

		private static Set<Map.Entry<String, String>> entries = new EntrySet(DATA.length);

		public Set<Map.Entry<String, String>> entrySet() {
			return entries;
		}

	}

	static Map<String, String> select(final int size) {
		return new FlyweightMap() {
			public Set<Map.Entry<String, String>> entrySet() {
				return new EntrySet(size);
			}
		};
	}

	static Map<String, String> map = new FlyweightMap();

	public static Map<String, String> capitals() {
		return map;
	}

	public static Map<String, String> capitals(int size) {
		return select(size);
	}

	static List<String> names = new ArrayList<String>(map.keySet());

	public static List<String> names() {
		return names;
	}

	public static List<String> names(int size) {
		return new ArrayList<String>(select(size).keySet());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	 print(capitals(10));
	//	 print(names(10));
		 print(new HashMap<String, String>(capitals(6)));
		 print(new LinkedHashMap<String, String>(capitals(6)));
		 print(new TreeMap<String, String>(capitals(6)));
		 print(new Hashtable<String, String>(capitals(6)));
		 print(new Hashtable<String, String>(capitals(3)));
		 print(new HashSet<String>(names(6)));
		 print(new LinkedHashSet<String>(names(6)));
		 print(new TreeSet<String>(names(6)));
		 print(new ArrayList<String>(names(6)));
		 print(new LinkedList<String>(names(6)));
		 print(capitals().get("2"));

	//	print(new CountingIntegerList(30));
	//	print(new CountingMapData(60));

	}

}
///////////////////////// CountingIntegerList

class CountingIntegerList extends AbstractList<Integer> {
	private int size;

	public CountingIntegerList(int size) {
		this.size = size < 0 ? 0 : size;
	}

	public Integer get(int index) {
		return Integer.valueOf(index);
	}

	public int size() {
		return size;
	}
}

////////////////////////////CountingMapData
class CountingMapData extends AbstractMap<Integer,String>{
	private int size;
	private static String[] chars="A B C D E F G H I J".split(" ");
	public CountingMapData(int size){
		this.size=size<0?0:size;
	}
	private static class Entry implements Map.Entry<Integer, String>{
		int index;
		Entry(int index){
			this.index=index;
		}
		public boolean equals(Object obj){
			return Integer.valueOf(index).equals(obj);
		}
		public Integer getKey(){
			return index;
		}
		public String getValue(){
			return chars[index%chars.length]+Integer.toString(index/chars.length);
		}
		public String setValue(String value){
			throw new UnsupportedOperationException();
		}
		public int hashCode(){
			return Integer.valueOf(index).hashCode();
		}

	}
	public Set<Map.Entry<Integer, String>> entrySet(){
		Set<Map.Entry<Integer, String>> entries=new LinkedHashSet<Map.Entry<Integer,String>>();
		for(int i=0;i<size;i++)
			entries.add(new Entry(i));
		return entries;
	}
}








































