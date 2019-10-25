package typeinfo;
import java.util.*;
import lzp.*;
import static lzp.tools.*;
public interface Robot {
	String name();
	String model();
	List<Operation> operations();
	class Test{
		public static void test(Robot r){
			if(r instanceof Null)
				print("[Null Robot]");
			print("Robot name: "+r.name());
			print("Robot model: "+r.model());
			for(Operation o:r.operations())
			{
				print(o.description());
				o.command();
			}
		}
	}
}
