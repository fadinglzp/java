package statickuai;
import static  lzp.tools.*;



class Cup{
	int i;
	Cup(int i){
		System.out.println("cup "+i);
		this.i=i;
	}
	void fun(int i){
		System.out.println(i);
	}
	void fun2(){
		print(i);
		i++;
		}
}

class Cups{
	static Cup cup1;
	static Cup cup2;
	Spiciness degree;
	static {
		
		cup2=new Cup(2);
		cup1=new Cup(1);
	}
	Cups(){
		System.out.println("Cups");
	}
	public void fun1(Spiciness degree){
		this.degree=degree;
	}
	public void fun2()
	{
		print(degree);
	}
}


public class test1 {

	public static void main(String[] args) {
		char[] a={'a','b','c'};
		long l1=23;
		byte b1=2;
		float f=3.14f;
		int	i=2;
		int[] i1={1,2,3};
		char b='d';
		Cups cp1=new Cups();
		cp1.fun1(Spiciness.A);
		cp1.fun2();
		cp1.cup2.fun2();
		cp1.cup2.fun2();
		Cups cp2 = new Cups();
		cp2.cup2.fun2();
		cp1.cup2.fun2();
		cp2.fun2();
		Cups.cup1.fun(9);
		print("123");
		print(new Object[]{"efg",l1,b1});
		print(34);
		print(String.valueOf(a),i,f);
		print(b);
		Integer[] i2={1,2};
//		Integer[] i2=(Integer[]) i2;
		Integer i3=(Integer)i;
		Character[] a2={'e','f','g'};
		//print(i1.getClass());
		print(i2);
		print(a);
		print(a2);
	//	print((Object[])new Integer[]{});
		//print((Object[])new Character[]{'1','2','3','4'});
	}
}


