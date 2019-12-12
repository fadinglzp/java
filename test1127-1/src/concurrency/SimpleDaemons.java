package concurrency;

import java.util.concurrent.TimeUnit;
import static lzp.tools.*;

public class SimpleDaemons implements Runnable {

	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread());
			//	print(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			print("sleep() interruped");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);
			daemon.start();
		}
		print("All daemons started");
		TimeUnit.MILLISECONDS.sleep(505);
	}

}
