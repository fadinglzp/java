package testclass;

import java.util.ArrayList;
import java.util.Random;

class GrannySmith extends Apple {
	String name = "GrannySmith";
	public GrannySmith(){
		super.name=name;
	}

}

class Gala extends Apple {
	String name="Gala";
	public Gala(){
		super.name=name;
	}
}

class Fuji extends Apple {
	String name="Fuji";
	public Fuji(){
		super.name=name;
	}
}

class Braeburn extends Apple {
	String name="Braeburn";
	public Braeburn(){
		super.name=name;
	}
}

 public class GenericApple {
	public static Apple[] create(int i){
		Apple[] a=new Apple[i];
		Random rand = new Random();
		for(int t=0;t<i;t++)
		switch (rand.nextInt(4)) {
		case 1:
			a[t] = new GrannySmith();
			break;
		case 2:
			a[t] = new Gala();
			break;
		case 3:
			a[t] = new Fuji();
			break;
		default:
			a[t] = new Braeburn();
			break;
		}
		return a;
	}
	public static Apple getApple() {
		Apple a = null;
		Random rand = new Random();
		switch (rand.nextInt(4)) {
		case 1:
			a = new GrannySmith();
			break;
		case 2:
			a = new Gala();
			break;
		case 3:
			a = new Fuji();
			break;
		default:
			a = new Braeburn();
			break;
		}

		return a;
	}

	public static ArrayList<Apple> getApple(int i) {
		ArrayList<Apple> a = new ArrayList<Apple>();
		Random rand = new Random();
		for (int t = 0; t < i; t++)
			switch (rand.nextInt(4)) {
			case 1:
				a.add(new GrannySmith());
				break;
			case 2:
				a.add(new Gala());
				break;
			case 3:
				a.add(new Fuji());
				break;
			default:
				a.add(new Braeburn());
				break;
			}
		return a;
	}
}
