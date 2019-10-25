package strings;
import java.util.*;
import static lzp.tools.*;

public class RepalycingStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="But I'm not dead yet! I feel happy!";
		StringTokenizer stoke = new StringTokenizer(input);
		while(stoke.hasMoreElements()){
			printl(stoke.nextToken()+" ");
		}
		print();
		print(Arrays.toString(input.split(" ")));
		Scanner sc = new Scanner(input);
		while(sc.hasNext()){
			printl(sc.next()+" ");
		}
		sc.close();
	}

}
