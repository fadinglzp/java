package generics;
import java.util.*;
import static lzp.tools.*;

public class RandomList<T> {

	private ArrayList<T> storage =new ArrayList<T>();
	private Random rand =new Random();
	public void add(T item){storage.add(item);}
	public T select(){
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomList<String> rs =new RandomList<String>();
		for(String s : "A B C D E F G".split(" "))
			rs.add(s);
		for(int i=0;i<10;i++)
			printl(rs.select()+" ");
	}

}
