package arrays;

import lzp.*;
import static lzp.tools.*;

import java.util.Random;



public class GeneratorsTest {
	public static int size = 10;

	public static void test(Class<?> surroundingClass) {
		print(surroundingClass);
		for (Class<?> type : surroundingClass.getClasses()) {
			print(type.getSimpleName() + ": ");
			try {
				Generator<?> g = (Generator<?>) type.getConstructor().newInstance();
				for (int i = 0; i < size; i++)
					printl(g.next() + " ");
				print();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	test(CountingGenerator.class);
		test(RandomGenerator.class);
	}

}
