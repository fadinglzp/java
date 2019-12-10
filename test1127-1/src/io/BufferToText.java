package io;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.io.*;

public class BufferToText {
	private static final int BSIZE=1024;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileChannel fc=new FileOutputStream("src/io/data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		fc=new FileInputStream("src/io/data2.txt").getChannel();
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		buff.rewind();
		String encoding =System.getProperty("file.encoding");
		System.out.println("Decoded using "+encoding+": "+Charset.forName(encoding).decode(buff));
		fc=new FileOutputStream("src/io/data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text2".getBytes("UTF-16BE")));
		fc.close();
		fc=new FileInputStream("src/io/data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		fc=new FileOutputStream("src/io/data2.txt").getChannel();
		buff=ByteBuffer.allocate(24);
		buff.asCharBuffer().put("Some text3");
		fc.write(buff);
		fc.close();
		fc=new FileInputStream("src/io/data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		
	}

}
