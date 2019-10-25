package strings;
import java.util.*;
import static lzp.tools.*;
//scanner ×ösplit


public class Scanner_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =new String("12, 42, 78, 99,asd,faf,lkldf");
		Scanner scanner = new Scanner(s);
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
		scanner.close();
		System.out.println("----------------------");
		System.out.println(Arrays.toString(s.split("\\s*,\\s*")));
		print(s.split("\\s*,\\s*"));
		String[] s1=s.split("\\s*,\\s*");
		print(s1);
		
	}

}
