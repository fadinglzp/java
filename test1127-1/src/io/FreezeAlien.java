package io;
import java.io.*;

public class FreezeAlien {
	public static void main(String[] args) throws Exception{
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("src/io/X.file"));
		Alien quellek=new Alien();
		out.writeObject(quellek);
	}

}