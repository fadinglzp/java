package containers;

import java.util.*;
import lzp.*;
import java.util.Map.*;
import static lzp.tools.*;
class MapEntry<K, V> implements Map.Entry<K, V> {
	private K key;
	private V value;

	public MapEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public V setValue(V v) {
		V result = value;
		value = v;
		return result;
	}

	public int hashCode() {
		return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
	}

	public boolean equals(Object o) {
		if (!(o instanceof MapEntry))
			return false;
		MapEntry me = (MapEntry) o;
		return (key == null ? me.key == null : key.equals(me.key))
				&& (value == null ? me.value == null : value.equals(me.value));
	}
	public String toString() {
		return key+"="+value;
	}
}

public class SlowMap<K, V> extends AbstractMap<K,V> {

	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();

	public V get(Object key) {
		if (keys.contains(key))
			return values.get(keys.indexOf(key));
		return null;
	}

	public V put(K key, V value) {
		V oldValue = get(key);
		if (keys.contains(key))
			values.set(keys.indexOf(key), value);
		else {
			keys.add(key);
			values.add(value);
		}
		return oldValue;
	}

	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		Iterator<K> ik = keys.iterator();
		Iterator<V> iv = values.iterator();
		while (ik.hasNext())
			set.add(new MapEntry<K, V>(ik.next(), iv.next()));
		return set;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlowMap<String,String> m=new SlowMap<String,String>();
		m.putAll(Countries.capitals());
		print(m);
		print(m.entrySet());
	}

}
