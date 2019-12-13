package concurrency;
import java.util.concurrent.*;

public class NaiveExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ExecutorService exec=Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		}catch(RuntimeException e){
			System.out.print("Exception");
		}
	}

}
