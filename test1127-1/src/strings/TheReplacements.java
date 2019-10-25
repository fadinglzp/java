package strings;
import java.io.*;
import java.util.regex.*;
import static lzp.tools.*;
import lzp.*;

/*!dsfasdfdasfdgdfs
    *     gsdfgdfsgfdgdsf
 * sdfadfdsfsdfsd!*/
public class TheReplacements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = TextFile.read("C:/javaGithub/test1127-1/src/strings/TheReplacements.java");
		String s = TextFile.read("D:/javatest/TheReplacement.txt");
		print(s);
	Matcher minput =Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(s);
	if(minput.find()){
//		print(minput.group());
		print(minput.group(1));
		s=minput.group(1);
	}
	print();
	print();
	print(s);
	print();
	print();
	s=s.replaceAll(" {2,}", " ");
	print(s);
	s=s.replaceAll("(?m)^ +","");
	print(s);
	s=s.replaceFirst("[aeiou]", "(VOWEL1)");
	print(s);
	StringBuffer sbuf =new StringBuffer();
	Pattern p= Pattern.compile("[aeiou]");
	Matcher m = p.matcher(s);
	while(m.find()){
		m.appendReplacement(sbuf, m.group().toUpperCase());
	}
	m.appendTail(sbuf);
	print(sbuf);
		

	}

}
