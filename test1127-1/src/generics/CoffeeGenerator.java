package generics;

import java.util.*;
import lzp.*;
import static lzp.tools.*;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class };
	private static Random rand = new Random();

	public CoffeeGenerator() {
	}

	private int size = 0;

	public CoffeeGenerator(int sz) {
		size = sz;
	}

	public Coffee next() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;

		public boolean hasNext() {
			return count > 0;
		}

		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	};

	public Iterator<Coffee> iterator() {
		return new Iterator<Coffee>() {
			int count = size;

			public boolean hasNext() {
				return count > 0;
			}

			public Coffee next() {
				count--;
				return CoffeeGenerator.this.next();
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeGenerator gen = new CoffeeGenerator();
		for (int i = 0; i < 5; i++)
			print(gen.next());
		for (Coffee c : new CoffeeGenerator(5))
			print(c);
	}

}
