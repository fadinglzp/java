package typeinfo;
import static lzp.tools.*;
class Candy{
	static {print("Loading Candy");}
}
class Gum{
	static{
		print("Loading Gum");
	}
}
class Cookie{
	static {
		print("Loading Cookie");
	}
}
public class Sweetshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("inside main");
		new Candy();
		print("After creating Candy");
		try{
			Class.forName("typeinfo.Gum");
		}catch(ClassNotFoundException e){
			print("Cannot find Gum");
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After creating Cookie");

	}

}
