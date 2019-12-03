package typeinfo;
import static lzp.tools.*;
import lzp.TypeCounter;
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy{
	Toy(){}
	Toy(int i){}
	public String fun()
	{
		return "Toy fun()";
	}
	public String toString(){
		return "Toy";
	}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
	FancyToy(){super(1);}
	public String toString(){
		return "FancyToy";
	}
	public String fun(){
		return "FancyToy fun()";
	}
}
class Toy3 extends FancyToy{
	
}
public class ToyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c=null;
		try{
			c=Class.forName("typeinfo.FancyToy");
		}catch(ClassNotFoundException e){
			print("can't find FancyToy");
			System.exit(1);
		}
		printinfo(c);
//		print(c.getName());
//		print(c.isInterface());
//		print(c.getSimpleName());
		for(Class face : c.getInterfaces()){
			printinfo(face);
		}
		Class up =c.getSuperclass();
		Object obj =null;
		Object obj2=null;
		try{
			obj=up.newInstance();
			obj2=c.newInstance();
		}catch(InstantiationException e){
			print("Cannot Instantiate");
			System.exit(1);
		}catch(IllegalAccessException e){
			print("Cannot access");
			System.exit(1);
		}
		print(obj.toString());
		print(((FancyToy) obj2).fun());
		print(((Toy)obj2).fun());
		print(obj2.getClass().getSimpleName());
		printinfo(obj.getClass());
		print("------------------------------");
		TypeCounter tc =new TypeCounter(Toy.class);
		tc.count(new Toy());
		tc.count(new FancyToy());
		tc.count(new Toy3());
		print(tc);
		
		
	}
	

}
