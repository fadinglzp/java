package exception;

import static lzp.tools.*;
class MyException extends Exception{
	public MyException(){}
	public MyException(String msg){super(msg);}
}


public class FullConstruction {

	public static void f()throws MyException{
		print("Throwing MyException from f()");
		throw new MyException();
	}
	public static void g() throws MyException{
		print("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			f();
			
		}catch(Exception e){
			e.printStackTrace(System.out);
		//	e.printStackTrace(System.err);
		//	print(e);
		}
		try{
			g();
		}catch(Exception e){
			e.printStackTrace(System.out);
		//	e.printStackTrace(System.err);
		//	print(e);
		//	print(e.getStackTrace());
		//	System.err.println(e.getStackTrace());
		}
	}

}
