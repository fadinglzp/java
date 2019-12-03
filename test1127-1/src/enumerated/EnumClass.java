package enumerated;

import static lzp.tools.*;
import static enumerated.Spiciness.*;
enum Shrubbery {
	GROUND, CRAWLING, HANGING
}

//enum Spiciness {
//	NOT, MILD, MEDIUM, HOT, FLAMING
//}

public class EnumClass {
	
	Spiciness degree;

	public EnumClass(Spiciness d) {
		degree = d;
	}
	public String toString(){
		return "EnumClass is "+degree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (Shrubbery s : Shrubbery.values()) { print(s + " ordinal: " +
		 * s.ordinal()); printl(s.compareTo(Shrubbery.CRAWLING) + " ");
		 * printl(s.equals(Shrubbery.CRAWLING) + " "); print(s ==
		 * Shrubbery.CRAWLING); print(s.getDeclaringClass()); print(s.name());
		 * print("---------------------------------"); }
		 * 
		 * for (String s : "HANGING CRAWLING GROUND".split(" ")) { Shrubbery
		 * shrub = Enum.valueOf(Shrubbery.class, s); print(shrub); }
		 */
		print(new EnumClass(NOT));

	}

}
