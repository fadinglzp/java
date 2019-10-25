package strings;
import java.io.*;
import java.util.*;
import static lzp.tools.*;
class DatebaseException extends Exception{
	public DatebaseException(int transactionID, int queryID, String message)
	{
		super(String.format("(t%d,q%d) %s",transactionID,queryID,message));
	}
	public static void fun(int transactionID, int queryID, String message) throws DatebaseException{
		throw new DatebaseException( transactionID,  queryID, message);
	}
}

public class Turtle {
	private String name;
	private Formatter f;
	public Turtle(String name, Formatter f){
		this.name = name;
		this.f=f;
		
	}
	public void move(int x,int y){
		f.format("%s The Turtle is at (%d,%d)\n", name,x,y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = System.err;
		Turtle tommy = new Turtle("tommy",new Formatter(ps));
		Turtle terry = new Turtle("terry",new Formatter(System.out));
		tommy.move(1, 2);
		terry.move(-1, -2);
		tommy.move(3, 4);
		terry.move(5, 6);
		print("-------------------------");
		
		try{
			throw new DatebaseException(3,7,"writer failed");
		}catch(DatebaseException e){
			print(e);
		}
		
		try{
			DatebaseException.fun(3, 7, "Reader failed");
		}catch(DatebaseException e){
			print(e);
		}
		print(String.format("%s The Turtle is at (%d,%d)\n", "a",1,1));
	}

}
