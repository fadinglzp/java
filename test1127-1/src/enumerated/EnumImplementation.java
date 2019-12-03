package enumerated;

import java.util.*;
import lzp.*;
import static lzp.tools.*;

enum CartoonCharacter implements Generator<CartoonCharacter> {
	SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
	private Random rand = new Random();

	public CartoonCharacter next() {
		return values()[rand.nextInt(values().length)];
	}
}

enum Activity {
	SITTING, LYING, STANDING, HOPPING, RUNNING, DODGING, JUMPING, FALLING, FLYING
}

public class EnumImplementation {
	public static <T> void printNext(Generator<T> rg) {
		printl(rg.next() + ", ");
	}

	private static Random rand = new Random();

	public static <T extends Enum<T>> T random(Class<T> ec) {
		return random(ec.getEnumConstants());
	}

	public static <T> T random(T[] values) {
		return values[rand.nextInt(values.length)];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 20; i++) {
			printl(random(Activity.class) + " ");
		}

		/*
		 * CartoonCharacter cc=CartoonCharacter.BOB; for(int i=0;i<10;i++)
		 * printNext(CartoonCharacter.BOB);
		 */
	}

}
