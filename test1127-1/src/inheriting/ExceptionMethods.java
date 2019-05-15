package inheriting;
import static lzp.tools.*;


public class ExceptionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new Exception("MyException");
		}catch(Exception e){
			print("Caught Exception");
			print(e.getClass());
			print(e.getClass().getName());
			print(e.getClass().getSimpleName());
			print("getMessage()"+ e.getMessage());
			print("getLocalizedMessage()"+ e.getLocalizedMessage());
			print("toString()"+e.toString());
			print("printStackTrace()");
			e.printStackTrace(System.out);
		}

	}

}
