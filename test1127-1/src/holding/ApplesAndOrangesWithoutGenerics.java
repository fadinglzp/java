package holding;
import java.util.*;
import static lzp.tools.*;
class Baseclass{
	public void id3(){}
}
abstract class Basement1{
	abstract public long id();
}
interface Baseinterface{
	public long id2();
}
class Apple extends Basement1 implements Baseinterface{
	private static long countter;
	private final long id=countter++;
	public long id(){
		return id;
	}
	public long id2() {
		return id;
	}
}
//class Orange extends Basement1 implements Baseinterface{
//class Orange extends Apple{
class Orange{
//	public long id(){return 999;}
	public long id2(){return 998;}
}
public class ApplesAndOrangesWithoutGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList apples=new ArrayList();
		ArrayList apples2=new ArrayList<Apple>();
		ArrayList<Apple> apples3=new ArrayList<Apple>();
		ArrayList<Apple> apples4=new ArrayList();
		for(int i=0;i<3;i++)
		{
		//	apples.add(new Apple());
			apples2.add(new Apple());
		//	apples3.add(new Apple());
			apples4.add(new Apple());
		}
//		apples.add(new Orange());
		apples2.add(new Orange());
//		apples3.add(new Orange());
//		apples4.add(new Orange());
		for(int i=0;i<apples4.size();i++)
		{
			print(((Apple) apples4.get(i)).id());
		//	print(((Baseinterface)apples.get(i)).id2());
		}
	}

}
