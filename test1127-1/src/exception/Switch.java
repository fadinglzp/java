package exception;

import static lzp.tools.*;

public class Switch {
	private boolean state = false;

	public boolean read() {
		return state;
	}

	public void on() {
		state = true;
		print(this);
	}

	public void off() {
		state = false;
		print(this);
	}

	public String toString() {
		return state ? "on" : "off";
	}
}

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}

