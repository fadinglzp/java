package arrays;

import java.util.*;
import lzp.*;
import static lzp.tools.*;

class CompTypeComparator implements Comparator<CompType> {

	@Override
	public int compare(CompType o1, CompType o2) {
		// TODO Auto-generated method stub
		return o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1);
	}

}

public class CompType implements Comparable<CompType> {

	int i;
	int j;
	private static int count = 1;

	public CompType(int n1, int n2) {
		i = n1;
		j = n2;
	}

	public String toString() {
		String result = "[i = " + i + ", j = " + j + "]";
		if (count++ % 3 == 0)
			result += "\n";
		return result;
	}

	public int compareTo(CompType o) {
		// TODO Auto-generated method stub
		return (i < o.i ? -1 : (i == o.i ? 0 : 1));
	}

	private static Random rand = new Random();

	public static Generator<CompType> generator() {
		return new Generator<CompType>() {
			public CompType next() {
				return new CompType(rand.nextInt(100), rand.nextInt(100));
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CompType[] a = Generated.array(new CompType[12], generator());
		// print("before sorting");
		// print(Arrays.toString(a));
		// Arrays.sort(a);
		// print("after sorting");
		// print(Arrays.toString(a));
		//
		// Arrays.sort(a, Collections.reverseOrder());
		// print("after sorting");
		// print(Arrays.toString(a));
		// Arrays.sort(a, new CompTypeComparator());
		// print("after sorting");
		// print(Arrays.toString(a));

		String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
		print("before sort: " + Arrays.toString(sa));
		Arrays.sort(sa);
		print("after sort: " + Arrays.toString(sa));
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		print("after sort: " + Arrays.toString(sa));

		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		int[] a=ConvertTo.primitive(Generated.array(new Integer[25], gen));
		print(Arrays.toString(a));
		Arrays.sort(a);
		print(Arrays.toString(a));
		while(true){
			int r=gen.next();
			int location =Arrays.binarySearch(a, r);
			if(location>=0){
				print(r+" "+location);
				break;
			}
				
		}


	}

}
