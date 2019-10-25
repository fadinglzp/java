package exception;
import static lzp.tools.*;
class FourException extends Exception{}
public class AlwaysFinally {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Entering first try block");
		try{
			print("Entering second try block");
			try{
				throw new FourException();
				
			}finally{
				print("finally in second try block");
			}
		}catch(FourException e){
			print("Caught FourException in first try block");
		}finally{
			print("finally in first try block");
		}
	}

}
