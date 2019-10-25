package lzp;

import java.io.*;

public class Hex {
	public static String format(byte[] date)
	{
		StringBuilder result = new StringBuilder();
		int n =0;
		for(byte b:date){
			if(n%16==0)
				result.append(String.format("%05X: ", n));
			result.append(String.format("%02X ", b));
			n++;
			if(n%16==0)
				result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0){
			System.out.println(format(BinaryFile("")));
		}

	}

	private static byte[] BinaryFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
