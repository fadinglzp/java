package generics;

import static lzp.tools.*;

class Base {
}

class Derived extends Base {

}

interface OrdinaryGetter {
	Base get();
}

interface DerivedGetter extends OrdinaryGetter {
	Derived get();
}

interface GenericGetter<T extends GenericGetter<T>> {
	T get();
}

interface Getter extends GenericGetter<Getter> {

}

class OrdinarySetter {
	void set(Base base) {
		print("OrdinarySetter");
	}
}

class DerivedSetter extends OrdinarySetter {
	void set(Derived derived) {
		print("DerivedSetter");
	}

}

class TestGetter implements Getter {

	public Getter get() {
		// TODO Auto-generated method stub
		return new TestGetter();
	}

}


interface SelfBoundSetter<T extends SelfBoundSetter<T>>{
	void set(T arg);
}

interface Setter extends SelfBoundSetter<Setter>{
	 <T > void set(T  sbs);
//	void set(SelfBoundSetter arg);
}
interface SetterA extends SelfBoundSetter<Setter>{}


class GenericSetter<T>{
	void set(T arg) {
		print("GenericSetter");
	}
}
class DerivedGS extends GenericSetter<Base>{
	void set(Derived derived) {
		print("DerivedGS");
	}
}

class TestSetter implements Setter{
	
	public void set(Setter arg) {
		// TODO Auto-generated method stub
		print("Setter<String>");
	}

	public void set(String arg) {
		// TODO Auto-generated method stub
		print("String");
	}

	@Override
	public <T> void set(T sbs) {
		// TODO Auto-generated method stub
		print("T");
	}
	
//	public void set(SelfBoundSetter arg) {
//		print();
//	}
	
	
}

class TestSetterA implements SetterA{

	@Override
	public void set(Setter arg) {
		// TODO Auto-generated method stub
		print("Integer");
	}
	
}




public class CovariantReturnTypes {
	void test(DerivedGetter d) {
		Derived d2 = d.get();
	}

	static void test2(Getter g) {
		Getter result = g.get();
		GenericGetter ff = g.get();
		print(result);
		print(ff);
	}
	static void testA(Setter A,Setter B,SelfBoundSetter sbs) {
		A.set(B);
		A.set(sbs);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGetter tg = new TestGetter();
		print(tg);
		test2(tg);
		Getter g = tg;
		GenericGetter gg = tg;
		print(g);
		print(gg);

		Base base = new Base();
		Derived derived = new Derived();
		DerivedGS dgs=new DerivedGS();
		DerivedSetter ds = new DerivedSetter();
		ds.set(derived);
		ds.set(base);
		dgs.set(derived);
		dgs.set(base);
		
		TestSetter ts1=new TestSetter(),ts2=new TestSetter();
		TestSetterA tsa=new TestSetterA();
		testA(ts1,ts2,ts2);
		
		
		
	}

}
