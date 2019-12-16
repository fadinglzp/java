package concurrency;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class AtomicityTest implements Runnable {
	private static Lock lock = new ReentrantLock();

	private static int i = 0;

	public synchronized int getValue() {
		synchronized(this.getClass()){
		return i;}
	}

	private synchronized void evenIncrement() {
	//	if (lock.tryLock()) {
		synchronized(this.getClass()){
				i++;
				// try {
				// TimeUnit.MILLISECONDS.sleep(20);
				// } catch (InterruptedException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				Thread.yield();
				i++;
			}
	//	}
	}

	public void run() {
		while (true)
			evenIncrement();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest at = new AtomicityTest();
		exec.execute(at);
		for (int i = 0; i < 10; i++)
			exec.execute(new AtomicityTest());
		while (true) {
			int val = at.getValue();
			 System.out.println(val);
			if (val % 2 != 0) {
				System.out.println(val);
				System.exit(0);
			}

		}

	}

}
