package generics;
import java.util.*;
import lzp.*;
import static lzp.tools.*;


public class Generators {
	public static <T> Collection<T> 
		fill(Collection<T> coll,Generator<T> gen,int n){
		for(;n-->0;)
			coll.add(gen.next());
		return coll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Coffee> coffee = 
				fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
		for(Coffee c: coffee)
			print(c);
		Collection<Integer> fnumbers =
				fill(new ArrayList<Integer>(),new Fibonacci(),12);
		for(int i : fnumbers)
			printl(i+" ");
	}

}
