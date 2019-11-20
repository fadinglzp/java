package generics;

import static lzp.tools.*;
import java.util.*;

public class Wildcards {
	static void rawArgs(Holder2 holder, Object arg) {
		print(holder.getclass());
		holder.set(arg);
		print(holder.getclass());
		Object obj = holder.get();

	}

	static void unbounderArg(Holder2<?> holder, Object arg) {
		// holder.set(arg);
		Object obj = holder.get();
		// print(holder.get());
	}

	static <T> T exact1(Holder2<T> h) {
		T t = h.get();
		return t;
	}

	static <T> T exact2(Holder2<T> h, T arg) {
		h.set(arg);
		T t = h.get();
		return t;
	}

	static <T> T wildSubtype(Holder2<? extends T> h, T arg) {
//		h.set(arg);
		T t = h.get();
		return t;
	}

	static <T> void wildSupertype(Holder2<? super T> h, T arg) {
		h.set(arg);
		// T t =h.get();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder2 raw = new Holder2<Long>(11L);
		Holder2<Long> qualified = new Holder2<Long>(22L);
		print(qualified.getclass());
		Holder2<?> unbounded = new Holder2<Long>(33L);
		Holder2<? extends Long> bounded = new Holder2<Long>(44L);
		Holder2 holder2 = null;
		Long lng = 1L;
		rawArgs(raw, "1abc");
		rawArgs(qualified, "2abc");
		rawArgs(unbounded, "3abc");
		rawArgs(bounded, "4abc");
		unbounderArg(raw, lng);
		unbounderArg(qualified, lng);
		unbounderArg(unbounded, lng);
		unbounderArg(bounded, lng);
		print(exact1(raw).getClass());
		Object r1 = exact1(raw);
		Object r2 = exact1(qualified);
		Object r3 = exact1(unbounded);
		Object r4 = exact1(bounded);
		print(r1 + " r1.getClass() " + r1.getClass());
		print(r2 + " r2.getClass() " + r2.getClass());
		print(r3 + " r3.getClass() " + r3.getClass());
		print(r4 + " r4.getClass() " + r4.getClass());
		print(qualified.getclass());
		qualified.set(123L);
		// qualified.set("abc");
		print(qualified.get());
		print(qualified.getclass());
		holder2 = qualified;
		holder2.set("abc");
		print(qualified.get());
		print(qualified.getclass());
		Long r5 = exact2(raw, lng);
		Long r6 = exact2(qualified, lng);
//		Long r7=exact2(unbounded,lng);
//		Long r8=exact2(bounded,lng);
//		print(r5);
		Long rr5 = wildSubtype(raw, lng);
		Long rr6 = wildSubtype(qualified, lng);
		Object rr7 = wildSubtype(unbounded, lng);
//		Long rr8=wildSubtype(bounded,lng);
		print("rr5 " + rr7);
		wildSupertype(raw, lng);
		wildSupertype(qualified, lng);
//		wildSupertype(unbounded,lng);
//		wildSupertype(bounded,lng);

		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(1);
		ai.add(2);
		print(ai);
		ArrayList a = null;
		a = ai;
		a.add(0, "abc");
		print(ai);

//		print(ai.get(0));
//		print(a.get(0).getClass());
		a.add(11L);
		a.add(0.1F);
		a.add(0.2D);
		a.add(new Apple());
		int i = a.size();
		for (; i-- > 0;) {
			print(a.get(i).getClass().getSimpleName());
		}
		print(ai);

	}

}
