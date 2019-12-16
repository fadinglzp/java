package concurrency;

import static lzp.tools.*;

class DualSynch{
	private Object syncObject=new Object();
	public synchronized void f(){
		for(int i=0;i<500;i++){
			printl("f");
			Thread.yield();
		}
	}
	public  void g(){
		synchronized(syncObject){
			for(int i=0;i<500;i++)
				printl("g");
			Thread.yield();
			
		}
	}
}


public class SynObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DualSynch ds=new DualSynch();
		new Thread(){
			public void run(){
				ds.f();
			}
		}.start();
		ds.g();

	}

}
