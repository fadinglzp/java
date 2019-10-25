package statickuai;
import static lzp.tools.*;
class BaseExtend{
	void fun(){
		print("BaseExtend");
	}
	void fun(int i){
		print("BaseExtend Integer");
	}
}
class TestExtend2 extends BaseExtend{
	 void fun(){
		print("TestExtend2");
	}
	 /*@Override*/ void fun(int i){
		print("TestExtend2 Integer");
	}
}

public class TestExtend  extends TestExtend2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExtend2 te2=new TestExtend2();
		te2.fun();
		te2.fun(0);
		TestExtend te=new TestExtend();
		te.fun();
	} 
	/*@Override*/ void fun(){
		super.fun(0);;
		print("TestExtend");
	}
	/*@Override*/ void fun(int i){
		print("TestExtend Integer");
	}
	

}
