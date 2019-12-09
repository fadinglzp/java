package io;
import java.io.*;

public class FileOutputShortcut {
	static String file="src/io/FileOutputShortcut.out";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("src/io/FileOutputShortcut.java")));
		PrintWriter out=new PrintWriter(file);
		int lineCount=1;
		String s;
		while((s=in.readLine())!=null)
			out.println(lineCount++ +": "+s);
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}

}
