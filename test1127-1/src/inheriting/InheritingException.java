package inheriting;
class SimpleException extends Exception {

}

public class InheritingException {
	public void f() throws SimpleException{
		System.out.println("throws SimpleException from f()");
		throw new SimpleException();
	}
	public static void main(String[] args){
		InheritingException sed = new InheritingException();
		try{
			sed.f();
		}catch(SimpleException e)
		{
			e.printStackTrace();
			System.out.println("caught");
		//	e.printStackTrace(System.out);
		}
		
	}
}