package containers;

import java.lang.reflect.*;
import java.util.*;
import static lzp.tools.*;

class Groundhog implements Comparable<Groundhog>{
	protected int number;
	public Groundhog(int n) {
		number = n;
	}
	public String toString() {
		return "Groundhog #" + number;
	}
	@Override
	public int compareTo(Groundhog o) {
		// TODO Auto-generated method stub
		return number>o.number?1:(number<o.number?-1:0);
	}
	public int hashCode() {
		return number;
	}
	public boolean equals(Object o) {
		return o instanceof Groundhog &&number==((Groundhog)o).number;
	}
}

class Prediction {
	private static Random rand = new Random();
	private boolean shadow = rand.nextBoolean();

	public String toString() {
		if (shadow)
			return "1";
		return "0";
	}
}

class GroundhogCompare implements Comparator<Groundhog>{

	
	public int compare(Groundhog o1, Groundhog o2) {
		// TODO Auto-generated method stub
		return o1.number<o2.number?1:o1.number>o2.number?-1:0;
	}
	
}



public class SpringDetector {

	public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
		Constructor<T> ghog = type.getConstructor(int.class);
		//Map<Groundhog, Prediction> map = new TreeMap<Groundhog, Prediction>(new GroundhogCompare());
		Map<Groundhog, Prediction> map = new HashMap<Groundhog, Prediction>();
		for (int i = 0; i < 10; i++)
			map.put(ghog.newInstance(i), new Prediction());
		print("map = " + map);
		Groundhog gh = ghog.newInstance(3);
		print("Looking up prediction for " + gh);
		if (map.containsKey(gh))
			print(map.get(gh));
		else
			print("Key not found: " + gh);
		print(gh);
		print(map.keySet().iterator().next().equals(ghog.newInstance(0)));
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		detectSpring(Groundhog.class);
	}

}
