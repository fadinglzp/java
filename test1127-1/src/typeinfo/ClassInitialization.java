package typeinfo;
import java.util.*;
import static lzp.tools.*;
class Initable{
//	static final int staticFinal =42;
//	static  int staticFinal =42;
//	 final int staticFinal =42;
	static final int staticFianl2 =ClassInitialization.rand.nextInt(1000);
	static{
		System.out.println("Initializing Initable");
	}
	static final int staticFinal =42;
}
class Initable2{
	static int staticNonFinal = 147;
	static{
		System.out.println("Initializing Initable2");
	}
}
class Initable3{
	static int staticNonFinal = 74;
	static{
		System.out.println("Initializing Initable3");
	}
}
public class ClassInitialization {
	public static Random rand = new Random(42);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class initable =Initable.class;
		printinfo(initable);
		System.out.println("After creating Initable ref");
		print(Initable.staticFinal);
		print(Initable.staticFianl2);
		print(Initable2.staticNonFinal);
		try {
			Class initable3 =Class.forName("typeinfo.Initable3");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print("After creating Initable3 ref");
		print(Initable3.staticNonFinal);
		String s1="Hello";
		String s2=new String("Hello");
		String s3="H"+"ello";
		String s4="H"+new String("ello");
		String s5="H";
		String s6="ello";
		String s7=s5+s6;
		print(s1==s3);
		print(s1==s4);
		print(s1.equals(s2));
		print(s1.equals(s4));
		print(s1==s7);
		print(s1.equals(s7));
		print(s1==s2);
	}

}
