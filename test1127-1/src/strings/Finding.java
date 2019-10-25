package strings;
import java.util.regex.*;
import static lzp.tools.*;

public class Finding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of linnet's wings");
		while(m.find())
			printl(m.group()+" ");
		print();
		int i=0;
		while(m.find(i)){
			printl(m.group()+" ");
			i++;
		}

	}

}
