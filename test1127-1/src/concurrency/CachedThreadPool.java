package concurrency;

import java.util.concurrent.*;

class LiftOff1 implements Runnable {
	private static int count=1;
	private final int id=count++;
	public void run() {
		while (true) {
			System.out.print(id);
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class CachedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff1());
		exec.shutdown();
	}

}
