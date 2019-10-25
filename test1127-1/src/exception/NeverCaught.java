package exception;
import static lzp.tools.*;
class ThreeException extends Exception{}

public class NeverCaught {
	static void f()
	{
		throw new RuntimeException("From f()");
	}
	static void g()
	{
		f();
	}
	static int count =0,i=0;
	public static void main(String[] args){
	//	g();
		while(true){
			try{
				if(count++==0)
					print(count);
					throw new ThreeException();
			}catch(ThreeException e){
				print("ThreeException");
			}finally{
				print("In finally clause");
				if(count==2) break;
			}
		}
	}
}
