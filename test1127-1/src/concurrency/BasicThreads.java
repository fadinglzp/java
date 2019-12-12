package concurrency;

import java.util.concurrent.TimeUnit;

public class BasicThreads {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread t=new Thread(new LiftOff());
		t.start();
		System.out.println("waiting for LiftOff");
		System.out.println("waiting for LiftOff");
		System.out.println("waiting for LiftOff");
	}

}
