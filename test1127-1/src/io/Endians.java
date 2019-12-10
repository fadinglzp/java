package io;

import java.nio.*;
import java.util.*;
import static lzp.tools.*;

public class Endians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.wrap(new byte[14]);
		bb.asCharBuffer().put("abcde");
		print(Arrays.toString(bb.array()));
		bb.rewind();
		bb.order(ByteOrder.BIG_ENDIAN);
		bb.asCharBuffer().put("abcdef");
		print(Arrays.toString(bb.array()));
		bb.rewind();
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.asCharBuffer().put("abcdefg");
		print(Arrays.toString(bb.array()));
	}

}
