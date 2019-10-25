package exception;
import java.util.logging.*;
import java.io.*;
import static lzp.tools.*;
class LoggingException extends Exception{
	private static Logger logger=Logger.getLogger("LoggingException");
	public LoggingException()
	{
		StringWriter trace =new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	
	}
}
class LoggingException2 {
	private static Logger logger=Logger.getLogger("LoggingException2");
	static void logException(Exception e){
		StringWriter trace=new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
class MyException2 extends Exception{
	private int x;
	public MyException2(){
		
	}
	public MyException2(String msg){
		super(msg);
	}
	public MyException2(String msg,int x){
		super(msg);
		this.x=x;
	}
	public int val(){return x;}
	public String getMessage(){
		return "Detail Message:"+x+" "+super.getMessage();
	}
}
class MyExceptionExtend extends MyException2{
	private int j;
	public MyExceptionExtend(String msg,int x,int j){
		//MyException2(msg,x);
		this.j=j;
	}
}

public class LoggingExceptions {
	public static void f() throws MyException2{
		print("Throwing MyException2 from f()");
		throw new MyException2();
	}
	public static void g()throws MyException2{
		print("Throwing MyException2 form g()");
		throw new MyException2("Originated in g()");
	}
	public static void h() throws MyException2{
		print("Throwing MyException2 from h()");
		throw new MyException2("Originated in h()",42);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//			throw new LoggingException();
//		}catch(LoggingException e){
//			print("Caught"+e);
//		}
//		try{
//			throw new LoggingException();
//		}catch(LoggingException e){
//			print("Caught"+e);
//		}
		
		
//		try{
//			throw new NullPointerException();
//		}catch(NullPointerException e){
//			//print("Caught"+e);
//			LoggingException2.logException(e);
//		}
		
		
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
			print(e.val());
		}
	}



}
