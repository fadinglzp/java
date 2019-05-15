package inheriting;

public class whoCalled {
	static void f(){
		try{
			throw new Exception();
			
		}catch(Exception e){
			for(StackTraceElement ste : e.getStackTrace()){
				System.out.println(ste.getMethodName());
				
				System.out.println(ste.toString());
				System.out.println(".....................");
			}
				
		//	e.printStackTrace(System.out);
		}
	}
	static void g(){
		f();
	}
	static void h(){
		g();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
		System.out.println("------------------------------");
		g();
		System.out.println("------------------------------");
		h();
		System.out.println("------------------------------");

	}

}
