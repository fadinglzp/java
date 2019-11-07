package generics;
import static lzp.tools.*;

public class GenericArray<T> {
	private static final Object[] Integer = null;
	private T[] array;
	public GenericArray(int sz){
		array=(T[])new Object[sz];
	}
	public void put(int index, T item){
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
		GenericArray<Integer> gai=new GenericArray<Integer>(10);
		for(int i=0;i<10;i++)
		gai.put(i, i);
		
		Object[] ia= gai.rep();
		print(ia.getClass());
		
		Object[] obj = new Integer[10];
		print(obj.getClass().getSimpleName());
		
		Integer[]i1=(Integer[]) ia;
		print(i1.getClass());
	//	print(gai.rep().getClass());
		for(Object i:ia){
			print(i.getClass());
		}
	}

}
