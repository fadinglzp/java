package containers;
import static lzp.tools.*;
import lzp.*;
import lzp.CountingGenerator.Character;

import java.util.*;

class Letters implements Generator<Pair<Integer,String>>,Iterable<Integer>{
	private int size=9;
	private int number=1;
	private char letter='A';
	public Pair<Integer,String> next(){
		return new Pair<Integer,String>(number++,""+letter++);
	}
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){
			public Integer next(){
				return number++;
			}
			public boolean hasNext(){
				return number<size;
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
}






public class MapDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(MapData.map(new Letters(), 11));
		print(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3),8));
		print(MapData.map(new CountingGenerator.Character(), "value",6));
		print(MapData.map(new Letters(), new RandomGenerator.String(3)));
		print(MapData.map(new Letters(), "Pop"));
	}

}
