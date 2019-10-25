package strings;
import java.util.regex.*;


public class Reflags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p= Pattern.compile("^Java",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
		Matcher m = p.matcher("java has regex\nJavahasregex\nJava has regex\n"
				+ "JAVA has regular expression");
		while(m.find()){
			System.out.println(m.group());
		}

	}

}
