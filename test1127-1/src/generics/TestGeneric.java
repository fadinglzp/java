package generics;

import static lzp.tools.*;

import java.util.Random;

class GenericType<T> {

}

class CuriouslyRecurringGeneric extends GenericType<CuriouslyRecurringGeneric> {

}

class BasicHolder<T> {
	T element;
	T[] elements;
	void set(T arg) {
		element = arg;
	}

	T get() {
		return element;
	}
	T[] gets() {
		return elements;
	}
 
	void f() {
		print(element.getClass().getSimpleName());
	}
}

class TestApples extends BasicHolder<TestApples>{
	String type;
	TestApples()
	{	
		Random rand=new Random();
		switch (rand.nextInt(3)) {
		case 1:
			type="A";
			break;
		case 2:
			type="B";
			break;
		default:
			type="C";
			break;
		}
		
	}
	 TestApples(int i)
	{	
		elements=new TestApples[i];
		for(int j=0;j<i;j++) {
			elements[j]=new TestApples();
		}
		
	}
	public String toString() {
		return type;
	}
}

class Subtype extends BasicHolder<Subtype> {

}
class Subtype2<T> extends BasicHolder<Subtype2<T>>{
	T element;
	void set2(T arg) {
		element = arg;
	}

	T get2() {
		return element;
	}
	void f2() {
		print(element.getClass().getSimpleName());
	}
	
}



class Other {
	
	
	
}

class BasicOther extends BasicHolder<Other> {
}


class SelfBounded<T extends SelfBounded<T>>{
	public T element;
	
	SelfBounded<T> set(T arg){
		element=arg;
		return this;
	}
	T get() {
		return element;
	}
}

class A extends SelfBounded<A>{ 
	public String name="a";

	}
class B extends SelfBounded<A>{
	public B element;
	public void set(B arg) {
		element=arg;
	}
	
}
class C extends SelfBounded<C>{
	C setAndGet(C arg) {
		set(arg);
		return arg;
	}
}

class A1 extends A{}
//class A2 extends SelfBounded<A1>{}
//class A2 extends SelfBounded<A1>{}
class D{
	D element;
	D(){
		
	}
	D get() {
		return element;
	}
	void set(D d) {
		element=d;
	}
	void f()
	{
	}
	
}
//class E extends SelfBounded<D>{}

class F extends SelfBounded{}




public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d1=new D(),d2=null;
		print(d2);
		d2=d1.get();
		print(d1);
		print(d2);
		
		TestApples ta=new TestApples(10);
		print(ta.gets());
		
		
		BasicHolder<Integer> bi=new BasicHolder<Integer>();
		bi.set(1);
		bi.f();
		
		Subtype2<String> s2=new Subtype2<String>();
		s2.set(new Subtype2<String>());
		s2.f();
		s2.set2("abc");
		s2.f2();
		
		
		Subtype st1 = new Subtype(), st2 = new Subtype();
		st1.set(st2);
		Subtype st3 = st1.get();
		st1.f();
		
		

		BasicOther b1 = new BasicOther(), b2 = new BasicOther();
		b1.set(new Other());
		Other other = b1.get();
		b1.f();
		
		
		A a=new A();
		
		a.set(new A());
		print(a.element.name);
		a=a.set(new A()).get();
		a=a.get();
		
		B b=new B();
		b.set(new A());
		print(b.get().name);
				
		
		C c=new C();
		c=c.setAndGet(new C());
	}

}
