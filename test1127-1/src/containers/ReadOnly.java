package containers;
import java.util.*;
import lzp.*;
import static lzp.tools.*;

public class ReadOnly {
	static Collection<String> data=new ArrayList<String>(Countries.names(6));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c=Collections.unmodifiableCollection(new ArrayList<String>(data));
		print(c);
	//	c.add("1");
		List<String> a=Collections.unmodifiableList(new ArrayList<String>(data));
		ListIterator<String> it=a.listIterator();
		print(it.next());
	//	it.add("1");
		Set<String> set=Collections.unmodifiableSet(new HashSet<String>(data));
		print(set);
		 
		Set<String> sets=Collections.unmodifiableSortedSet(new TreeSet<String>(data));
		print(sets);
		Map<String,String> map=Collections.unmodifiableMap(new HashMap<String,String>(Countries.capitals(6)));
		
		print(map);
		
		Map<String,String> smap=Collections.unmodifiableSortedMap(new TreeMap<String,String>(Countries.capitals(6)));
		print(smap);
		
	}

}
