package exception;
import static lzp.tools.*;
class VeryImportantException extends Exception{
	public String toString(){
		return "A very important exception";
	}
}
class HoHumException extends Exception{
	public String toString(){
		return "A trivial exception";
	}
}
public class LostMessage {
	void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException{
		throw new HoHumException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			}finally{
				//lm.dispose();
				return;
			}
		}catch(Exception e){
			//print(e);
			e.printStackTrace(System.out);
		}

		
		
		
		
	}

}
