package containers;
import java.util.*;
import lzp.*;
import static lzp.tools.*;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> linkedMap=new LinkedHashMap<Integer,String>(new CountingMapData(9));
		print(linkedMap);
		linkedMap=new LinkedHashMap<Integer,String>(16,0.75f,true);
		linkedMap.putAll(new CountingMapData(9));
		for(int i=0;i<6;i++)
			linkedMap.get(i);
		print(linkedMap);
		linkedMap.get(0);
		print(linkedMap);
	}

}
