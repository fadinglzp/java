package iteration;
import java.util.*;
import testclass.*;
import static lzp.tools.*;
public class testCollectionSequence extends AbstractCollection<TestPet1> {
	
	private TestPet1[] pets = TestPet1.createArray(8);

	@Override
	public Iterator<TestPet1> iterator() {
		// TODO Auto-generated method stub
		
		return new Iterator<TestPet1>(){
			private int index = 0;
			public boolean hasNext(){
				return index<pets.length;
			}
			public TestPet1 next(){
				return pets[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pets.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCollectionSequence c = new testCollectionSequence();
		Iterator<TestPet1> it=c.iterator();
		while(it.hasNext()){
			TestPet1 p = it.next();
			printl(p+" ");
		}
		Collection<TestPet1> pets=c;
		for(TestPet1 pet : pets){
			printl(pet+" ");
		}

	}

}
