package exception;

import static lzp.tools.print;

public class OnOffSwitch {
	private static Switch sw = new Switch();

	public static void f() throws OnOffException1, OnOffException2 {
		throw new OnOffException1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sw.on();
			f();
		//	sw.off();
		} catch (OnOffException1 e) {
			print("OnOffException1");
			throw new RuntimeException();
		} catch (OnOffException2 e2) {
			print("OnOffException2");
		} 
		catch(Exception e){}finally {
			sw.off();
		}
	}
}
