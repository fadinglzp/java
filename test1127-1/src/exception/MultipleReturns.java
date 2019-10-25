package exception;
import static lzp.tools.*;

public class MultipleReturns {
	public static void f(int i){
		print("Initialization that requires cleanup");
		try{
			print("point 1");
			if(i==1) return;
			print("point 2");
			if(i==2)return;
			print("point 3");
			if(i==3) return;
			print("End");
			return;
		}finally{
			print("performing cleanup");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++)
			f(i);
	}

}
