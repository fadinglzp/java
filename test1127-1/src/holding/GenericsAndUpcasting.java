package holding;
import java.util.*;
import static lzp.tools.*;
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
class GenericApple{
	public static Apple getApple()
	{
		Apple a=null;
		Random rand=new Random();
		switch (rand.nextInt(4)){
		case 1 : a=new GrannySmith();break;
		case 2: a=new Gala();break;
		case 3: a=new Fuji();break;
		default: a=new Braeburn();break;
		}
		
			
		return a;
	}
	public static ArrayList<Apple> getApple(int i)
	{
		ArrayList<Apple> a=new ArrayList<Apple>();
		Random rand=new Random();
		for(int t=0;t<i;t++)
		switch (rand.nextInt(4)){
		case 1 :a.add(new GrannySmith());break;
		case 2: a.add(new Gala());break;
		case 3:a.add(new Fuji());break;
		default: a.add(new Braeburn());break;
		}	
		return a;
	}
}
public class GenericsAndUpcasting {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<Apple> apples =new ArrayList<Apple>();
//		apples.add(new GrannySmith());
//		apples.add(new Gala());
//		apples.add(new Fuji());
//		apples.add(new Braeburn());
		for (int i=0;i<10;i++)
			apples.add(GenericApple.getApple());
		for(Apple a : apples){
			print(a);
		}
	}

}
