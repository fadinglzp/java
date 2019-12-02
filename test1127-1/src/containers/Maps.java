package containers;

import java.util.concurrent.*;
import java.util.*;
import lzp.*;
import static lzp.tools.*;

public class Maps {
	private static int number = 9;

	public static void printKeys(Map<Integer, String> map) {
		printl("Size = " + map.size() + ", ");
		printl("Key: ");
		print(map.keySet());
	}

	public static void test(Map<Integer, String> map) {
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(number));
		map.putAll(new CountingMapData(number));
		printKeys(map);
		printl("Values: ");
		print(map.values());
		print(map);
		print("map.containskey(3): " + map.containsKey(3));
		print("map.get(3): " + map.get(3));
		print("map.containsValue(\"F0\"): " + map.containsValue("F0"));
		Integer key = map.keySet().iterator().next();
		print("First key in map: " + key);
		map.remove(key);
		printKeys(map);
		map.clear();
		print("map.isEmpty(): " + map.isEmpty());
		map.putAll(new CountingMapData(number));
		map.keySet().removeAll(map.keySet());
		print("map.isEmpty(): " + map.isEmpty());
		print("-----------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new HashMap<Integer,String>());
		test(new TreeMap<Integer,String>());
		test(new LinkedHashMap<Integer, String>());
		test(new IdentityHashMap<Integer, String>());
		test(new ConcurrentHashMap<Integer, String>());
		test(new WeakHashMap<Integer, String>());
	}

}
