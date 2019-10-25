package iteration;
import java.util.*;
import static lzp.tools.*;
public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Character> l1=Arrays.asList('A','b','C','d','E','F','g','H','i');
		Set<String> setT1 =new TreeSet<String>();
		Set<Character> setT2 =new TreeSet<Character>(l1);
		//Set<Character> setT2 =new TreeSet<Character>(Arrays.asList('A','b','C','d','E','F','g','H','i'));
		Set<String> setH1 =new HashSet<String>();
		Set<String> setH2 =new HashSet<String>();
		Set<Character> setH3 =new HashSet<Character>(Arrays.asList('A','b','C','d'));
		Collections.addAll(setT1, "A,b,C,d,EE,F,g,HH,i".split(","));
		//Collections.addAll(setT2, l1);
		Collections.addAll(setH1, "A,b,C,d,EE,F,g,HH,i".split(","));
		Collections.addAll(setH2, "A,b,C,d".split(","));
		print(setT1);
		print(setT2);
		print(setH1);
		print(setT1.containsAll(setH2));
		print(setH1.containsAll(setH2));
		print(setT2.containsAll(setH3));
	}

}
