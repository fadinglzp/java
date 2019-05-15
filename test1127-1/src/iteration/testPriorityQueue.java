package iteration;
import java.util.*;
import static lzp.tools.*;
public class testPriorityQueue {
	 static void printQ(Queue q){
		while(q.peek()!=null)
			printl(q.remove()+" ");
		print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
		Random rand = new Random();
		for(int i=0;i<20;i++)
			pq.offer(rand.nextInt(50));
		print(pq);
		print(pq.remove());
		print(pq);
		printQ(pq);
		
	}

}
