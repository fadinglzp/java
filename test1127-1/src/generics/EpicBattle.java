package generics;
import java.util.*;
import static lzp.tools.*;

interface SuperPower{}
interface XRayVision extends SuperPower{
	void seeThrouhWalls();
}
interface SuperHearing extends SuperPower{
	void hearSubtleNoises();
}
interface SuperSmell extends SuperPower{
	void trackBySmell();
}
class SuperHero<POWER extends SuperPower>{
	POWER power;
	SuperHero(POWER power){
		this.power=power;
	}
	POWER gerPower(){
		return power;
	}
}
class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER>{

	SuperSleuth(POWER power) {
		super(power);
		// TODO Auto-generated constructor stub
	}
	void see(){
		power.seeThrouhWalls();
	}
	
}
class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER>{

	CanineHero(POWER power) {
		super(power);
		// TODO Auto-generated constructor stub
	}
	void hear(){
		power.hearSubtleNoises();
	}
	void smell(){
		power.trackBySmell();
	}
}
class SuperHearSmell implements SuperHearing,SuperSmell{

	@Override
	public void trackBySmell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hearSubtleNoises() {
		// TODO Auto-generated method stub
		
	}

}
class DogBoy extends CanineHero<SuperHearSmell>{

	DogBoy() {
		super(new SuperHearSmell());
		// TODO Auto-generated constructor stub
	}
	
}



public class EpicBattle {
	static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
		hero.gerPower().hearSubtleNoises();
	}
	static <POWER extends SuperHearing & SuperSmell>
	void superFind(SuperHero<POWER> hero){
		hero.gerPower().hearSubtleNoises();
		hero.gerPower().trackBySmell();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogBoy dogboy = new DogBoy();
		useSuperHearing(dogboy);
		superFind(dogboy);
		List<? extends SuperHearing> audioBoys;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
