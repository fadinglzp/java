package exception;
import static lzp.tools.*;

class OneException extends Exception{
	public OneException(String s){super(s);}
}
class TwoException extends Exception{
	public TwoException(String s){
		super(s);
	}
}
public class Rethrowing {
	public static void f2() throws OneException{
		print("originating the exception in f2()");
		throw new OneException("throw from f2()");
	}
	public static void f() throws Exception{
		print("originating the exception in f()");
		throw new Exception("throw from f()");
	}
	public static void g() throws Exception{
		try{
			f();
		}catch(Exception e){
			print("inside g()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	public static void h() throws Exception{
		try{
			f();
		}catch(Exception e){
			print("inside h()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//			g();
//		}catch(Exception e){
//			print("main");
//			e.printStackTrace(System.out);
//		}
//		print();
//		try{
//			h();
//		}catch(Exception e)
//		{
//			print("main");
//			e.printStackTrace(System.out);
//		}
		try{
		try{
			f2();
			
		}catch(OneException e){
			print("Caught in inner try");
			e.printStackTrace(System.out);
			throw new TwoException("from inner try");
		}
		}catch(TwoException e){
			print("Caught in outer try");
			e.printStackTrace(System.out);
		}
	}

}
