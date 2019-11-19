package generics;

import java.util.*;
import lzp.*;
import static lzp.tools.*;

class TupleList<A, B, C> extends ArrayList<ThreeTuple<A, B, C>> {
	public static void f() {
		TupleList<Amphibian, String, Integer> t1 = new TupleList<Amphibian, String, Integer>();
		t1.add(TupleTest.g());
		t1.add(TupleTest.g());
		t1.add(TupleTest.g());
		for (ThreeTuple<Amphibian, String, Integer> t : t1)
			print(t);
	}
}

class Product {
	private final int id;
	private String description;
	private double price;

	public Product(int i, String d, double p) {
		id = i;
		description = d;
		price = p;
//		print(toString());
	}

	public String toString() {
		return id + ": " + description + ", price: $" + price;
	}

	public void priceChange(double change) {
		price += change;
	}

	public static Generator<Product> generator = new Generator<Product>() {
		private Random rand = new Random();

		public Product next() {
			return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000) + 0.99);
		}
	};
}

class Shelf extends ArrayList<Product> {
	public Shelf(int n) {
		Generators.fill(this, Product.generator, n);
	}
}

class Aisle extends ArrayList<Shelf> {
	public Aisle(int nShelves, int nProduct) {
		for (; nShelves-- > 0;)
			add(new Shelf(nProduct));
	}
}

class CheckoutStand {
}

class Office {
}

public class Store extends ArrayList<Aisle> {
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();

	public Store(int nAisles, int nShelves, int nProduct) {
		for (; nAisles-- > 0;)
			add(new Aisle(nShelves, nProduct));
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Aisle a : this)
			for (Shelf s : a) {
				for (Product p : s) {
					result.append(p.toString());
					result.append("     ");
				}
				result.append("\n");
			}
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TupleList.f();
		print(new ArrayList<Double>().getClass());

		// print(new Store(1,5,3));
	}

}
