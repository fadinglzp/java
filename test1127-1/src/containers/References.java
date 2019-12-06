package containers;

import java.lang.ref.*;
import java.util.*;
import static lzp.tools.*;

class VeryBig {
	private static final int SIZE = 10000;
	private long[] la = new long[SIZE];
	private String ident;

	public VeryBig(String id) {
		ident = id;
	}

	public String toString() {
		return ident;
	}

	protected void finalize() {
		print("Finalizing " + ident);
	}
}

public class References {
	private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<VeryBig>();

	public static void checkQueue() {
		Reference<? extends VeryBig> inq = rq.poll();
		if (inq != null)
			print("In queue: " + inq.get());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 100;
		if (args.length > 0)
			size = new Integer(args[0]);
		LinkedList<SoftReference<VeryBig>> sa = new LinkedList<SoftReference<VeryBig>>();
		for (int i = 0; i < size; i++) {
			sa.add(new SoftReference<VeryBig>(new VeryBig("Soft " + i), rq));
			print("Just created: " + sa.getLast());
			checkQueue();
		}
		LinkedList<WeakReference<VeryBig>> wa = new LinkedList<WeakReference<VeryBig>>();
		for (int i = 0; i < size; i++) {
			wa.add(new WeakReference<VeryBig>(new VeryBig("Weak " + i), rq));
			print("Just created: " + wa.getLast());
			checkQueue();
		}
		LinkedList<PhantomReference<VeryBig>> pa = new LinkedList<PhantomReference<VeryBig>>();
		for(int i=0;i<size;i++) {
			pa.add(new PhantomReference<VeryBig>(new VeryBig("Phantom "+i),rq));
			print(i+"  Just created: "+pa.getLast());
			checkQueue();
		}
	}

}
