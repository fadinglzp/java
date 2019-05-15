package iteration;
import static lzp.tools.*;
import java.util.*;
import testclass.*;


public class testIteratorCollection {
	private TestPet1[] pets= TestPet1.createArray(8);
	
	public Iterator<TestPet1> iterator(){
		return new Iterator<TestPet1>(){
			private int index =0;
			public boolean hasNext(){
				return index < pets.length;
			}
			public TestPet1 next(){
				return pets[index++];
			}
			public void remove(){
				
			}
		};
	}
		
}
