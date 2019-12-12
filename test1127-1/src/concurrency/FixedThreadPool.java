package concurrency;
import java.util.concurrent.*;
import static lzp.tools.*;

public class FixedThreadPool {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ExecutorService exec=Executors.newFixedThreadPool(1);
		long start=System.nanoTime();
		for(int i=0;i<10000000;i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	//	long end=System.nanoTime();
	//	TimeUnit.MILLISECONDS.sleep(1000);
		print("\n\n"+(LiftOff.end-start)/1000000+"\n");
	}

}
