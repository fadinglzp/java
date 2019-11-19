package generics;

import java.util.*;
import static lzp.tools.*;

interface Processor<T, E extends Exception> {
	void process(List<T> resultCollector) throws E;
}

class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {
	List<T> processAll() throws E {
		List<T> resultCollector = new ArrayList<T>();
		for (Processor<T, E> processor : this)
			processor.process(resultCollector);
		return resultCollector;
	}

}

class Failure1 extends Exception {

}

class Processor1 implements Processor<String, Failure1> {
	static int count = 3;

	public void process(List<String> resultCollector) throws Failure1 {
		if (count-- > 1)
			resultCollector.add("Hep!");
		else
			resultCollector.add("Ho!");
		if (count < 0) {
			throw new Failure1();
		}
	}
}

class Failure2 extends Exception {
}

class Processor2 implements Processor<Integer, Failure2> {
	static int count = 2;

	public void process(List<Integer> resultCollector) throws Failure2 {
		if (--count == 0)
			resultCollector.add(12);
		else
			resultCollector.add(34);
		if (count < 0)
			throw new Failure2();
	}
}

public class CheckedList {
	static void oldStyleMethod(List l) {
		l.add(new Apple());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessRunner<String, Failure1> runner = new ProcessRunner<String, Failure1>();
		for (int i = 0; i < 30; i++)
			runner.add(new Processor1());
		try {
			print(runner.processAll());
		} catch (Exception e) {
			print(e);
		}
		ProcessRunner<Integer, Failure2> runner2 = new ProcessRunner<Integer, Failure2>();
		for (int i = 0; i < 20; i++) {
			runner2.add(new Processor2());
		}
		try {
			print(runner2.processAll());
		} catch (Exception e) {
			print(e);
		}

		List<Orange> orange1 = new ArrayList<Orange>();
		oldStyleMethod(orange1);

		List<Orange> orange2 = Collections.checkedList(new ArrayList<Orange>(), Orange.class);
		try {
			oldStyleMethod(orange2);
		} catch (Exception e) {
			// e.printStackTrace();
		}
		print(orange1.get(0));
		List<Fruit> fruits = Collections.checkedList(new ArrayList<Fruit>(), Fruit.class);
		fruits.add(new Apple());
		fruits.add(new Orange());
		print(fruits);
	}

}
