package generics;

import java.io.*;
import java.util.*;
import lzp.*;
import static lzp.tools.*;

interface Payable {
	public String fun();
}

class Employee implements Payable {
	public String fun() {
		return this.getClass().getSimpleName().toString();
	}
}

class Hourly extends Employee implements Payable {
}

class FArray {
	public static <T> T[] fill(T[] a, Generator<T> gen) {
		for (int i = 0; i < a.length; i++)
			a[i] = gen.next();
		return a;
	}
}

class FixedSizeStack<T> {
	private int index = 0;
	private Object[] storage;

	public FixedSizeStack(int size) {
		storage = new Object[size];
	}

	public void push(T item) {
		storage[index++] = item;
	}

	public T pop() {
		return (T) storage[--index];
	}

	public int length() {
		return index;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Object obj : storage)
			sb.append(obj);
		return sb.toString();
	}
}

class FixedSizeStack2<T> {
	private ArrayList<T> storage;

	public FixedSizeStack2() {
		storage = new ArrayList<T>();
	}

	public void push(T item) {
		storage.add(item);
	}

	public T pop() {
		return storage.remove(storage.size() - 1);
	}

	public Integer length() {
		return storage.size();
	}

	public String toString() {
		return storage.toString();
	}
}

class UseList<W, T> {
	void f(List<T> t) {
	}

	void g(List<W> w) {
	}
}

interface Comparable<T> {
	public int compareTo(T t);

}

class ComparablePet<T> implements Comparable<ComparablePet<T>> {
//	public int compareTo(T arg) {
//		return 1;
//	}

	public String toString() {
		return this.getClass().getSimpleName().toString();
	}

	@Override
	public int compareTo(ComparablePet<T> t) {
		// TODO Auto-generated method stub
		return 1;
	}
}

class Cat extends ComparablePet<Cat> {
	public int age;
	public Cat() {
		age=10;
	}
	public int compareTo(Cat arg) {
		return age-arg.age;
	}


}

class Dog extends ComparablePet<Dog> {
	public int compareTo(Dog arg) {
		return 2;
	}
}

class CatSelfBounded implements Comparable<CatSelfBounded>{

	@Override
	public int compareTo(CatSelfBounded t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Animal<T>{
	T element;
	int age;
	int compare(T arg) {
		return 0;
	}
	void set(T arg) {
		element=arg;
	}
	T get() {
		return element;
	}
	
}
class EAnimal extends Animal<Apple>{}
class CatA extends Animal<CatA>{
//	int compare(CatA a) {
//		return 1;
//	}
//	void set(CatA a) {
//		element=a;
//	}
}
class DogA extends Animal<DogA>{
	int compare(DogA a) {
		return 2;
	}
}
class ECatA extends CatA{}

class AnimalB<T extends AnimalB<T>>{
	T element;
	int compare(T arg) {
		return 10;
	}
	void set(T arg) {
		element=arg;
	}
	T get() {
		return element;
	}
}


class CatB extends AnimalB<CatB>{
	
//	void set(CatB arg) {
//		element=arg;
//	}
}
class ECatB extends CatB{}

class DogB extends AnimalB<DogB>{
	
}
//class EAnimalB extends AnimalB<ECatB>{}
class EAnimalB2 extends AnimalB<CatB>{}
class Widget {
}

class NeedCasting {
	public void f(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		List<Widget> shapes = (List<Widget>) in.readObject();
		List<Widget> lw1 = List.class.cast(in.readObject());
	}
}

public class GenericTest {
	public static final int SIZE = 10;

	public static <T> void f(Comparable<T> item, T item2) {
		print(item.compareTo(item2));
		print(item + " " + item2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FixedSizeStack<String> ss = new FixedSizeStack<String>(SIZE);
		FixedSizeStack2<String> ss = new FixedSizeStack2<String>();
		for (String s : "A B C D E F G H I J".split(" "))
			ss.push(s);
		print(ss);
		int i = ss.length();
		for (; i-- > 0;)
			printl(ss.pop() + " ");
		print();
		// print(ss);
		ComparablePet cp1 = new ComparablePet();
		ComparablePet cp2 = new Cat();
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Dog d1 = new Dog();
//		f(cp1, cp2);
//		f(c1, c2);
//		f(c1, cp1);
//		f(c1, d1);
		print(c1.compareTo(cp1));
		print(c1.compareTo(c2));
		
		CatSelfBounded csb=new CatSelfBounded();
		
		CatA ca=new CatA();
		ca.compare(new CatA());
		ca.compare(new CatA());
//		ca.compare(new DogB());
		CatB cb=new CatB() ;
		ca.compare(ca);
		cb.compare(cb);
	//	csb.compareTo(cp1);
		
//		String[] ss=FArray.fill(new String[7], new RandomGenerator.String(10));

	}

}
