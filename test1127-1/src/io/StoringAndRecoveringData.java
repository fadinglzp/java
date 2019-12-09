package io;

import java.io.*;

public class StoringAndRecoveringData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/io/Data.txt")));
		out.writeDouble(3.14159);
		out.writeUTF("That was pi");
		out.writeDouble(1.41413);
		out.writeUTF("Square root of 2");
		out.close();
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/io/Data.txt")));
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
	}

}
