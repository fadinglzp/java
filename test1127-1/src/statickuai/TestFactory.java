package statickuai;
import static lzp.tools.*;
interface A{
	boolean f1();
	void f2();
}
class A1 implements A{
	int i=0;
	public boolean f1(){print("f1(A1)  "+i);return ++i!=4;}
	public void f2(){print("f2(A1)");}
}
class A2 implements A{
	int i=0;
	public boolean f1(){print("f1(A2)  "+i);return ++i!=3;}
	public void f2(){print("f2(A2)");}
}
public class TestFactory {
	public static void f2(A a){
		while(a.f1());
		//a.f2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f2(new A1());
		f2(new A2());
	}

}
