package arrays;

import java.util.*;
import static lzp.tools.*;

class ClassParameter<T> {
	public T[] f(T[] arg) {
		return arg;
	}
}

class MethodParameter {
	public static <T> T[] f(T[] arg) {
		return arg;
	}
}

class ArrayOfGenericType<T> {
	T[] array;

	public ArrayOfGenericType(int size) {
		array = (T[]) new Object[size];
	}
}

public class ArrayOptions {

	private static Random rand = new Random(47);
	static final String[] FLAVORS = { "A", "B", "C", "D", "E" };

	public static String[] flavorSet(int n) {
		if (n > FLAVORS.length)
			throw new IllegalArgumentException("Set too big");
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVORS.length];
		for (int i = 0; i < n; i++) {
			int t;
			do
				t = rand.nextInt(FLAVORS.length);
			while (picked[t]);
			results[i] = FLAVORS[t];
			picked[t] = true;
		}
		return results;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Integer[] ints2 = new ClassParameter<Integer>().f(ints);
		Double[] doubles2 = new ClassParameter<Double>().f(doubles);

		print(ints);
		print(ints2);
		print(doubles);
		print(doubles2);

		List[] l = new ArrayList[10];
		List<String>[] ls = (List<String>[]) l;
		// ls[1]=new ArrayList<Integer>();
		// ArrayList<String>[] ls= new ArrayList<String>[10];
		l[0] = new ArrayList<String>();
		l[1] = new ArrayList<Integer>();
		Object[] objects = ls;
		objects[2] = new ArrayList<Double>();
		List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
		for (int i = 0; i < spheres.length; i++)
			spheres[i] = new ArrayList<BerylliumSphere>();

		for (int i = 0; i < 7; i++) {
			print(Arrays.toString(flavorSet(3)));
		}

		/*
		 * BerylliumSphere[] a,b=new BerylliumSphere[5];
		 * print("b: "+Arrays.toString(b)); BerylliumSphere[] c=new
		 * BerylliumSphere[4]; for(int i=0;i<c.length;i++){ if(c[i]==null)
		 * c[i]=new BerylliumSphere(); } BerylliumSphere[]d={ new
		 * BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() };
		 * a=new BerylliumSphere[]{ new BerylliumSphere(), new BerylliumSphere()
		 * }; print("a.length = "+a.length); print("b.length = "+b.length);
		 * print("c.length = " +c.length); print("d.length = "+d.length); a=d;
		 * print("a.length = "+a.length); int[]e; int[]f =new int[5];
		 * print("f: "+Arrays.toString(f)); int[] g=new int[4]; for(int
		 * i=0;i<g.length;i++){ g[i]=i*i; } int[] h={11,47,93}; //
		 * print(e.length);
		 * 
		 * print("f.length = "+ f.length); print("g.length = "+g.length);
		 * print("h.length = "+h.length); e=h; print("e.length = "+e.length );
		 * e=new int[]{ 1,2 }; print("e.length = "+e.length); char[] cr=new
		 * char[5]; print(Arrays.toString(cr));
		 */

	}

}
