package containers;
import java.util.*;
import lzp.*;
import static lzp.tools.*;


public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> cs=new ArrayList<String>();
		cs.addAll(Countries.names(6));
		cs.add("ten");
		cs.add("eleven");
		print(cs);
		Object[] array=cs.toArray();
		String[] str=cs.toArray(new String[0]);
		print("Collections.max(cs)"+Collections.max(cs));
		print("Collections.min(cs)"+Collections.min(cs));
		Collection<String> cs2=new ArrayList<String>();
		cs2.addAll(Countries.names(6));
		cs.addAll(cs2);
		print(cs);
		cs.remove(Countries.DATA[0][0]);
		print(cs);
		cs.remove(Countries.DATA[1][0]);
		print(cs);
		cs.removeAll(cs2);
		print(cs);
		String val=Countries.DATA[3][0];
		print("cs.contains("+val+")="+cs.contains(val));
		print("cs.containsAll(cs2)="+cs.containsAll(cs2));
		Collection<String> cs3=((List<String> )cs).subList(3, 5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
