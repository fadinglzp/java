package containers;
import lzp.*;
import static lzp.tools.*;


public class DequeTest {
	static void fillTest(Deque<Integer> deque){
		int i=19;
		for(;++i<27;)
			deque.addFirst(i);
		i=49;
		for(;++i<55;)
			deque.addLast(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> di=new Deque<Integer>();
		fillTest(di);
		print(di);
		while(di.size()!=0)
			printl(di.removeFirst()+" ");
		print();
		fillTest(di);
		while(di.size()!=0)
			printl(di.removeLast()+" ");

	}

}
