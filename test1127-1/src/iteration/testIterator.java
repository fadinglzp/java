package iteration;
import static lzp.tools.*;
import java.util.*;
import testclass.*;
//interface TestArrayListA{
//	void funa();
//};

//class Apple implements TestArrayListA{
//	void fun1(){
//		print("Apple");
//	}
//	public void funa(){
//		print("1");
//	};
//	public String toString()
//	{
//		return "an Apple";
//	}
//}
//
//class Peach extends Apple{
//	void fun2(){
//		print("Peach");
//	}
//	public void funa(){
//		print("2");
//	};
//	public String toString()
//	{
//		return "a Peach";
//	}
//}

public class testIterator {
	public static void display(Iterator it){
		while(it.hasNext()){
			print(it.next().toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> a=new ArrayList<Apple>();
		for(int i=0;i<3;i++) a.add(new Apple());
		ArrayList<Peach> p =new ArrayList<Peach>();
		for(int i=0;i<3;i++) p.add(new Peach());
		Object[] o=a.toArray();
		print(o[1]);
		Peach[] ps= p.toArray(new Peach[1]);
		print(ps);
		display(a.iterator());
		display(p.iterator());
		
	}

}
