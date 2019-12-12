package concurrency;
import java.util.concurrent.*;
import static lzp.tools.*;

class DaemonSpawn implements Runnable{
	public void run(){
		while(true){
			Thread.yield();
		}
	}
}

class Daemon implements Runnable{
	private Thread[] t=new Thread[10];
	public void run(){
		for(int i=0;i<t.length;i++)
		{
			t[i]=new Thread(new DaemonSpawn());
			t[i].start();
			printl("DaemonSpawn "+i+" started, ");
		}
		for(int i=0;i<t.length;i++){
			printl("t["+i+"].isDeamon()="+t[i].isDaemon()+", ");
		}
		while(true)
			Thread.yield();
		
	}
}

public class Daemons {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread d=new Thread(new Daemon());
		d.setDaemon(true);
		d.start();
		printl("d.isDaemon() = "+d.isDaemon()+", ");
		TimeUnit.SECONDS.sleep(1);
	}

}
