package lzp;

public class tools {
//	public static void  print(String args)
//	{
//		System.out.println(args);
//	}
//	public static void  print(Object args)
//	{
//
//		System.out.println(args);
//	}
//	public static void  print(int args)
//	{
//		System.out.println(String.valueOf(args));
//	}

//	public static void  print(char[] args)
//	{
//		System.out.println(String.valueOf(args));
//	}
//	public static void  print(long args)
//	{
//		System.out.println(String.valueOf(args));
//	}
//	public static void  print(double args)
//	{
//		System.out.println(String.valueOf(args));
//	}
//	public static void  print(float args)
//	{
//		System.out.println(String.valueOf(args));
//	}
//	public static void  print(byte args)
//	{
//		System.out.println(String.valueOf(args));
//	}
//	public static void  print(short args)
//	{
//		System.out.println(String.valueOf(args));
//	}
	public static void  print(char[] args)
	{
		System.out.println(String.valueOf(args));
	}
	public static void  print(Object... args)
	{
		for(Object ob : args)
			System.out.print(String.valueOf(ob)+" ");
		System.out.println();
	}
	public static void  printl(char[] args)
	{
		System.out.print(String.valueOf(args));
	}
	public static void  printl(Object... args)
	{
		for(Object ob : args)
			System.out.print(String.valueOf(ob)+" ");
	}
}
