package inheriting;
import  static lzp.tools.*;

class MyException2 extends Exception{
	private int x;
	public MyException2(){}
	public MyException2(String msg){super(msg);}
	public MyException2(String msg,int x){
		super(msg);
		this.x=x;
	}
	public int val(){return x;}
	public String getMessage(){
		return "Detail Message: "+x+" "+super.getMessage();
	}
}

public class ExtraFeature {
	public static void f() throws MyException2{
		print("Throwing MyException2 from f()");
		throw new MyException2();
	}
	public static void g() throws MyException2{
		print("Throwing MyException2 from g()");
		throw new MyException2("Originated in g()");
	}
	public static void h() throws MyException2{
		print("Throwing MyException2 from h()");
		throw new MyException2("Originated in h()",42);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			f();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
		}
		try{
			h();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
			print("e.val() = "+e.val());
			print(e.getClass());
			print(e.getClass().getName());
			print(e.getClass().getSimpleName());
		}
	}

}
