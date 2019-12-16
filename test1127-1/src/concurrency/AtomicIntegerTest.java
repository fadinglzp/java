package concurrency;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import static lzp.tools.*;

public class AtomicIntegerTest implements Runnable{

	private AtomicInteger i=new AtomicInteger(0);
	
	public int getValue() {
		return i.get();
	}
	
	private void evenIncrement() {
		i.addAndGet(2);
//		i.addAndGet(1);
	}
	
	public void run() {
		while(true)
			evenIncrement();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Timer().schedule(new TimerTask() {
			public void run() {
				System.err.println("Aborting");
				System.exit(0);
			}
		}, 5000);
		
		ExecutorService exec=Executors.newCachedThreadPool();
		AtomicIntegerTest at=new AtomicIntegerTest();
		exec.execute(at);
		for(int i=0;i<10;i++)
			exec.execute(new AtomicIntegerTest());
		
//		at.evenIncrement();
//		print(at.getValue());
		while(true) {
			int val=at.getValue();
			System.out.println(val);
			if(val%2!=0) {
				System.out.println(val);
				System.exit(0);
			}

		}
		
	}

}
