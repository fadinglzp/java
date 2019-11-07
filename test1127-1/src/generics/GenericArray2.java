package generics;
import static lzp.tools.*;

public class GenericArray2<T> {
	private Object[] array;
	public GenericArray2(int size){
		array = new Object[size];
	}
	public void put(int index,T item){
		array[index]=item;
	}
	public T get(int index){
		return (T)array[index];
	}
	public T[] rep(){
		return (T[])array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericArray2<Integer> gai = new GenericArray2<Integer>(10);
		int i=10;
		for(;i-->0;)
			gai.put(i, i);
		for(;++i<10;)
			printl(gai.get(i)+" ");
		print();
	//	print(gai.rep().getClass());
		Object[] obj = gai.rep();
		print(obj.getClass());
	}

}
