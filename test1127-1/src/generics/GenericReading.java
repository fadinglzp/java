package generics;
import static lzp.tools.*;
import java.util.*;

public class GenericReading {
	static <T> T readExact(List<T> list) {
		return list.get(0);
	}

	static List<Apple> apple = new ArrayList<Apple>();
	
	static List<Fruit> fruit = new ArrayList<Fruit>();

	static void f1() {
		Apple a = readExact(apple);
		Fruit f = readExact(fruit);
		f = readExact(apple);
	}

	static class Reader<T> {
		public T t = null;
		List<T> lt;
		T readExact(List<T> l) {
			return l.get(0);
		}

		T readCoveriant(List<? extends T> l) {
			return l.get(0);
		}
		void set(T t)
		{
			this.t=t;
		}
		public T get() {
			return t;
		}
	void setlt(List<? extends T> l) {
		//	lt=l;
		}
	}

		static void f2() {
			Reader<Fruit> f = new Reader<Fruit>();
			apple.add(new Apple());
			fruit.add(new Apple());
			f.set(new Apple());
			print(f.t.getClass());
			print(f.readExact(fruit));
			//f.readExact(apple);
			print(f.readCoveriant(apple));
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			f2();
		}

}
