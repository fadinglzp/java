package testclass;
import java.util.*;
import static lzp.tools.*;
public class GenericVarargs {
	public static <T> List<T> makeList(T... args){
		List<T> result = new ArrayList<T>();
		for(T item :args)
			result.add(item);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = makeList("A");
		print(ls);
		ls=makeList("A","b","cd");
		print(ls);
		ls=makeList("1234568754".split(""));
		print(ls);
	}

}
