package exception;

import static lzp.tools.*;

class NeedsCleanup {
	private static long counter = 1;
	private final long id = counter++;

	public void dispose() {
		print("NeedsCleanup " + id + " disposed");
	}
}

class ConstructionException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {
	public NeedsCleanup2() throws ConstructionException {
	};
}

public class Cleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//			InputFile in=new InputFile("C:/javaGithub/test1127-1/src/exception/Cleanup.java");
//			try{
//				String s;
//				int i=1;
//				while((s=in.getLine())!=null);
//			}catch(Exception e){
//				print("Caught Exception in main");
//				e.printStackTrace();
//			}finally{
//				in.dispose();
//			}
//		}catch(Exception e){
//			print("InputFile construction failed");
//		}
		
		
		NeedsCleanup nc1=new NeedsCleanup();
		nc1.dispose();
		
		NeedsCleanup nc2=new NeedsCleanup();
		NeedsCleanup nc3=new NeedsCleanup();
		
		nc3.dispose();
		nc2.dispose();
		
		try{
			NeedsCleanup2 nc4=new NeedsCleanup2();
			try{
				NeedsCleanup2 nc5=new NeedsCleanup2();
				try{}
				finally{
					nc5.dispose();
				}
			}catch(ConstructionException e){
				print(e);
			}finally{
				nc4.dispose();
			}
		}catch(ConstructionException e){
			print(e);
		}
		
		
		
		
	}

}
