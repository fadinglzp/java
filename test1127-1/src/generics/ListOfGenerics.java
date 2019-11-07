package generics;
import java.util.*;
import static lzp.tools.*;

class Generic<T>{
	T item;
	public Generic(T t){
		item=t;
	}
	public String toString(){
		return item.toString();
	}
}


public class ListOfGenerics<T> {
	private List<T> array =new ArrayList<T>();
	public void add(T item){
		array.add(item);
	}
	public T get(int index){
		return array.get(index);
	}
	static final int SIZE = 100;
	static Generic<Integer>[] gia;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Generic<Integer>[] gia=new Generic<Integer>[2];
//		new Generic<Integer>();
		ListOfGenerics<String> ls =new ListOfGenerics<String>();
		ls.add("abc");
		ls.add("123");
		print(ls.get(0));
		String[] ss =new String[2];
		gia=new Generic[SIZE];
		print(gia.getClass().getSimpleName());
		gia[0]=new Generic<Integer>(1);
//		gia[1]=new Generic<String>("2");
		print(gia[0]);
		print(gia[0].getClass());
	}

}
