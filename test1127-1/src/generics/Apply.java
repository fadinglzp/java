package generics;

import java.lang.reflect.*;
import java.util.*;

import lzp.Generator;

import static lzp.tools.*;

public class Apply {

	public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... objects) {
		try {
			for (T t : seq)
				f.invoke(t, objects);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Shape {
	public void rotate() {
		print(this + " rotate");
	}

	public void resize(int newSize) {
		print(this + " resize " + newSize);
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class Square extends Shape {
}

class FilledList<T> extends ArrayList<T> {

	public FilledList(Class<? extends T> type, int size) {
		try {
			for (int i = 0; i < size; i++)
				add(type.getDeclaredConstructor().newInstance());
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}

class SimpleQueue<T> implements Iterable<T> {
	private LinkedList<T> storage = new LinkedList<T>();

	public void add(T t) {
		storage.offer(t);
	}

	public T get() {
		return storage.poll();
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return storage.iterator();
	}
}

class Fill {
	public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
		for (int i = 0; i < size; i++) {
			try {
				collection.add(classToken.getDeclaredConstructor().newInstance());
			} catch (Exception e) {
				throw new RuntimeException();
			}
		}
	}
}

class Contract {
	private static long counter = 0;
	private final long id = counter++;

	public String toString() {
		return getClass().getName() + " " + id;
	}
}

class TitleTransfer extends Contract {
}

interface Addable<T> {
	void add(T t);
}

class Fill2 {
	public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size) {
		for (; size-- > 0;)
			try {
				addable.add(classToken.getDeclaredConstructor().newInstance());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
	}

	public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
		addable.add(generator.next());
	}
}

class AddableCollectionAdapter<T> implements Addable<T> {
	private Collection<T> c;

	public AddableCollectionAdapter(Collection<T> c) {
		this.c = c;
	}

	public void add(T item) {
		c.add(item);
	}
}

class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
	public void add(T item) {
		super.add(item);
	}
}

class Adapter {
	public static <T> Addable<T> collectionAdapter(Collection<T> c) {
		return new AddableCollectionAdapter<T>(c);
	}
}

class ApplyTest {
	public static void main(String[] args) throws Exception {

		List<Coffee> carrier = new ArrayList<Coffee>();
		Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier), Coffee.class, 3);
		Fill2.fill(Adapter.collectionAdapter(carrier), Latte.class, 2);
		print(carrier);
		AddableSimpleQueue<Coffee> coffeeQueue = new AddableSimpleQueue<Coffee>();
		Fill2.fill(coffeeQueue, Mocha.class, 4);
		Fill2.fill(coffeeQueue, Latte.class, 1);
		for (Coffee c : coffeeQueue)
			print(c);

		/*
		 * List<Contract> contracts=new ArrayList<Contract>();
		 * Fill.fill(contracts, Contract.class, 3); Fill.fill(contracts,
		 * TitleTransfer.class, 2); print(contracts); SimpleQueue<Contract>
		 * contractQueue=new SimpleQueue<Contract>(); //
		 * Fill.fill(contractQueue, Contract.class, 3);
		 */

		/*
		 * List<Shape> shapes = new ArrayList<Shape>(); for (int i = 0; i < 10;
		 * i++) shapes.add(new Shape()); Apply.apply(shapes,
		 * Shape.class.getMethod("rotate")); Apply.apply(shapes,
		 * Shape.class.getMethod("resize", int.class), 5); List<Square> squares
		 * = new ArrayList<Square>(); for (int i = 0; i < 10; i++) {
		 * squares.add(new Square()); } Apply.apply(squares,
		 * Shape.class.getMethod("rotate")); Apply.apply(squares,
		 * Shape.class.getMethod("resize", int.class), 5);
		 * 
		 * Apply.apply(new FilledList<Shape>(Shape.class, 10),
		 * Shape.class.getMethod("rotate")); Apply.apply(new
		 * FilledList<Square>(Square.class, 10),
		 * Square.class.getMethod("resize", int.class), 10);
		 * 
		 * Queue<Shape> shapeQ = new LinkedList<Shape>(); for (int i = 0; i < 5;
		 * i++) { shapeQ.add(new Shape()); shapeQ.add(new Square()); }
		 * Apply.apply(shapeQ, Shape.class.getMethod("rotate"));
		 */
	}
}