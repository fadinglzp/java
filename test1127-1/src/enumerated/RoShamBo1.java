package enumerated;

import java.util.*;
import static enumerated.Outcome.*;
import static lzp.tools.*;
interface Item {
	Outcome compete(Item it);

	Outcome eval(Paper p);

	Outcome eval(Scissors s);

	Outcome eval(Rock r);
}

class Paper implements Item {
	public Outcome compete(Item it) {
		return it.eval(this);
	}

	public Outcome eval(Paper p) {
		return DRAW;
	}

	public Outcome eval(Scissors s) {
		return WIN;
	}

	public Outcome eval(Rock r) {
		return LOSE;
	}

	public String toString() {
		return "Paper";
	}

}

class Scissors implements Item {
	public Outcome compete(Item it) {
		return it.eval(this);
	}

	public Outcome eval(Paper p) {
		return LOSE;
	}

	public Outcome eval(Scissors s) {
		return DRAW;
	}

	public Outcome eval(Rock r) {
		return WIN;
	}

	public String toString() {
		return "Scissors";
	}
}

class Rock implements Item {
	public Outcome compete(Item it) {
		return it.eval(this);
	}

	public Outcome eval(Paper p) {
		return WIN;
	}

	public Outcome eval(Scissors s) {
		return LOSE;
	}

	public Outcome eval(Rock r) {
		return DRAW;
	}

	public String toString() {
		return "Rock";
	}
}

public class RoShamBo1 {
	static final int SIZE = 20;
	private static Random rand = new Random();

	public static Item newItem() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Scissors();
		case 1:
			return new Paper();
		case 2:
			return new Rock();
		}
	}
	public static void match(Item a,Item b) {
		print(a+ " vs. "+b+": "+a.compete(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<SIZE;i++)
			match(newItem(),newItem());
	}

}
