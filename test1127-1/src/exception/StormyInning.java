package exception;
import static lzp.tools.*;
class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
	public Inning() throws BaseballException{}
	public void event() throws BaseballException{}
	public abstract void atBat() throws Strike,Foul;
	public void walk(){
		
	}
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class RainedOut2 extends StormException{}
class PopFoul extends Foul{}
interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut2;
}



public class StormyInning extends Inning implements Storm {
	public StormyInning () throws RainedOut,BaseballException{}
	public StormyInning (String s) throws Foul,BaseballException{}
	public void event(){}
	public void rainHard() throws RainedOut2{}
	public void atBat() throws PopFoul{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			StormyInning si=new StormyInning();
			si.atBat();
		}catch(PopFoul e){
			print("Pop Foul");
		}catch(RainedOut e){
			print("Rained out");
		}catch(BaseballException e){
			print("Baseball");
		}
		try{
			Inning i=new StormyInning();
			i.atBat();
		}catch(Strike e){
			print("Strike");
		}catch(Foul e){
			print("Foul");
		}catch(RainedOut e){
			print("rained out");
		}catch(BaseballException e){
			print("BaseballException");
		}
	}


}
