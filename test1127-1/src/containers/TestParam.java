package containers;

import java.util.*;
import static lzp.tools.*;

abstract class Test<T> {
	String name;

	public Test(String name) {
		this.name = name;
	}

	abstract int test(T container, TestParam tp);
}

public class TestParam {
	public final int size;
	public final int loops;

	public TestParam(int size, int loops) {
		this.size = size;
		this.loops = loops;
	}

	public static TestParam[] array(int... values) {
		int size = values.length / 2;
		TestParam[] result = new TestParam[size];
		int n = 0;
		for (int i = 0; i < size; i++) {
			result[i] = new TestParam(values[n++], values[n++]);
		}
		return result;
	}

	public static TestParam[] array(String[] values) {
		int[] vals = new int[values.length];
		for (int i = 0; i < vals.length; i++)
			vals[i] = Integer.decode(values[i]);
		return array(vals);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("1");
		TestParam[] t=array(10,5000,100,5000);
		print(t.length);
		for(TestParam p:t)
		print(p.size+" "+p.loops);
	}

}

class Tester<T> {
	public static int fieldWidth = 8;
	public static TestParam[] defaultParams = TestParam.array(10, 5000, 100, 5000, 1000, 5000, 10000, 500);
	protected T container;

	protected T initialize(int size) {
		return container;
	}

	private String headline = "";
	private List<Test<T>> tests;

	private static String stringField() {
		return "%" + fieldWidth + "s";
	}

	private static String numberField() {
		return "%" + fieldWidth + "d";
	}

	private static int sizeWidth = 5;
	private static String sizeField = "%" + sizeWidth + "s";
	private TestParam[] paramList = defaultParams;

	public Tester(T container, List<Test<T>> tests) {
		this.container = container;
		this.tests = tests;
		if (container != null) {
			headline = container.getClass().getSimpleName();
		}
	}

	public Tester(T container, List<Test<T>> tests, TestParam[] paramList) {
		this(container, tests);
		this.paramList = paramList;
	}

	public void setHeadline(String newHeadline) {
		headline = newHeadline;
	}

	private void displayHeader() {
		int width = fieldWidth * tests.size() + sizeWidth;
		int dashLength = width - headline.length() - 1;
		StringBuilder head = new StringBuilder(width);
		for (int i = 0; i < dashLength / 2; i++) {
			head.append('-');
		}
		head.append(' ');
		head.append(headline);
		head.append(' ');
		for (int i = 0; i < dashLength / 2; i++) {
			head.append('-');
		}
		print(head);
		System.out.format(sizeField, "size");
		for (Test test : tests) {
			System.out.format(stringField(), test.name);
		}
		print();
	}

	public void timedTest() {
		displayHeader();
		for (TestParam param : paramList) {
			System.out.format(sizeField, param.size);
			for (Test<T> test : tests) {
				T kontainer = initialize(param.size);
				long start = System.nanoTime();
				int reps = test.test(kontainer, param);
				long duration = System.nanoTime() - start;
				long timePerRep = duration / reps;
				System.out.format(numberField(), timePerRep);
			}
			print();
		}

	}

	public static <C> void run(C cntnr, List<Test<C>> tests) {
		new Tester<C>(cntnr, tests).timedTest();
	}
}
