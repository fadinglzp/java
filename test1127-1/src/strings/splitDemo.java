package strings;
import java.util.regex.*;
import java.util.*;
import static lzp.tools.*;


public class splitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This!!unusual use!!of exclamation!!points";
		print(Arrays.toString(Pattern.compile("!!").split(input)));
		print(Arrays.toString(Pattern.compile("!!").split(input,3)));
		print(input.split("!!"));
		print(input.split("!!",3));
		

	}

}
