package strings;
import java.util.*;
import static lzp.tools.*;
import java.util.regex.*;
public class ThreatAnalyzer {
	static String threatData="58.27.82.161@02/10/2005\n"+"204.45.234.40@02/11/2005\n"+"58.27.82.161@02/11/2005\n"+
"58.27.82.161@02/11/2005\n"+"58.27.82.161@02/11/2005\n"+"58.27.82.161@02/11/2005\n"+"Next log section with different data format";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(threatData);
//		Scanner sc1 =new Scanner();
		String pattern="(\\d+[.]\\d+[.]\\d+[.]\\d+)@"+"(\\d{2}/\\d{2}/\\d{4})";
		
		while(scanner.hasNext(pattern)){
			scanner.next(pattern);
			MatchResult match=scanner.match();
			String ip=match.group(1);
			String date =match.group(2);
		//	printl(match.group(1));
			print(String.format("Threat on %s from %s", date,ip));
			
		//	print(String.format("Threat on %s from %s\n", date,ip));
		}
		
		/***********
		print("----------------------------------------");
		scanner =new Scanner(threatData);
		while(scanner.hasNext(pattern)){
			scanner.next(pattern);
			MatchResult match=scanner.match();
			String ip=match.group(1);
			String date =match.group(2);
		//	printl(match.group(1));
//			String stmp=String.format("Threat on %s from %s\n", date,ip);
//			printl(stmp);
//			print("----");
//			System.out.format("Threat on %s from %s\n", date,ip);
//			print("----");
			
			printl(String.format("Threat on %s from %s\n", date,ip));
		}
		
	*/

	}

}
