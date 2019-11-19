package generics;
import static lzp.tools.*;
import java.util.*;

public class Holder2<T> {
	private T value;
	public Holder2() {
		
	}
public Holder2(T val) {
	value=val;
}
public void set(T val) {
	value=val;
}public T get() {
	return value;
}
public boolean equals(Object obj) {
	return value.equals(obj);
}
static <F> void write(List<? super F> list, F item) {
	list.add(item);
}
public String getclass() {
	return value.getClass().getSimpleName().toString();
}
static <F> void write2(List< F> list, F item) {
	list.add(item);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder2<Apple> apple =new Holder2<Apple>(new Apple());
		Apple d=apple.get();
		apple.set(d);
		Holder2<? extends Fruit> fruit=apple;
		Fruit p=fruit.get();
		d=(Apple)fruit.get();
		print(apple.getClass().getSimpleName(),fruit.get().getClass().getSimpleName(),p,d);
		print(fruit.equals(d));
		Holder2<? extends Fruit> fruit2=new Holder2<Apple>(new Apple());
	//	fruit2.set(d);
		print(fruit2.get().getClass());
		ArrayList<? extends Fruit> la=new ArrayList<Apple>();
		List<Fruit> la2=new ArrayList<Fruit>();
		List<Apple> la3=new ArrayList<Apple>();
		
		la2.add(new Apple());
		la2.add(new Orange());
		la2.add(new Jonathan());
		
		
		write2(la3,new Apple());
	//	write2(la2,new Fruit());
		write2(la2,new Apple());
		
		for(Fruit f:la2) print(f);
		
		write(la2,new Apple());
	
		//la.add(new Fruit());
	//	List<? super Fruit> la2=new ArrayList<Apple>();
	}
	
}
