package strings;
import java.util.regex.*;
import static lzp.tools.*;

public class Groups {
	static public final String POEM="Twas brilling, and the slithy toves\n"
			+ "Did gyre and gimble in the wabe.\n"
			+ "All mimsy were the borogoves,\n";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher m=Pattern.compile("(?m)(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
//		Matcher m=Pattern.compile("(?m)(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+\\S+$").matcher(POEM);
		while(m.find()){
			print(m.group());
			print(m.start()+"-"+(m.end()-1));
			for(int j=0;j<=m.groupCount();j++){
				int i=m.groupCount();
				String stmp =m.group(j);
				
				printl("["+m.group(j)+"]");
			}
			print();
		}
	}

}
