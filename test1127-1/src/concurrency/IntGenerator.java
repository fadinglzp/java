package concurrency;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public abstract class IntGenerator {
	private volatile boolean canceled=false;
	public abstract int next();
	public void cancel(){
		canceled=true;
	}
	public boolean isCanceled(){
		return canceled;
	}
	public static void main(String[] args){
		EvenChecker.test(new MutexEvenGenerator());
	//	EvenChecker.test(new SynchronizedEvenGenerator());
	}
}

class EvenChecker implements Runnable{
	private IntGenerator generator;
	private final int id;
	public EvenChecker(IntGenerator g,int ident){
		generator=g;
		id=ident;
	}
	public void run(){
		while(!generator.isCanceled()){
			int val=generator.next();
			if(val%2!=0)
			{
				System.out.println(val+ " not even!");
				generator.cancel();
			}
		}
	}
	public static void test(IntGenerator gp,int count){
		System.out.println("Press Control-C to exit");
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<count;i++)
			exec.execute(new EvenChecker(gp,i));
		exec.shutdown();
	}
	public static void test(IntGenerator gp){
		test(gp,10);
	}
}

class EvenGenerator extends IntGenerator{
	private int currentEvenValue=0;
	public int next(){
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}

}

class SynchronizedEvenGenerator extends IntGenerator{
	private int currentEvenValue =0;
	public synchronized int next(){
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}
}

class MutexEvenGenerator extends IntGenerator{
	private int currentEvenValue=0;
	private Lock lock =new ReentrantLock();
	public int next() {
		lock.lock();
		try {
			++currentEvenValue;
			Thread.yield();
			++currentEvenValue;
			return currentEvenValue;
		}finally {
			lock.unlock();
		}
	}
}