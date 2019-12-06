package containers;

import java.util.*;
import static lzp.tools.*;

public class Utilities {
	static List<String> list = Arrays.asList("one Two three Four five six one".split(" "));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<String> list1=new ArrayList<String>(list);
		list1.addAll(list);
		print(list1);
		Collections.shuffle(list1,new Random());
		print("shuffle : "+list1);
		ListIterator<String> it=list1.listIterator(10);
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		print("Trimmed : "+list1);
		Collections.sort(list1);
		print("Sorted : "+list1);
		String key=list1.get(7);
		int index=Collections.binarySearch(list1, key);
		print("Location of "+key+" is "+index+", list.get("+index+") = "+list1.get(index));
		Collections.sort(list1, String.CASE_INSENSITIVE_ORDER);
		print("Case-insensitive sorted: "+list1);
		key=list1.get(7);
		index=Collections.binarySearch(list1, key);
		print("Location of "+key+" is "+index+", list.get("+index+") = "+list1.get(index));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		print("-----------------------------");
		print(list);
		print("'list' disjoint (Four)?: " + Collections.disjoint(list, Collections.singletonList("Four")));
		print("max: " + Collections.max(list));
		print("min: " + Collections.min(list));
		print("max w/ comparator: " + Collections.max(list, String.CASE_INSENSITIVE_ORDER));
		print("min w/ comparator: " + Collections.min(list, String.CASE_INSENSITIVE_ORDER));
		List<String> sublist = Arrays.asList("Fout five six".split(" "));
		print("indexOfSublist: " + Collections.indexOfSubList(list, sublist));
		print("lastIndexOfSublist: " + Collections.lastIndexOfSubList(list, sublist));
		Collections.replaceAll(list, "one", "Yo");
		print("replaceAll: " + list);
		Collections.reverse(list);
		print("reverse: " + list);
		Collections.rotate(list, 3);
		print("rotate: " + list);
		List<String> source = Arrays.asList("in the matrix".split(" "));
		Collections.copy(list, source);
		print("copy: "+list);
		Collections.swap(list, 0, list.size()-1);
		print("swap: "+list);
		Collections.shuffle(list, new Random());
		print("shuffle: "+list);
		Collections.fill(list, "pop");
		print("fill: "+list);
		print("frequency of 'pop': "+Collections.frequency(list, "pop"));
		List<String> dups=Collections.nCopies(3, "snap");
		print("dups: "+dups);
		print("'list' disjoint 'dups': "+Collections.disjoint(list,dups));
		Enumeration<String> e=Collections.enumeration(dups);
		Vector<String> v=new Vector<String>();
		while(e.hasMoreElements())
			v.addElement(e.nextElement());
		print("vector: "+v);
		ArrayList<String> arrayList=Collections.list(v.elements());
		print("arrayList: "+arrayList);
		


	}

}
