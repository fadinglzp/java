package enumerated;
import static lzp.tools.*;

public enum OverrideConstantSpecific {
	NUT,BOLT,WASHER{
		void f() {
			print("Overriden Method");
		}
	};
	void f() {
		print("default behavior");
	}
	public static void main(String[]args) {
		for(OverrideConstantSpecific ocs : values())
		{
			printl(ocs +": ");
			ocs.f();
		}
	}
}
