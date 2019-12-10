package io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class GetChannel {
	private static final int BSIZE = 1024;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileChannel fc = new FileOutputStream("src/io/data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text 1".getBytes()));
		fc.close();
		fc = new RandomAccessFile("src/io/data.txt", "rw").getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap("\nSome more 2".getBytes()));
		fc.close();
		fc = new FileInputStream("src/io/data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while(buff.hasRemaining())
			System.out.print((char)buff.get());

	}

}
