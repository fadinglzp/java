package generics;
import java.util.*;
import static lzp.tools.*;

public class UnboundedWildcards {
	static List list1;
	static List<?> list2;
	static List<?extends Object> list3;
	static void assighl1(List l) {
		list1=l;
		list2=l;
		list3=l;
		
	}
	static void assighl2(List<?> l) {
		list1=l;
		list2=l;
		list3=l;
	}
	static void assighl3(List<?extends Object>l) {
		list1=l;
		list2=l;
		list3=l;
	}
	
	static Map map1;
	static Map<?,?> map2;
	static Map<String,?>map3;
	static void f1(Map m) {
		map1=m;
	}
	static void f2(Map<?,?>m) {
		map2=m;
	}
	static void f3(Map<String,?>m) {
		map3=m;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> as=new ArrayList<String>();
		assighl1(as);
		assighl2(as);
		assighl3(as);
		ArrayList<String> as1=new ArrayList<String>() ;
		as1.add("abc");
		ArrayList<Integer> ai1=new ArrayList<Integer>();
		ai1.add(123);
		List<?>l=new ArrayList();
		List l2;
		l2=new ArrayList<String>();
		l2=as1;
		
		l2.add("12");
		print(l2);
		l2=ai1;
		l2.add(456);
		print(l2);
		l=new ArrayList<String>();
		l=new ArrayList<Integer>();
		l=as1;
		print(l);
		print(l.get(0).getClass());
		l=ai1;
		int i=(Integer)l.get(0);
		print(i);
		print(l);
		print(l.get(0).getClass());
	
		
//		List<String>l2=new ArrayList<String>();
//		l2=new ArrayList<Integer>();
		Map<String,?>m1=new HashMap<String,Integer>();
		
		f3( m1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
