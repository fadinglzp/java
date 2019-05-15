package statickuai;
import static lzp.tools.*;
interface Instrument{
	void adjust();
}
interface Playable{
	void paly();
}
class Wind implements Instrument,Playable{
	public void adjust(){
		print("adjust");
	}
	public void paly(){
		print("paly wind");
	}
}



public class Interface901 {
static void tune(Playable p){
	p.paly();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable p = new Wind();
		tune(p);
	}

}
