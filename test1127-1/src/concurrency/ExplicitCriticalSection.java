package concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class ExplicitPairManager1 extends PairManager{
	private Lock lock=new ReentrantLock();
	public synchronized void increment(){
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			store(getPair());
		}
		finally{
			lock.unlock();
		}
	}
}

class ExplicitPairManager2 extends PairManager{
	private Lock lock =new ReentrantLock();
	public void increment(){
		lock.lock();
		Pair temp;
		
		try{
			p.incrementX();
			p.incrementY();
			temp=getPair();
			store(temp);
		}
		finally{
			lock.unlock();
		}
		
	}
}

public class ExplicitCriticalSection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PairManager pman1=new ExplicitPairManager1();
		PairManager pman2=new ExplicitPairManager2();
		PairManipulator pm2=new PairManipulator(pman2);
	//	CriticalSection.testApproaches(pman2, pman2);
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(pm2);
		exec.execute(new PairChecker(pman2));
		
		
		
		
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Sleep interrupted");
		}
		System.out.println("pm2 " + pm2);
		System.exit(0);
	}


}
