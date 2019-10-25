package typeinfo;
import java.util.*;
import static lzp.tools.*;
class CountedInteger{
	private static long counter=0;
	private final long id =counter++;
	public String toString(){
		return Long.toString(id);
	}
	public long getCounter(){
		return counter;
	}
}

public class FilledList<T> {
	private Class<T> type;
	public FilledList(Class<T> type){this.type=type;}
	public List<T> create(int nElements){
		List<T> result = new ArrayList<T>();
		try{
			for(int i=0; i<nElements;i++)
				result.add(type.newInstance());
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
		List<CountedInteger> l =fl.create(15);
		System.out.println(l);
//		printinfo(fl);
		print(l.get(10).getCounter());

	}

}
