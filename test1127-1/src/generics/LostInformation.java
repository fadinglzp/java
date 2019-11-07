package generics;
import java.util.*;
import static lzp.tools.*;

class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION,MOMEUTUM>{}

public class LostInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob,Fnorkle> map = new HashMap<Frob, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long,Double> p=new Particle<Long,Double>();
		print(Arrays.toString(list.getClass().getTypeParameters()));
	}

}
