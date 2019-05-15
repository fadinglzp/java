package inheriting;
import static lzp.tools.*;
import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception{
	private static Logger oblogger = Logger.getLogger("LoggingException"); 
	public LoggingException(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		print("print "+trace);
		oblogger.severe(trace.toString()+"test");
	}
}

public class loggingexceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new LoggingException();
		}catch(LoggingException e){
			System.err.println("Caught " + e);
			System.out.println("out1 "+e);
		}
		try{
			throw new LoggingException();
			
		}catch(LoggingException e){
			System.err.println("Caught2 "+e);
		
		}
	}

}
