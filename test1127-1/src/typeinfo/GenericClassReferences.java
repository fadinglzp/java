package typeinfo;
import static lzp.tools.*;


public class GenericClassReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class intClass =int.class;
		Class <Integer> genericIntClass =int.class;
		genericIntClass =Integer.class;
//		genericIntClass = String.class;
		intClass = double.class;
		System.out.println(int.class==Integer.class);
		printinfo(int.class);
		printinfo(Integer.class);
		Class<? extends Number> bounded = int.class;
		bounded=double.class;
		printinfo(bounded);
	}

}
