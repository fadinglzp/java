package lzp;

import java.util.*;

public class CollectionData<T> extends ArrayList<T> {

	public CollectionData(Generator<T> gen, int size) {
		for (; size-- > 0;)
			add(gen.next());
	}
	public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
		return new CollectionData<T>(gen,quantity);
	}
}