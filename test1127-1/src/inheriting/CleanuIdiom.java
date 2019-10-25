package inheriting;
import static lzp.tools.*;
class NeedsCleanup {
	private static long counter = 1;
	private final long id = counter++;

	public void dispose() {
		print("NeedsCleanup " + id + " disposed");
	}
}

class ConstructionException extends Exception {

}

class NeedsCleanup2 extends NeedsCleanup {
	public NeedsCleanup2() throws ConstructionException {

	}
}

public class CleanuIdiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NeedsCleanup nc1 = new NeedsCleanup();
		try {

		} finally {
			nc1.dispose();
		}

		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {

		} finally {
			nc2.dispose();
			nc3.dispose();
		}

		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {

				} finally {
					nc5.dispose();
				}
			} catch (ConstructionException e) {
				print(e);
			} finally {
				nc4.dispose();
			}
		} catch (ConstructionException e) {
			print(e);
		}

	}

}
