package strings;
import java.util.*;
import static lzp.tools.*;
public class Splitting {
	public static String knights = "then , when you have...n n n n n 123";
	public static void split(String regex){
	//	System.out.println(Arrays.toString(knights.split(regex)));
		print(knights.split(regex));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		split(" ");
		split("\\W+");
		split("n\\W+");
		print(knights.replaceFirst("h\\w+", "123123"));
		print(knights.replaceAll("when|\\.\\.\\.", "11111"));
		
		for(String s : new String[]{"Abcdefg","[Aa]bcdefg","[Aa][bdfgfd][a-z]d.+","A.*","A[a-z]+"})
		{
			print("Abcdefg".matches(s));
		}

	}

}
