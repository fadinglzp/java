package statickuai;
import static lzp.tools.*;

abstract class fun1{
//	abstract void f1();
	void f2(){print("fun1");};
	abstract  void f2(fun1 f1);
}

class fun2 extends fun1{
	void f1(){
		print("fun2");
	}
	 void f2(fun1 f1){
		print("f2");
	}
	 void f2(){
			print("f2");
			super.f2();
		}
}


public class Abstract901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fun1 tf =new fun1();  抽象类无法实例
		fun1 f1=new fun2();
		f1.f2(f1);
		f1.f2(new fun2());
		((fun2)f1).f2();

//		fun2.f2(f1);
	}

}
