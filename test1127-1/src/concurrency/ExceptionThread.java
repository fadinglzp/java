package concurrency;
import java.util.concurrent.*;

public class ExceptionThread implements Runnable {

	public void run(){
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}

}
