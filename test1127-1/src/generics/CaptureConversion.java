package generics;

import static lzp.tools.*;
import java.util.*;

public class CaptureConversion {
	static <T> void f1(Holder2<T> h) {
		T t = h.get();
		print(t.getClass().getSimpleName());

	}

	static void f2(Holder2<?> h) {
		f1(h);

	}

	static <T> void f3(Holder2<List<?>> h) {
		h.get();
		h.set(new ArrayList<String>());
		// h.get().add(new Object());
		h.get().get(0);
		h.get().getClass();
	}

	static void f4(List<Holder2<?>> l) {
		l.add(new Holder2<String>());
		l.get(0);
//		l.get(0).set(new Object());
		l.get(0).get();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder2 raw = new Holder2<Integer>(1);
		f1(raw);
		f2(raw);
		Holder2 rawBasic = new Holder2();
		rawBasic.set(new Object());
		f1(rawBasic);
		f2(rawBasic);
		Holder2<?> wildcarded = new Holder2<Double>(1.0);
		f1(wildcarded);
		f2(wildcarded);

	}

}
