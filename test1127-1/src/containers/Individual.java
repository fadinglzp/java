package containers;
import java.util.*;
import static lzp.tools.*;

public class Individual implements Comparable<Individual> {
	private static long counter = 0;
	private final long id = counter++;
	private String name;

	public Individual(String name) {
		this.name = name;
	}

	public Individual() {

	}

	public String toString() {
		return getClass().getSimpleName() + (name == null ? "" : " " + name);
	}

	public long id() {
		return id;
	}

	public boolean equals(Object o) {
		return o instanceof Individual && id == ((Individual) o).id;
	}

	public int hashCode() {
		int result = 17;
		if (name != null)
			result = 37 * result + name.hashCode();
		result = result * 37 + (int) id;
		return result;
	}

	public int compareTo(Individual arg) {
		String first = getClass().getSimpleName();
		String argFirst = arg.getClass().getSimpleName();
		int firstCompare = first.compareTo(argFirst);
		if(firstCompare!=0)
			return firstCompare;
		if(name!=null&&arg.name!=null)
		{
			int secondCompare=name.compareTo(arg.name);
			if(secondCompare!=0)
				return secondCompare;
		}
		return id>arg.id?1:id<arg.id?-1:0;
	}
	public void main(String[] args){
		Set<Individual> pets =new TreeSet<Individual>();
		
	//	pets.add(e);
	}
}
