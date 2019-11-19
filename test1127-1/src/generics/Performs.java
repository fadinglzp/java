package generics;

import static lzp.tools.*;

interface Perform {
	void speak();

	void sit();
}

class PerformDog extends Dog implements Perform {
	public void speak() {
		print("Woof");
	}

	public void sit() {
		print("Sitting");
	}

	public void reproduce() {

	}
}

class Robot implements Perform {
	public void speak() {
		print("Click!");
	}

	public void sit() {
		print("Clank!");
	}

	public void oilChange() {

	}
}

class Communicate {
	public static <T extends Perform> void perform(T performer) {
		performer.speak();
		performer.sit();
	}
}

class CommunicateSimply{
	static void perform(Perform performer) {
		performer.speak();
		performer.sit();
	}
}
public class Performs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformDog d = new PerformDog();
		Robot r = new Robot();
		Communicate.perform(d);
		Communicate.perform(r);
		CommunicateSimply.perform(new PerformDog());
		CommunicateSimply.perform(new Robot());
		
	}

}
