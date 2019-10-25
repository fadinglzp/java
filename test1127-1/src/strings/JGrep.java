package strings;
import java.io.File;
import java.util.regex.*;
import lzp.*;
import static lzp.tools.*;

public class JGrep {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] s=new String[]{
				"C:/javaGithub/test1127-1/src/strings/JGrep.java","\\b[Ssct]\\w+"	
		};
		Pattern p=Pattern.compile(s[1]);
		int index =0 ;
		Matcher m = p.matcher("");
		for(String line : TextFile.read(s[0]).split("\n")){
			m.reset(line);
			while(m.find())
			//	System.out.println(index++ +": "+m.group()+": "+m.start()+"--"+m.end() );
			//	print(String.format("%2d: %-10s: %d--%d", index++,m.group(),m.start(),m.end()));
				print(String.format("%4$2s %3$10s %2$s--%1$s", index++,m.group(),m.start(),m.end()));
		}
		File[] files =new File("..").listFiles();
		print(files);

	}

}
