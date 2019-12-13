package concurrency;

import java.util.concurrent.*;
import static lzp.tools.*;

class ADaemon implements Runnable{
	public void run(){
		try{
			print("Starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			print("Exiting via InterruptedException");
		}finally{
			print("This should always run?");
		}
	}
}

public class DaemonsDontRunFinally {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread t=new Thread(new ADaemon());
		t.setDaemon(true);
		t.start();
	}

}
