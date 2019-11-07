package generics;
import java.lang.reflect.*;
import static lzp.tools.*;


public class GenericArrayWithToken<T> {
	private T[] array;
	public GenericArrayWithToken(Class<T> type, int size){
		array = (T[])Array.newInstance(type, size);
	}
	public void put(int index,T item){
		array[index]=item;
	}
	public T get(int index){
		return array[index];
	}
	public T[] rep(){
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericArrayWithToken<Integer> gai=
				new GenericArrayWithToken<Integer>(Integer.class,10);
		print(gai.rep().getClass());
	}

}
