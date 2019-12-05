package containers;

import static lzp.tools.*;

public class RandomBounds {
	static void usage() {
		print("Usage");
		print("\tRandomBounds lower");
		print("\tRandomBounds upper");
		System.exit(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1)
			usage();
		if (args[0].equals("lower")) {
			double d = Math.random();
			while (d != 0.0) {
				print(d);
				d = Math.random();
			}
			print("Produced 0.0!");
		} else if (args[0].equals("upper")) {
			while (Math.random() != 1.0)
				;
			print("Produced  1.0!");
		} else
			usage();
	}

}
