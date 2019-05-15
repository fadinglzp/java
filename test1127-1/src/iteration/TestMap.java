package iteration;
import java.util.*;

import testclass.Apple;

import static lzp.tools.*;
public class TestMap {
	public static void main (String[] args){
		Map<String,Apple> appleMap=new HashMap<String,Apple>();
		appleMap.put("apple1", new Apple("a1"));
		appleMap.put("apple2", new Apple("A2"));
		print(appleMap);
		Apple a=appleMap.get("apple2");
		Apple b =new Apple("A2");
		print(a);
		print(b);
		print(appleMap.containsValue(a));
		print(appleMap.containsValue(b));
		
		
		
		
		Map<String,List<? extends Apple>> lappleMap=new HashMap<String,List<? extends Apple>>();
		lappleMap.put("person1", Arrays.asList(new Apple("A1"),new Apple("A2")));
		lappleMap.put("person2", Arrays.asList(new Apple("B1"),new Apple("B2"),new Apple("B3")));
		for(String person : lappleMap.keySet()){
			print(person+" :");
			for(Apple c : lappleMap.get(person))
				print("    "+ c );
		}
			
	}
}
