package concurrency;
import java.util.concurrent.*;;

public class AtomicityTest implements Runnable {

	private static volatile  int i=0;
	public synchronized int getValue() {
		return i;
	}
	private synchronized void evenIncrement() {
		//i+=2;
		 {
			i++;
//			try {
//				TimeUnit.MILLISECONDS.sleep(20);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		//	Thread.yield();
			i++;
		}

	}
	public  void run() {
		while(true)
			evenIncrement();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec=Executors.newCachedThreadPool();
		AtomicityTest at=new AtomicityTest();
		for(int i=0;i<10;i++)
			exec.execute(new AtomicityTest());
		while(true) {
			int val=at.getValue();
		//	System.out.println(val);
			if(val%2!=0) {
				System.out.println(val);
				System.exit(0);
			}

		}

	}

}
