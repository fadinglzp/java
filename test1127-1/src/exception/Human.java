package exception;
import static lzp.tools.*;
class Annoyance extends Exception{}
class Sneeze extends Annoyance{}
public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new Sneeze();
		}catch(Annoyance a){
			print("Caught Annoyance");
		}
	}

}
