package generics;
import java.util.*;
import static lzp.tools.*;

class Fruit {
	public String name() {
		return this.getClass().getSimpleName();
	}
	public String toString() {
		return this.getClass().getSimpleName();
	}
};

class Apple extends Fruit {
//	public String toString() {
//		return "Apple";
//	}
}

class Jonathan extends Apple {
//	public String toString() {
//		return "Jonathan";
//	}
}

class Orange extends Fruit {

}

public class CovariantArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Fruit> lf=new ArrayList<Apple>();
		List<? extends Fruit> lf=new ArrayList<Apple>();
		List<Fruit> lf3=new ArrayList<Fruit>();
		print(lf3.getClass().getSimpleName());
//		lf.add(new Apple());
		
		List<? extends Fruit> lf2=Arrays.asList(new Apple());
		Apple a=(Apple)lf2.get(0);
	//	lf2.add(a);
		print(lf2.getClass().getSimpleName());
		print(a);
		print(lf2.contains(a));
		print(lf2.indexOf(a));
		Number[] num=new Integer[10];
		num[1]=1;
		List<?extends Number> ln=new ArrayList<Integer>();
	//	ln.add(1);
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		print(fruit[1].getClass().getSimpleName());
		print(fruit[1]);
		print(fruit[1].name());
		try {
			fruit[2]=new Fruit();
		}catch(Exception e) {
			print(e);
		//	e.printStackTrace();
		}
		try {
			fruit[3]=new Orange();
			
		}catch(Exception e) {
			print(e);
		}
	}

}
