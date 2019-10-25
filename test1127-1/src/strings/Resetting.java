package strings;
import java.util.regex.*;
import static lzp.tools.*;


public class Resetting {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Matcher m =Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
		while(m.find())
			printl(m.group()+" ");
		print();
		while(m.find())
			printl(m.group()+" ");
		print();
		m.reset();
		while(m.find())
			printl(m.group()+" ");
		print();
		m.reset("fix the rig with rags");
		while(m.find())
			printl(m.group()+" ");
	}

}
