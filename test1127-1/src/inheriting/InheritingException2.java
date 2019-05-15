package inheriting;
class SimpleException2 extends Exception {
	
	public SimpleException2(String msg){
		super(msg);
	}
	
}
class ArrayIndexOutOfBoundsException extends Exception{
	private String s;
	public ArrayIndexOutOfBoundsException(String msg){
		super(msg);
		s=msg;
	}
	public String gets(){
		return s;
	}
}
public class InheritingException2 {
	public void f() throws SimpleException2{
		System.out.println("throws SimpleException from f()");
		throw new SimpleException2("f()内存溢出");
	}
	public void f2() throws ArrayIndexOutOfBoundsException{
		throw new ArrayIndexOutOfBoundsException("指针溢出");
	}
	public static void main(String[] args){
		InheritingException2 sed = new InheritingException2();
		InheritingException2 sed2=null;
		int[] i =new int[10];
		int j = 13;
		boolean t=true;
		while(t){
		try{
			i[--j]=1;
		//	sed.f2();
		}
//		catch(ArrayIndexOutOfBoundsException e){
//			e.printStackTrace(System.out);
//			System.out.println(e.gets());
//		}
		catch(Exception e){
			e.printStackTrace(System.out);
//			System.out.println("catch2");
			t=!t;
			System.out.println(t);
		}
		finally{
			t=!t;
		}
		}
		System.out.println("done");
		
		
		
		
		
		
		
		
		
		
//		try{
//			sed.f();
//			sed2.f();
//		}catch(SimpleException2 e)
//		{
//			e.printStackTrace(System.out);
//			System.out.println("caught");
//		}
//		catch(Exception e){
//			e.printStackTrace(System.out);
//			System.out.println("caught2");
//		}
//		finally{
//			System.out.println("finally");
//		}
//		
//		try{
//			sed2.f();
//			sed.f();
//		}catch(SimpleException2 e)
//		{
//		//	e.printStackTrace();
//			e.printStackTrace(System.out);
//			System.out.println("caught");
//			
//		}
//		catch(Exception e){
//			e.printStackTrace(System.out);
//			System.out.println("caught2");
//		}
//		finally{
//			System.out.println("finally");
//		}
		
	
		
	}
}