package typeinfo;
import java.util.*;
class Part{
	public String toString(){
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<?extends Part>>();
	static{
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	private static Random rand = new Random();
	public static Part createRandom(){
//		int n =rand.nextInt(partFactories.size());
		int i =rand.nextInt(partFactories.size());
		
		int n =(int) (Math.random()*(partFactories.size()));
//		System.out.print(n);
//		System.out.print(i);
		return partFactories.get(n).create();
	}
}
class Filter extends Part{}
class FuelFilter extends Filter{
	public static class Factory implements typeinfo.Factory<FuelFilter>{
		public FuelFilter create(){
			return new FuelFilter();
		}
	}
}
class AirFilter extends Filter{
	public static class Factory implements typeinfo.Factory<AirFilter>{
		public AirFilter create(){
			return new AirFilter();
		}
	}
}
class CabinAirFilter extends Filter{
	public static class Factory implements typeinfo.Factory<CabinAirFilter>{
		public CabinAirFilter create(){
			return new CabinAirFilter();
		}
	}
}
class OilFilter extends Filter{
	public static class Factory implements typeinfo.Factory<OilFilter>{
		public OilFilter create(){
			return new OilFilter();
		}
	}
}
class Belt extends Part{}
class FanBelt extends Belt{
	public static class Factory implements typeinfo.Factory<FanBelt>{
		public FanBelt create(){
			return new FanBelt();
		}
	}
}
class GeneratorBelt extends Belt{
	public static class Factory implements typeinfo.Factory<GeneratorBelt>{
		public GeneratorBelt create(){
			return new GeneratorBelt();
		}
	}
}
class PowerSteeringBelt extends Belt{
	public static class Factory implements typeinfo.Factory<PowerSteeringBelt>{
		public PowerSteeringBelt create(){
			return new PowerSteeringBelt();
		}
	}
}
public class FactoriesRegistered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			System.out.println(Part.createRandom());

	}

}
