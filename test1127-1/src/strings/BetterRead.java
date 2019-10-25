package strings;
import java.util.*;
import static lzp.tools.*;

public class BetterRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(SimpleRead.input);
		print("what's your name?");
		String name =stdin.nextLine();
		print(name);
		print("how old are you? what's your favourite double?");
		print("input: <age> <double>");
		int age =stdin.nextInt();
		double favourite = stdin.nextDouble();
		print(age);
		print(favourite);
		stdin.close();
		
	}

}
