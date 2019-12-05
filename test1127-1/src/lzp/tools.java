package lzp;

public class tools {
	// public static void print(String args)
	// {
	// System.out.println(args);
	// }
	// public static void print(Object args)
	// {
	//
	// System.out.println(args);
	// }
	// public static void print(int args)
	// {
	// System.out.println(String.valueOf(args));
	// }

	// public static void print(char[] args)
	// {
	// System.out.println(String.valueOf(args));
	// }
	// public static void print(long args)
	// {
	// System.out.println(String.valueOf(args));
	// }
	// public static void print(double args)
	// {
	// System.out.println(String.valueOf(args));
	// }
	// public static void print(float args)
	// {
	// System.out.println(String.valueOf(args));
	// }
	// public static void print(byte args)
	// {
	// System.out.println(String.valueOf(args));
	// }
	// public static void print(short args)
	// {
	// System.out.println(String.valueOf(args));
	// }
	public static void print(char[] args) {
		System.out.println(String.valueOf(args));
	}

	public static void print(Object... args) {
		// for(Object ob : args)
		// System.out.print(String.valueOf(ob)+" ");
		int j = args.length - 1;
		for (int i = 0; i < j; i++)
			System.out.print(String.valueOf(args[i]) + " ");
		if (j > -1)
			System.out.print(String.valueOf(args[j]));

		System.out.println();
	}

	public static void printl(char[] args) {
		System.out.print(String.valueOf(args));
	}

	public static void printl(Object... args) {
		// for(Object ob : args)
		// System.out.print(String.valueOf(ob)+" ");
		int j = args.length - 1;
		for (int i = 0; i < j; i++)
			System.out.print(String.valueOf(args[i]) + " ");
		if (j > -1)
			System.out.print(String.valueOf(args[j]));

	}

	public static void printinfo(Class c) {
		print("Class name: " + c.getName() + " is interface? [" + c.isInterface() + "]");
		print("Simple name: " + c.getSimpleName());
		print("Canonical name: " + c.getCanonicalName());

	}

	public static void format(String format, Object... args) {
		System.out.format(format, args);
	}
}
