package io;
import java.io.*;
public class MemoryInput {

	public static void main (String[] args)throws IOException {
		// TODO Auto-generated method stub
		StringReader in=new StringReader(BufferedInputFile.read("src/io/MemoryInput.java"));
		int c;
		while((c=in.read())!=-1)
			System.out.print((char)c);
	}

}
