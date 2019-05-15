package inheriting;
class OneException extends Exception{
	public OneException(String s){
		super(s);
	}
}
class TwoException extends Exception{
	public TwoException(String s){
		super(s);
		
	}
}

public class RethrowNew {
	public static void f()throws OneException{
		System.out.println("Originating the exception in f()");
		throw new OneException("throw from f()");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			try{
				f();
			}
			catch(OneException e){
				System.out.println("Caught in inner try, e.printStackTrace");
				e.printStackTrace(System.out);
				System.out.println("------------------------------------------");
				throw new TwoException("from inner try");
			}
		}catch(Exception e){
			System.out.println("Caught in outer try, e.printStackTrace");
			e.printStackTrace(System.out);
		}

	}

}
