package enumerated;
import java.util.*;
import java.text.*;

public enum ConstantSpecificMethod {
	DATE_TIME{
		String getInfo() {
			return DateFormat.getDateInstance().format(new Date());
		}
	},CLASSPATH{
		String getInfo() {
			return System.getenv("ClASSPATH");
		}
	},VERSION{
		String getInfo() {
			return System.getProperty("java.version");
		}
	};
	abstract String getInfo();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(ConstantSpecificMethod csm:values())
			System.out.println(csm.getInfo());
	}

}
