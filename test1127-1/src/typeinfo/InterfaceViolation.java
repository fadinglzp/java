package typeinfo;
import static lzp.tools.*;

class B implements A{
	public void f(){print("f");}
	public  void g(){
		print("g");
	}
}

public class InterfaceViolation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.getClass().cast(a).f();
		((B)a).g();
		//((B) a).f();
		
		print(a.getClass().getName());
		if(a instanceof B){
			B b=(B)a;
			b.g();
		}
	}

}
