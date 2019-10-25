package generics;
import static lzp.tools.*;
class Amphibian{}
class Vehicle{}
public class TupleTest {
	static TwoTuple<String,Integer> f(){
		return new TwoTuple<String,Integer>("hi",42);
	}
	static ThreeTuple<Amphibian,String,Integer> g(){
		return new ThreeTuple<Amphibian,String,Integer>(new Amphibian(),"hi",42);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeTuple<String ,Integer,Amphibian> t=
				new ThreeTuple<String ,Integer,Amphibian>
		(new TwoTuple<String,Integer>("hi",44),new Amphibian());
		
		ThreeTuple<String ,Integer,Amphibian> tt=
				new ThreeTuple<String,Integer,Amphibian>
		(new Amphibian(),new TwoTuple<String,Integer>("hi",45));
		
//		print(t);
//		print(tt);
		print(new ThreeTuple<String,Integer,Amphibian>
		(new Amphibian(),new TwoTuple<String,Integer>("hi",45)));
	}

}
