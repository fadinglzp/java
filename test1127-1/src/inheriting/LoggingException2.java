package inheriting;
import java.util.logging.*;
import java.io.*;
import static lzp.tools.*;

public class LoggingException2 {
	private static Logger logger=Logger.getLogger("LoggingException2");
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		print(trace);
		logger.severe(trace.toString());
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new NullPointerException();
		}catch(NullPointerException e){
			logException(e);
			print(e.getClass());
			print(e.getClass().getName());
			print(e.getClass().getSimpleName());
		}
		try{
			throw new NullPointerException();
		}catch(Exception e){
			logException(e);
			print(e.getClass());
			print(e.getClass().getName());
			print(e.getClass().getSimpleName());
		}
	}

}
