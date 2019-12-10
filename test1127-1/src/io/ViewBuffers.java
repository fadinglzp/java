package io;

import java.nio.*;
import static lzp.tools.*;

public class ViewBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, 0, 0, 0, 'a' });
		bb.rewind();
		printl("Byte Buffer ");
		while (bb.hasRemaining())
			printl(bb.position() + " -> " + bb.get() + ", ");
		print();
		CharBuffer cb = ((ByteBuffer) bb.rewind()).asCharBuffer();
		printl("Char Buffer ");
		while (cb.hasRemaining())
			printl(cb.position() + " -> " + cb.get() + ", ");
		print();
		FloatBuffer fb=((ByteBuffer)bb.rewind()).asFloatBuffer();
		printl("Float Buffer ");
		while(fb.hasRemaining())
			printl(fb.position()+" -> "+fb.get()+", ");
		print();
		IntBuffer ib=((ByteBuffer)bb.rewind()).asIntBuffer();
		printl("Int Buffer ");
		while(ib.hasRemaining())
			printl(ib.position()+" -> "+ib.get()+", ");
		print();
		LongBuffer lb=((ByteBuffer)bb.rewind()).asLongBuffer();
		printl("Long Buffer ");
		while(lb.hasRemaining())
			printl(lb.position()+" -> "+lb.get()+", ");
		print();
		ShortBuffer sb=((ByteBuffer) bb.rewind()).asShortBuffer();
		printl("Short Buffer ");
		while(sb.hasRemaining())
			printl(sb.position()+" -> "+sb.get()+", ");
		print();
		DoubleBuffer db=((ByteBuffer) bb.rewind()).asDoubleBuffer();
		printl("Double Buffer ");
		while(db.hasRemaining())
			printl(db.position()+" -> "+db.get()+", ");
	}

}
