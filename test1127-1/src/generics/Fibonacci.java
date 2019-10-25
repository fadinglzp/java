package generics;
import static lzp.tools.*;
import lzp.*;
import java.util.*;

public class Fibonacci implements Generator<Integer> {

	private int count =0;
	public Integer next(){ return fib(count++);}
	private int fib(int n){
		if(n< 2) return 1;
		return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci gen = new Fibonacci();
		for(int i=0;i<18;i++)
			printl(gen.next()+" ");
		print();
		for(int i : new IteratorFibonacci(18))
			printl(i+" ");
	}

}

class IteratorFibonacci extends Fibonacci implements Iterable<Integer>{
	private int n;
	public IteratorFibonacci(int count){
		n=count;
	}
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){
			public boolean hasNext(){return n>0;}
			public Integer next(){
				n--;
				return IteratorFibonacci.this.next();
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
}