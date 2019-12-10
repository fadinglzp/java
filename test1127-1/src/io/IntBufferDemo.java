package io;
import java.nio.*;
import static lzp.tools.*;

public class IntBufferDemo {
	private static final int BSIZE= 1024;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb=ByteBuffer.allocate(BSIZE);
		IntBuffer ib =bb.asIntBuffer();
		ib.put(new int[]{11,42,47,99,143,811,1016,12});
		System.out.println(ib.get(3));
		ib.put(3,1811);
		print(ib.flip());
		
		while(ib.hasRemaining())
		{
			System.out.println(ib.get());
		}
	}

}
