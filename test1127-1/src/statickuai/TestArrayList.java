package statickuai;
import java.util.*;
import static lzp.tools.*;
interface TestArrayListA{
	void funa();
};

class Apple implements TestArrayListA{
	void fun1(){
		print("Apple");
	}
	public void funa(){
		print("1");
	};
	public String toString()
	{
		return "an Apple";
	}
}

class Peach extends Apple{
	void fun2(){
		print("Peach");
	}
	public void funa(){
		print("2");
	};
	public String toString()
	{
		return "a Peach";
	}
}

public class TestArrayList {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Apple> a=new ArrayList<Apple>(Arrays.asList(new Apple()));
		a.add(new Apple());
		a.add(new Peach());
		a.get(0).fun1();
		Peach p =(Peach) a.get(2);
		p.fun2();
		((Peach)a.get(2)).fun2();
		ArrayList<TestArrayListA> ta=new ArrayList<TestArrayListA>();
		ta.add(new Apple());
		ta.add(new Peach());
		for(TestArrayListA c : ta)
		{
			c.funa();
		}
		((Peach)ta.get(1)).fun2();
		//ArrayList<TestArrayListA> p1=new ArrayList<Peach>();
		//ta=(ArrayList<TestArrayListA>)a;
		Apple[] a1=new Apple[3];
		for(int i=0;i<3;i++)
		{
			a1[i]=new Apple();
		}
		
		Collection<Apple> c=new ArrayList<Apple>(Arrays.asList(a1));
		Collections.addAll(c, a1);https://www.panda.tv/myfollow?channel=web_pgc-pgc_pk5-ch_wqhg
		for(Apple ac : c){
			ac.fun1();	
		}

	
		
	}

}
