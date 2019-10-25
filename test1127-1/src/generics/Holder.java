package generics;
import java.util.*;
import static lzp.tools.*;
class Automobile {}
public class Holder<T> {
	private ArrayList<T> a=new ArrayList<T>();
	public Holder(T t){
		
		a.add(t);
	//	this.a =a;
	}
	public void add(T a){
		this.a.add(a);
	}
	public void set(int i,T a){
		this.a.set(i, a);
	}
	public T get(int i){
		return a.get(i);
	}
	public long length(){
		return a.size();
	}
	public List<T> getAll(){
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder<Automobile> h=new Holder<Automobile>(new Automobile());
		Automobile a=h.get(0);
		h.add(a);
		h.add(a);
//		for(int i=0;i<h.length();i++)
//			print(h.get(i).getClass().getSimpleName());
		for(Automobile a1:h.getAll())
			print(a1.getClass().getSimpleName());
	}

}
