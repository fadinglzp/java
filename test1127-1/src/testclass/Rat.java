package testclass;
import java.util.Random;

import lzp.*;

public class Rat extends Pets implements Generator<Rat> {
	
	public Rat(){}
	public Rat(String s){
		super(s);
	}
	public Rat next() {
		Random rand=new Random();
		return new Rat();
	}

}
