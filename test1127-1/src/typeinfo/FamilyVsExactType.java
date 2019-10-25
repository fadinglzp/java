package typeinfo;
import static lzp.tools.*;
class Base{}
class Derived extends Base{}
public class FamilyVsExactType {
	static void test(Object x){
		print("Testing x of type "+x.getClass());
		print("X instanceof Base "+ (x instanceof Base));
		print("X instanceof Derived "+(x instanceof Derived));
		print("Base.isInstance(X) "+Base.class.isInstance(x));
		print("Derived.isInstance(X) "+Derived.class.isInstance(x));
		print("x.getClass()==Base.class "+(x.getClass()==Base.class));
		print("x.getClass()==Derived.class "+(x.getClass()==Derived.class));
		print("x.getClass().equals(Base.class) "+(x.getClass().equals(Base.class)));
		print("x.getClass().equals(Derived.class) "+(x.getClass().equals(Derived.class)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new Base());
		print("------------------------------------");
		test(new Derived());
	}

}
