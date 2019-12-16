package concurrency;

import java.util.concurrent.*;
import java.util.*;
import static lzp.tools.*;

class Count {
	private int count = 0;
	private Random rand = new Random(47);

	public synchronized int increment() {
		int temp = count;
		if (rand.nextBoolean())
			Thread.yield();
		return (count = ++temp);
	}
	public synchronized int value(){
		return count;
	}
}

class Entrance implements Runnable{
	private static Count count=new Count();
	private static List<Entrance> entrances=new ArrayList<Entrance>();
	private int number=0;
	private final int id;
	public Entrance(int id){
		this.id=id;
		entrances.add(this);
	}
	private static volatile boolean canceled=false;
	public static void cancel(){
		canceled=true;
	}
	public void run(){
		while(!canceled){
			synchronized(this){
				++number;
			}
			print(this+" Total: "+count.increment());
			try{
				TimeUnit.MILLISECONDS.sleep(100);
			}catch(InterruptedException e){
				print("sleep interrupted");
			}
		}
		print("Stopping "+this);
	}
	public synchronized int getValue(){
		return number;
	}
	public String toString(){
		return "Entrance "+id+": "+getValue();
	}
	public static int getTotalCount(){
		return count.value();
	}
	public static int sumEntrances(){
		int sum=0;
		for(Entrance entrance:entrances)
			sum+=entrance.getValue();
		return sum;
	}
}

public class OrnamentalGarden {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exec.execute(new Entrance(i));
		TimeUnit.MILLISECONDS.sleep(3001);;
		Entrance.cancel();
		exec.shutdown();
		if(!exec.awaitTermination(250, TimeUnit.MILLISECONDS))
			print("Some tasks were not terminated!");
		print("Total: "+Entrance.getTotalCount());
		print("Sum of Entrances: "+Entrance.sumEntrances());
		
		
		
		
	}

}
