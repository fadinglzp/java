package containers;

import java.util.*;
import lzp.*;
import static lzp.tools.*;

class StringAddress {
	private String s;

	public StringAddress(String s) {
		this.s = s;
	}

	public String toString() {
		return super.toString() + " " + s;
	}

	public void set(String s) {
		this.s = s;
	}
}

class Government implements Generator<String> {
	String[] foundation = ("q w e r t y u i o p a s d f g h j k l".split(" "));
	private int index;

	public String next() {
		return foundation[index++];
	}
}

class Goverment2 implements Generator<String>{
	String[] foundation=new String[20];
	{
		for(int i=0;i<20;i++)
			foundation[i]=Integer.toString(i);
	}
	private int index;
	public String next(){
		return foundation[index++];
	}
}

public class FillingLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9), 10)));
		print(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(),10)));
		
		

//		Set<String> set = new TreeSet<String>(new CollectionData<String>(new Government(), 15));
//		print(set);
//		set.addAll(CollectionData.list(new Goverment2(), 15));
//		print(set);

		// List<StringAddress> list = new
		// ArrayList<StringAddress>(Collections.nCopies(4, new
		// StringAddress("ABC")));
		// for (StringAddress s : list)
		// System.out.println(s);
		// list.get(1).set("FF");
		// for (StringAddress s : list)
		// System.out.println(s);
		// Collections.fill(list, new StringAddress("DEF"));
		// for (StringAddress s : list)
		// System.out.println(s);
	}

}
