package concurrency;

public class MoreBasicThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			new Thread(new LiftOff()).start();
		System.out.println("Waiting for LiftOff");
	}

}