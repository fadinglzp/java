package io;
import java.nio.*;
import static lzp.tools.*;

public class GetData {
	private static final int BSIZE= 24;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb=ByteBuffer.allocate(BSIZE);
		int i=0;
		while(i++<bb.limit()){
			if(bb.get()!=0)
				print("nonzero");
		}
		print("i = "+i);
		bb.rewind();
		bb.asCharBuffer().put("Howdy!");
		char c;
		while((c=bb.getChar())!=0)
			printl(c+" ");
		print();
		bb.rewind();
		bb.asShortBuffer().put((short)471142);
		
		print(bb.getShort());

		bb.rewind();
		bb.asIntBuffer().put(99471142);
		print(bb.getInt());
		bb.rewind();
		bb.asLongBuffer().put(99471142);
		print(bb.getLong());
		bb.rewind();
		bb.asFloatBuffer().put(99471142);
		print(bb.getFloat());
		print(bb);
		bb.rewind();
		bb.asDoubleBuffer().put(99471142);
		print(bb.getDouble());
		print(bb);
		bb.rewind();
		print("----------------------------");
		bb.asLongBuffer().put(99471142);
		bb.position(8);
		bb.asLongBuffer().put(99471142);
		bb.position(16);
		bb.asLongBuffer().put(99471142);
		bb.rewind();
		print(bb);
		print(bb.getLong());
		print(bb.getLong());
		print(bb.getLong());
		print(bb.flip());
		print(bb.getLong());
		print(bb.getLong());
		print(bb.getLong());
		bb.limit(24);
		bb.rewind();
		print(bb);
		print(bb.getLong());
		print(bb.getLong());
		print(bb.getLong());
		
	}

}
