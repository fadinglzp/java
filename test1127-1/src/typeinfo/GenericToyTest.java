package typeinfo;
import static lzp.tools.*;

public class GenericToyTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<FancyToy> ftClass =FancyToy.class;
		FancyToy fancytoy=ftClass.newInstance();
		print(fancytoy);
		printinfo(fancytoy.getClass());
//		Class<? super FancyToy> up=ftClass.getSuperclass();
		Class<?> up=ftClass.getSuperclass();
//		Class<Toy> up=(Class<Toy>) ftClass.getSuperclass();
//		Object obj =up.newInstance();
		Toy obj =(Toy) up.newInstance();
		print(obj);
		printinfo(obj.getClass());
		Toy t1=fancytoy;
		printinfo(t1.getClass());

	}


}
