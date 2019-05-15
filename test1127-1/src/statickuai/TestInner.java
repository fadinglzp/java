package statickuai;
import static lzp.tools.*;

class Inner{
	public class A{
		int i=1;
		void f(){
			t++;
			i++;
			Inner.this.i++;
			}
		public A fun2(){return this;}
		public Inner fun3(){return Inner.this;}
	}
	public static class B{
		int i=4;
	}
	A fun(){return new A();}
//	static A fun2(){return new A();}
	private int i=0,t=0;
	void pi(){print(i);}
	
}

public class TestInner {
	static class Inner2{
		int i=3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner i=new Inner();
		Inner.A a=i.fun(); 
//		Inner.A a1=new Inner.A(); 
		Inner.A a2=i.new A();
		print(a2.i);
		print(a.i);
		i.pi();
		a.f();
		print(a.i);
		i.pi();
		TestInner.Inner2 ti=new TestInner.Inner2();
		print(ti.i);
		Inner.B b=new Inner.B();
		Inner.B b2=new Inner.B();
		print(b.i);
		print(b2.i);
		b.i++;
		print(b.i);
		print(b2.i);
		print(a2.i);
	}

}
