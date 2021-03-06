package io;
import java.io.*;

public class UsingRandomAccessFile {

	static String file="src/io/rtest.dat";
	static void display()throws IOException{
		RandomAccessFile rf=new RandomAccessFile(file,"r");
		for(int i=0;i<7;i++)
			System.out.println("value "+i+": "+rf.readDouble());
		System.out.println(rf.readUTF());
		rf.close();
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		RandomAccessFile rf=new RandomAccessFile(file,"rw");
		for(int i=0;i<7;i++)
			rf.writeDouble(i*1.414);
		rf.writeUTF("The end of the file");
		rf.close();
		display();
		rf=new RandomAccessFile(file,"rw");
		rf.seek(6*8);
		rf.writeDouble(47.0001);
		rf.close();
		display();
	}

}
