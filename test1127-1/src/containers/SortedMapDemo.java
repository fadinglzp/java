package containers;
import java.util.*;
import lzp.*;
import static lzp.tools.*;
public class SortedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeMap<Integer,String> sortedMap=new TreeMap<Integer,String>(new CountingMapData(10));
//		print(sortedMap);
//		Integer low =sortedMap.firstKey();
//		Integer high= sortedMap.lastKey();
//		print(low);
//		print(high);
//		Iterator<Integer> it= sortedMap.keySet().iterator();
//		for(int i=0;i<7;i++){
//			if(i==3) low=it.next();
//			if(i==6) high=it.next();
//			else it.next();
//		}
//		print(low);
//		print(high);
//		Map<Integer,String> map=sortedMap.subMap(low, high);
//		Map<Integer,String> map1 =new TreeMap<Integer,String>(){};
//		Map<Integer,String> map2=new TreeMap<Integer,String>(sortedMap.subMap(low, high));
//		print(map2);
//		map1.putAll(sortedMap.subMap(low, high));
//		print(map);
//		print(map1);
//		print(sortedMap);
//		print(map1.remove(3));
//		print(sortedMap);
//		map.clear();
//		print(sortedMap);
//		print(sortedMap.headMap(low));
//		print(sortedMap.tailMap(low));
		
		
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3}));
		print(al);
		List<Integer>[] list=new ArrayList[10];
		List<Integer> list1=new ArrayList<Integer>();
		list[0]=list1;
		list[1]=new ArrayList<Integer>();
	}

}
