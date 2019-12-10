package io;
import java.nio.channels.*;
import java.util.concurrent.*;
import java.io.*;

public class FileLocking {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("src/io/file.txt");
		FileLock fl=fos.getChannel().tryLock();
		if(fl!=null){
			System.out.println("Locked File");
			
			TimeUnit.MILLISECONDS.sleep(20000);
			
			
			fl.release();
			System.out.println("Released Lock");
		}
		fos.close();
	}

}
