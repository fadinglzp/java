package concurrency;
import java.util.concurrent.*;
import lzp.*;
import static lzp.tools.*;

public class DaemonFromFactory implements Runnable {

	public void run(){
		try{
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread()+" "+this);
			}
		}catch(InterruptedException e){
			print("Interrupted");
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService exec=Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i=0;i<10;i++)
			exec.execute(new DaemonFromFactory());
		print("All daemons started");
		TimeUnit.MILLISECONDS.sleep(150);
	}

}
