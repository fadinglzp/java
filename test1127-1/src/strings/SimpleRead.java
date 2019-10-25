package strings;
import java.io.*;
import static lzp.tools.*;
public class SimpleRead {
	public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camlot\n22 1.61803"));
//	public static BufferedReader input = new BufferedReader(new StringReader(""));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			print("what's your name?");
			String name=input.readLine();
			print(name);
			print("How old are you? what's ypur favourite double?");
			print("input: age  number");
			String numbers=input.readLine();
			print(numbers);
			String[] numArray = numbers.split(" ");
			int age = Integer.parseInt(numArray[0]);
			double favourite = Double.parseDouble(numArray[1]);
			print(String.format("Hi %s.\n", name));
			print(String.format("In 5 years you will be %d \n", age+5));
			print(String.format("My favourite double is %f", favourite*10));
			
		}catch(IOException e){
			print("IO Exception");
		}

	}

}
