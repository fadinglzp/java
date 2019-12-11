package io;
import java.io.*;

public class ThawAlien {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(new File(".","src/io/X.file")));
		Object mystery=in.readObject();
		System.out.println(mystery.getClass());
	}

}
